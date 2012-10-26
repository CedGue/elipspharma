package fr.pharma.eclipse.dictionary.maker.stock;

import java.util.Calendar;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import fr.pharma.eclipse.dictionary.maker.common.AbstractCriteriaMaker;
import fr.pharma.eclipse.dictionary.maker.common.utils.CriteriaMakerUtils;
import fr.pharma.eclipse.domain.criteria.common.SearchCriteria;
import fr.pharma.eclipse.domain.criteria.stock.MvtStockSearchCriteria;
import fr.pharma.eclipse.domain.enums.stock.TypeMvtStock;
import fr.pharma.eclipse.utils.constants.EclipseConstants;

/**
 * Artisan de recherche pour les mouvements de stock.
 
 * @version $Revision$ $Date$
 */
public class MvtStockSearchCriteriaMaker
    extends AbstractCriteriaMaker
{
    /**
     * Serial ID.
     */
    private static final long serialVersionUID = -8442390856641648306L;

    /**
     * Constructeur par défaut.
     */
    public MvtStockSearchCriteriaMaker()
    {
        super(MvtStockSearchCriteria.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void transform(final Criteria criteria,
                          final SearchCriteria searchCrit)
    {
        final MvtStockSearchCriteria crit = (MvtStockSearchCriteria) searchCrit;
        // Essai
        if (crit.getEssai() != null)
        {
            CriteriaMakerUtils.addCritere(criteria,
                                          "essai",
                                          crit.getEssai());
        }
        // Pharmacie
        if (crit.getPharmacie() != null)
        {
            CriteriaMakerUtils.addCritere(criteria,
                                          "pharmacie",
                                          crit.getPharmacie());
        }
        // Stockage
        if (crit.getStockage() != null)
        {
            CriteriaMakerUtils.addCritere(criteria,
                                          "produit",
                                          crit.getStockage().getDetailLogistique().getProduit());
        }

        // Conditionnement
        if (crit.getConditionnement() != null)
        {
            CriteriaMakerUtils.addCritere(criteria,
                                          "conditionnement",
                                          crit.getConditionnement());
        }

        // Mode de prescriptiion
        if (crit.getModePrescription() != null)
        {
            final Criteria conditionnementCriteria = criteria.createCriteria("conditionnement");
            CriteriaMakerUtils.addCritere(conditionnementCriteria,
                                          "modePrescription",
                                          crit.getConditionnement());
        }

        // Type de mouvement
        if (crit.getTypeMouvement() != null)
        {
            CriteriaMakerUtils.addCritere(criteria,
                                          "type",
                                          crit.getTypeMouvement());
        }
        // Types de mouvement
        if (crit.getTypesMouvement() != null)
        {
            CriteriaMakerUtils.addInCritere(criteria,
                                            "type",
                                            crit.getTypesMouvement());
        }
        // Numéro de lot
        if (StringUtils.isNotEmpty(crit.getNumLot()))
        {
            CriteriaMakerUtils.addSqlCritere(criteria,
                                             "numLot",
                                             crit.getNumLot());
        }
        // Numéro de lot
        if (StringUtils.isNotEmpty(crit.getNumTraitement()))
        {
            CriteriaMakerUtils.addSqlCritere(criteria,
                                             "numTraitement",
                                             crit.getNumTraitement());
        }

        // Numéro ordonnancier
        if (crit.getNotNullNumOrdonnancier() != null
            && crit.getNotNullNumOrdonnancier())
        {
            criteria.add(Restrictions.isNotNull("numOrdonnancier"));
        }

        // stérile
        if (crit.getSterile() != null)
        {
            CriteriaMakerUtils.addCritere(criteria,
                                          "sterile",
                                          crit.getSterile());
        }

        this.handleCriteriaForDispensationGlobale(criteria,
                                                  crit);

        // Critères sur produit
        this.handleCriteriaProduit(criteria,
                                   crit);

        // Critères sur date
        this.handleCriteriaDate(criteria,
                                crit);
    }
    /**
     * @param criteria
     * @param crit
     */
    private void handleCriteriaForDispensationGlobale(final Criteria criteria,
                                                      final MvtStockSearchCriteria crit)
    {
        if (crit.getTypeMouvement() != null
            && crit.getTypeMouvement().equals(TypeMvtStock.DOTATION))
        {
            if (crit.getService() != null)
            {
                CriteriaMakerUtils.addCritere(criteria,
                                              "dotation.service",
                                              crit.getService());
            }

            if (crit.getDispenseNominativement() != null)
            {
                criteria.add(Restrictions.ltProperty("quantiteDispensee",
                                                     "quantite"));
            }
        }

    }

    /**
     * Méthode en charge de gérer les critères par rapport au produit.
     * @param criteria Criteria Hibernate.
     * @param crit Critère de recherche sur Mouvement.
     */
    private void handleCriteriaProduit(final Criteria criteria,
                                       final MvtStockSearchCriteria crit)
    {
        // Produit
        if (crit.getProduit() != null)
        {
            CriteriaMakerUtils.addCritere(criteria,
                                          "produit",
                                          crit.getProduit());
        }
        // Dénomination du produit
        if (StringUtils.isNotEmpty(crit.getDenominationProduit()))
        {
            final Criteria critProduit = criteria.createCriteria("produit",
                                                                 "produit");
            CriteriaMakerUtils.addSqlCritere(critProduit,
                                             "{alias}.denomination",
                                             crit.getDenominationProduit());
        }
    }

    /**
     * Méthode en charge de gérer les critères par rapport à la date de création des mouvements de
     * stock.
     * @param criteria Criteria Hibernate.
     * @param crit Critère de recherche sur Mouvement.
     */
    private void handleCriteriaDate(final Criteria criteria,
                                    final MvtStockSearchCriteria crit)
    {
        // Date de début
        if (crit.getDateDebut() != null)
        {
            criteria.add(Restrictions.ge("dateCreation",
                                         crit.getDateDebut()));
        }

        // Date de fin
        if (crit.getDateFin() != null)
        {
            final Calendar fin = Calendar.getInstance(EclipseConstants.LOCALE);
            fin.setTime(crit.getDateFin().getTime());
            // Ajout d'un jour
            fin.add(Calendar.DAY_OF_MONTH,
                    1);
            criteria.add(Restrictions.le("dateCreation",
                                         fin));
        }
    }

}
