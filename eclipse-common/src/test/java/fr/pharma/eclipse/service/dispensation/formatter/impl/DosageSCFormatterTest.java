package fr.pharma.eclipse.service.dispensation.formatter.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import fr.pharma.eclipse.domain.model.dispensation.ConseilDispensation;
import fr.pharma.eclipse.domain.model.patient.Inclusion;
import fr.pharma.eclipse.domain.model.patient.Patient;
import fr.pharma.eclipse.domain.model.prescription.Prescription;
import fr.pharma.eclipse.domain.model.prescription.ProduitPrescrit;
import fr.pharma.eclipse.domain.model.produit.Conditionnement;
import fr.pharma.eclipse.utils.AbstractEclipseJUnitTest;
import fr.pharma.eclipse.utils.message.MessageBuilder;

/**
 * Test du formatter DoseFormatter.
 * @author Netapsys
 * @version $Revision$ $Date$
 */
public class DosageSCFormatterTest extends AbstractEclipseJUnitTest {

    /**
     * Formatter à tester.
     */
    private DosageSCFormatter formatter;

    /**
     * Builder de messages.
     */
    private MessageBuilder mockedBuilder;

    /**
     * {@inheritDoc}
     */
    @Override
    public void setUp() {
        this.mockedBuilder = Mockito.mock(MessageBuilder.class);
        this.formatter = new DosageSCFormatter();
        this.formatter.setMessageBuilder(this.mockedBuilder);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void tearDown() {
        this.formatter = null;
        this.mockedBuilder = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Test
    public void testInit() {
        Assert.assertNotNull(this.formatter);
        Assert.assertNotNull(this.mockedBuilder);
    }

    /**
     * Test de la méthode format.
     */
    @Test
    public void testFormat() {
        final ConseilDispensation conseil = new ConseilDispensation();
        conseil.setNbASortir(10);
        final ProduitPrescrit produitPrescrit = new ProduitPrescrit();
        final Conditionnement conditionnement = new Conditionnement();
        conditionnement.setLibelle("boite");
        produitPrescrit.setConditionnement(conditionnement);
        conseil.setProduitPrescrit(produitPrescrit);
        produitPrescrit.setPrescription(new Prescription());
        produitPrescrit.getPrescription().setInclusion(new Inclusion());
        final Patient patient = Mockito.mock(Patient.class);
        produitPrescrit.getPrescription().getInclusion().setPatient(patient);
        Mockito.when(patient.getSurface()).thenReturn(10.0);
        Mockito.when(this.mockedBuilder.getMessage(Matchers.anyString())).thenReturn("Aide : ");
        Mockito.when(this.mockedBuilder.getMessage(Matchers.anyString(), Matchers.any(Object[].class))).thenReturn("10 kg").thenReturn("10 doses").thenReturn("frequence")
                .thenReturn("10");
        Assert.assertEquals("Aide : 10 kg - 10 doses - frequence => 10", this.formatter.format(conseil));
    }
}
