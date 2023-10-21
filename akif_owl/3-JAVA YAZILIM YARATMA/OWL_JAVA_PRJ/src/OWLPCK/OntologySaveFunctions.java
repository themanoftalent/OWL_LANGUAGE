package OWLPCK;

import java.io.File;
import org.semanticweb.owlapi.*;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.model.*;

public class OntologySaveFunctions {

    public static final File localLocation_IRI = new File("/Users/duygucelik/Desktop/SW_HIZLI_ANLATIM/3-JAVA YAZILIM YARATMA/OWL_FILE/AllergyOntology.owl");
    public static final IRI Ont_Base_IRI = IRI.create("http://www.aydin.edu.tr/2016/ontologies");

    OWLOntologyManager m = OWLManager.createOWLOntologyManager();
    OWLDataFactory f = OWLManager.getOWLDataFactory();
    OWLOntology o = null;

    public void saveClassAssertion(String clsnmae, String ind) {

        try {
            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLClass xcls = f.getOWLClass(IRI.create(Ont_Base_IRI + "#" + clsnmae.trim()));
            OWLNamedIndividual indv = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + ind.trim()));

            OWLClassAssertionAxiom ax = f.getOWLClassAssertionAxiom(xcls, indv);
            // save in OWL/XML format
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            }
            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }

    public void SAVEOTP(String indDomain, String OTP, String indRange) {
        try {
            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));

            OWLNamedIndividual dom = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + indDomain));
            OWLNamedIndividual range = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + indRange));
            OWLObjectProperty oproperty = f.getOWLObjectProperty(IRI.create(Ont_Base_IRI + "#" + OTP));

            OWLObjectPropertyAssertionAxiom ax = f.getOWLObjectPropertyAssertionAxiom(oproperty, dom, range);
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            }
            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }

    public void SaveDTPString(String indDomain, String DTP, String str) {
        try {

            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + indDomain));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + DTP));

            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, str);
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            }
            m.removeOntology(o);

        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }
    public void SaveDTPInteger(String domindv, String dprop, int intdeger) {
        try {
            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, intdeger);
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            }
            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }
    public void SaveDTPDouble(String domindv, String dprop, double ddeger) {
        try {
            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, ddeger);
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            }
            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        OntologySaveFunctions testobj = new OntologySaveFunctions();

        testobj.saveClassAssertion("Person", "TC_005");
        testobj.SAVEOTP("TC_005", "hasAllergy", "Lactose");
        testobj.SAVEOTP("TC_005", "ChooseProduct", "EAN_00001");
        testobj.SaveDTPString("TC_005", "hasName", "Cansu");
        testobj.SaveDTPInteger("TC_005", "hasAge", 36);
    }

}
