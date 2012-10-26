package fr.pharma.eclipse.domain.model.essai.detail.administratif.document;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import fr.pharma.eclipse.domain.enums.document.TypeDocumentEssai;
import fr.pharma.eclipse.domain.enums.document.TypeDocumentProtocole;

/**
 * Bean métier représentant un document relatif au protocole de l'essai clinique.
 
 * @version $Revision$ $Date$
 */
@Entity
@DiscriminatorValue("PROTOCOLE")
public class DocumentProtocole
    extends DocumentAdministratif
{

    /**
     * Serial ID.
     */
    private static final long serialVersionUID = 3552420140396626957L;

    /**
     * Version.
     */
    @Column(name = "version")
    private String version;

    /**
     * Type de document protocole (Protocole ou amendement).
     */
    @Column(name = "typeDocumentProtocole")
    @Enumerated(EnumType.STRING)
    private TypeDocumentProtocole typeDocumentProtocole;

    /**
     * Constructeur par défaut.
     */
    public DocumentProtocole()
    {
        this.setType(TypeDocumentEssai.PROTOCOLE);
    }

    /**
     * Getter pour version.
     * @return Le version
     */
    public String getVersion()
    {
        return this.version;
    }

    /**
     * Setter pour version.
     * @param version Le version à écrire.
     */
    public void setVersion(final String version)
    {
        this.version = version;
    }

    /**
     * Getter pour typeDocumentProtocole.
     * @return Le typeDocumentProtocole
     */
    public TypeDocumentProtocole getTypeDocumentProtocole()
    {
        return this.typeDocumentProtocole;
    }

    /**
     * Setter pour typeDocumentProtocole.
     * @param typeDocumentProtocole Le typeDocumentProtocole à écrire.
     */
    public void setTypeDocumentProtocole(final TypeDocumentProtocole typeDocumentProtocole)
    {
        this.typeDocumentProtocole = typeDocumentProtocole;
    }

}
