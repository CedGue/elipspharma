package fr.pharma.eclipse.component.produit.builder.impl;

import java.io.Serializable;

import fr.pharma.eclipse.component.produit.builder.UnitePrescriptionBuilder;
import fr.pharma.eclipse.domain.model.produit.Conditionnement;

/**
 * Classe en charge de construire l'unité de prescription pour un conditionnement ayant comme mode
 * de prescription : Numero de traitement.
 
 * @version $Revision$ $Date$
 */
public class GaleniqueBuilder
    implements UnitePrescriptionBuilder, Serializable
{

    /**
     * SerialVersionUID.
     */
    private static final long serialVersionUID = 2605719998911079116L;

    /**
     * {@inheritDoc}
     */
    @Override
    public void build(final Conditionnement conditionnement)
    {
        conditionnement.setUnitePrescription("Galénique");
    }

}
