package testowlprj;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.model.*;

public class TESTOWLPRJ {

    public static final IRI localLocation_IRI = IRI.create("file:/ONTOLOGIES/Test.owl");
    public static final IRI Ont_Base_IRI = IRI.create("http://www.aydin.edu.tr/ontologies/");

    OWLOntologyManager m = OWLManager.createOWLOntologyManager();
    OWLDataFactory f = OWLManager.getOWLDataFactory();
    OWLOntology o = null;

    public void AddClassIndAssertion(String cls, String ind) {
        try {
            o = m.loadOntologyFromOntologyDocument(localLocation_IRI);
            OWLClass clsname = f.getOWLClass(IRI.create(Ont_Base_IRI + "#" + cls));
            OWLNamedIndividual indvname = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + ind));
            OWLClassAssertionAxiom axiom = f.getOWLClassAssertionAxiom(clsname, indvname);
            AddAxiom addAxiom = new AddAxiom(o, axiom);
            m.applyChange(addAxiom);
            m.saveOntology(o, new OWLXMLOntologyFormat(), localLocation_IRI);
            m.removeOntology(o);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void saveObjPropertyAssertion(String domindv, String oprop, String rangeindv) {
        try {
            o = m.loadOntologyFromOntologyDocument(localLocation_IRI);
            OWLNamedIndividual dom = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLNamedIndividual range = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + rangeindv));
            OWLObjectProperty oproperty = f.getOWLObjectProperty(IRI.create(Ont_Base_IRI + "#" + oprop));
            OWLObjectPropertyAssertionAxiom ax = f.getOWLObjectPropertyAssertionAxiom(oproperty, dom, range);
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), localLocation_IRI);
                }
            }
            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }

    public void saveStrDataPropertyAssertion(String domindv, String dprop, String strdeger) {
        try {
            o = m.loadOntologyFromOntologyDocument(localLocation_IRI);
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, strdeger);
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), localLocation_IRI);
                }
            }
            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }
    
        public void saveDblDataPropertyAssertion(String domindv, String dprop, double deger) {
        try {
            o = m.loadOntologyFromOntologyDocument(localLocation_IRI);
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, deger);
            if (o instanceof OWLMutableOntology) {
                if (!o.containsAxiom(ax)) {
                    AddAxiom addAx = new AddAxiom(o, ax);
                    m.applyChange(addAx);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), localLocation_IRI);
                }
            }
            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TESTOWLPRJ obj = new TESTOWLPRJ();
//        obj.AddClassIndAssertion("Country", "USA");
//        obj.saveObjPropertyAssertion("TC1", "hasBornCountry", "TR");
//        obj.saveStrDataPropertyAssertion("TC1", "hasName", "Ayse Guler");
        obj.saveDblDataPropertyAssertion("TC1", "hasWeight", 67.3);
    }

}
