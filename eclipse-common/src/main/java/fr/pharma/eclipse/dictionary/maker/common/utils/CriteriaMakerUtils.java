package fr.pharma.eclipse.dictionary.maker.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.Restrictions;

import fr.pharma.eclipse.domain.model.common.BeanObject;

/**
 * Classe utilitaire pour la construction des makers de recherche.
 
 * @version $Revision$ $Date$
 */
public final class CriteriaMakerUtils
{
    /**
     * Constructeur.
     */
    protected CriteriaMakerUtils()
    {
    }

    /**
     * Constante %.
     */
    public static final String MODULO = "%";

    /**
     * Méthode en charge d'ajouter un critère sur le Criteria Hibernate sur un nom de champ.
     * Passage de la valeur du champ.
     * @param criteria Criteria Hibernate sur lequel est ajouté une restriction.
     * @param field Nom du champ sur lequel porte la restriction.
     * @param value Valeur de la restriction.
     */
    public static void addCritere(final Criteria criteria,
                                  final String field,
                                  final Object value)
    {
        criteria.add(Restrictions.eq(field,
                                     value));
    }

    /**
     * Méthode en charge d'ajouter un critère sur le Criteria Hibernate sur un nom de champ, à une
     * jonction.
     * @param junction Jonction hibernate sur laquelle ajouter le critère.
     * @param field Nom du champ sur lequel porte la restriction.
     * @param value Valeur de la restriction.
     */
    public static void addCritere(final Junction junction,
                                  final String field,
                                  final Object value)
    {
        junction.add(Restrictions.eq(field,
                                     value));
    }

    /**
     * Méthode en charge d'ajouter un critère de type IN sur le Criteria Hibernate sur un nom de
     * champ.
     * @param criteria Criteria Hibernate sur lequel est ajouté une restriction.
     * @param field Nom du champ sur lequel porte la restriction.
     * @param values Valeurs de la restriction.
     */
    public static void addInCritere(final Criteria criteria,
                                    final String field,
                                    final Object[] values)
    {
        criteria.add(Restrictions.in(field,
                                     values));
    }

    /**
     * Méthode en charge d'ajouter un critère de type IN sur le Criteria Hibernate sur un nom de
     * champ, sur une jonction.
     * @param jonction Jonction hibernate sur laquelle est ajoutée une restriction.
     * @param field Nom du champ sur lequel porte la restriction.
     * @param values Valeurs de la restriction.
     */
    public static void addInCritere(final Junction jonction,
                                    final String field,
                                    final Long[] values)
    {
        jonction.add(Restrictions.in(field,
                                     values));
    }

    /**
     * Méthode en charge d'ajouter un critère sur le Criteria Hibernate portant sur un nom de
     * champ. Passage de la valeur du champ. Requête SQL like non case sensitive + accents.
     * @param criteria Criteria Hibernate sur lequel est ajouté une restriction.
     * @param field Nom du champ sur lequel porte la restriction.
     * @param value Valeur de la restriction.
     */
    public static void addSqlCritere(final Criteria criteria,
                                     final String field,
                                     final String value)
    {
        final String strCrit = CriteriaMakerUtils.transformForSql(value);
        criteria.add(Restrictions.sqlRestriction("upper("
                                                         + field
                                                         + ") similar to ?",
                                                 strCrit,
                                                 Hibernate.STRING));
    }

    /**
     * Méthode en charge d'ajouter un critère sur une Disjunction Hibernate portant sur un nom de
     * champ. Passage de la valeur du champ. Requête SQL like non case sensitive + accents.
     * @param dij Disjunction Hibernate sur lequel est ajouté une restriction.
     * @param field Nom du champ sur lequel porte la restriction.
     * @param value Valeur de la restriction.
     */
    public static void addSqlCritere(final Disjunction dij,
                                     final String field,
                                     final String value)
    {
        final String strCrit = CriteriaMakerUtils.transformForSql(value);
        dij.add(Restrictions.sqlRestriction("upper("
                                                    + field
                                                    + ") similar to ?",
                                            strCrit,
                                            Hibernate.STRING));
    }

    /**
     * Méthode en charge de construire la liste des identifiants techniques de la liste d'objets.
     * @param beans Liste des objet métiers.
     * @return La liste des identifiants techniques.
     */
    @SuppressWarnings("unchecked")
    public static List<Integer> prepareObjectIds(final Collection<? extends BeanObject> beans)
    {
        final List ids = new ArrayList(beans);
        CollectionUtils.transform(ids,
                                  new Transformer() {

                                      @Override
                                      public Object transform(final Object input)
                                      {
                                          return ((BeanObject) input).getId();
                                      }
                                  });
        return ids;
    }

    /**
     * Méthode en charge de transformer une chaîne en chaîne compatible<br/>
     * pour une recherche SQL qui ne prend pas en compte la casse et les accents.
     * @param string Contenu de la chaîne à transformer.
     * @return Chaîne transformée.
     */
    public static String transformForSql(final String string)
    {
        // Mise en majuscules de la chaîne
        final String str = string.toUpperCase();
        String retour = StringUtils.EMPTY;

        for (int i = 0; i < str.length(); i++)
        {
            final char car = str.charAt(i);

            final String retourA = CriteriaMakerUtils.handleA(car);
            if (StringUtils.isNotEmpty(retourA))
            {
                retour += retourA;
                continue;
            }

            final String retourE = CriteriaMakerUtils.handleE(car);
            if (StringUtils.isNotEmpty(retourE))
            {
                retour += retourE;
                continue;
            }

            final String retourI = CriteriaMakerUtils.handleI(car);
            if (StringUtils.isNotEmpty(retourI))
            {
                retour += retourI;
                continue;
            }

            final String retourO = CriteriaMakerUtils.handleO(car);
            if (StringUtils.isNotEmpty(retourO))
            {
                retour += retourO;
                continue;
            }

            final String retourU = CriteriaMakerUtils.handleU(car);
            if (StringUtils.isNotEmpty(retourU))
            {
                retour += retourU;
                continue;
            }

            retour += car;
        }
        return CriteriaMakerUtils.MODULO.concat(retour.concat(CriteriaMakerUtils.MODULO));
    }

    /**
     * Méthode en charge de traiter les caractères A, À, Ä et Â.
     * @param car Caractère.
     * @return Chaîne pour le caractère.
     */
    protected static String handleA(final char car)
    {
        switch (car) {
            case 'A' :
                return "[AÀÄÂaàäâ]";
                // Le À
            case '\u00C0' :
                return "[AÀÄÂaàäâ]";
                // Le Ä
            case '\u00C4' :
                return "[AÀÄÂaàäâ]";
                // Le Â
            case '\u00C2' :
                return "[AÀÄÂaàäâ]";
            default :
                return StringUtils.EMPTY;
        }
    }

    /**
     * Méthode en charge de traiter les caractères E, É, È, Ê et Ë.
     * @param car Caractère.
     * @return Chaîne pour le caractère.
     */
    protected static String handleE(final char car)
    {
        switch (car) {
            case 'E' :
                return "[EÉÈÊËeéèêë]";
                // Le É
            case '\u00C9' :
                return "[EÉÈÊËeéèêë]";
                // Le È
            case '\u00C8' :
                return "[EÉÈÊËeéèêë]";
                // Le Ê
            case '\u00CA' :
                return "[EÉÈÊËeéèêë]";
                // Le Ë
            case '\u00CB' :
                return "[EÉÈÊËeéèêë]";
            default :
                return StringUtils.EMPTY;
        }
    }

    /**
     * Méthode en charge de traiter les caractères I, Î et Ï.
     * @param car Caractère.
     * @return Chaîne pour le caractère.
     */
    protected static String handleI(final char car)
    {
        switch (car) {
            case 'I' :
                return "[IÎÏiîï]";
                // Le Î
            case '\u00CE' :
                return "[IÎÏiîï]";
                // Le Ï
            case '\u00CF' :
                return "[IÎÏiîï]";
            default :
                return StringUtils.EMPTY;
        }
    }

    /**
     * Méthode en charge de traiter les caractères O, Ô et Ö.
     * @param car Caractère.
     * @return Chaîne pour le caractère.
     */
    protected static String handleO(final char car)
    {
        switch (car) {
            case 'O' :
                return "[OÔÖoôö]";
                // Le Ô
            case '\u00D4' :
                return "[OÔÖoôö]";
                // Le Ö
            case '\u00D6' :
                return "[OÔÖoôö]";
            default :
                return StringUtils.EMPTY;
        }
    }

    /**
     * Méthode en charge de traiter les caractères U, Û et Ü.
     * @param car Caractère.
     * @return Chaîne pour le caractère.
     */
    protected static String handleU(final char car)
    {
        switch (car) {
            case 'U' :
                return "[UÛÜuûü]";
                // Le Û
            case '\u00DB' :
                return "[UÛÜuûü]";
                // Le Ü
            case '\u00DC' :
                return "[UÛÜuûü]";
            default :
                return StringUtils.EMPTY;
        }
    }

}
