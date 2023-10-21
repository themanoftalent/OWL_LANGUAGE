package testowlprj;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLMutableOntology;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.RemoveAxiom;
import org.semanticweb.owlapi.reasoner.NodeSet;

public class OntologyFunctions {

    public static final File localLocation_IRI = new File("c://ONTOLOGIES/Test.owl");
    public static final IRI Ont_Base_IRI = IRI.create("http://www.aydin.edu.tr/ontologies");
    OWLOntologyManager m = OWLManager.createOWLOntologyManager();
    OWLDataFactory f = OWLManager.getOWLDataFactory();
    OWLOntology o = null;

    public void saveClassAssertion(String clsnmae, String ind) {

        try {
            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLClass cust = f.getOWLClass(IRI.create(Ont_Base_IRI + "#" + clsnmae));
            OWLNamedIndividual tc = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + ind));
            OWLClassAssertionAxiom ax = f.getOWLClassAssertionAxiom(cust, tc);
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

    public void SaveDTPDouble(String domindv, String dprop, double doubledeger) {
        try {
            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, doubledeger);
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

    public List getAnObjectProperty(String id, String OTP) {
        List<String> list = new ArrayList<String>();
        try {
            o = m.loadOntologyFromOntologyDocument(localLocation_IRI);
            PelletReasoner r = PelletReasonerFactory.getInstance().createReasoner(o);
            OWLNamedIndividual individual = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + id));
            OWLObjectProperty op = f.getOWLObjectProperty(IRI.create(Ont_Base_IRI + "#" + OTP));
            NodeSet<OWLNamedIndividual> value = r.getObjectPropertyValues(individual, op);

            for (OWLNamedIndividual nmindividuals : value.getFlattened()) {
                String str = nmindividuals.toString();
                str = StringRemoval(str); //Remove str IRI prefix
                if (str != null) {
                    list.add(str);
                }
            }

            m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
        System.out.println(list);
        return list;
    }

    public String StringRemoval(String str) {
        str = str.substring(str.indexOf('#') + 1, str.length() - 1);
        return str;
    }

    public void removeClassAssertion(String clsnmae, String ind)  {
        try {
            o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLClass cust = f.getOWLClass(IRI.create(Ont_Base_IRI + "#" + clsnmae));
            OWLNamedIndividual tc = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + ind));
            OWLClassAssertionAxiom ax = f.getOWLClassAssertionAxiom(cust, tc);
            // save in OWL/XML format
            if (o instanceof OWLMutableOntology) {
                if (o.containsAxiom(ax)) {
                    m.applyChange(new RemoveAxiom(o, ax));
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            } m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }   
    }

public void removeOTP(String domindv, String oprop, String rangeindv) {
        try {
           o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual dom = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLNamedIndividual range = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + rangeindv));
            OWLObjectProperty oproperty = f.getOWLObjectProperty(IRI.create(Ont_Base_IRI + "#" + oprop));
            OWLObjectPropertyAssertionAxiom ax = f.getOWLObjectPropertyAssertionAxiom(oproperty, dom, range);
            if (o instanceof OWLMutableOntology) {
                if (o.containsAxiom(ax)) {
                    RemoveAxiom rax = new RemoveAxiom(o, ax);
                    m.applyChange(rax);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            } m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }
public void removeDTPString(String domindv, String dprop, String strdeger) {
        try {
           o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, strdeger);
            if (o instanceof OWLMutableOntology) {
                if (o.containsAxiom(ax)) {
                    RemoveAxiom rax = new RemoveAxiom(o, ax);
                    m.applyChange(rax);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            } m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }
public void removeDTPInteger(String domindv, String dprop, int intdeger) {
        try {
           o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, intdeger);
            if (o instanceof OWLMutableOntology) {
                if (o.containsAxiom(ax)) {
                    RemoveAxiom rax = new RemoveAxiom(o, ax);
                    m.applyChange(rax);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            }
 m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }
public void removeDTPDouble(String domindv, String dprop, double doubledeger) {
        try {
           o = m.loadOntologyFromOntologyDocument(IRI.create(localLocation_IRI));
            OWLNamedIndividual domain = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + domindv));
            OWLDataProperty dproperty = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#" + dprop));
            OWLDataPropertyAssertionAxiom ax = f.getOWLDataPropertyAssertionAxiom(dproperty, domain, doubledeger);
            if (o instanceof OWLMutableOntology) {
                if (o.containsAxiom(ax)) {
                    RemoveAxiom rax = new RemoveAxiom(o, ax);
                    m.applyChange(rax);
                    m.saveOntology(o, new OWLXMLOntologyFormat(), IRI.create(localLocation_IRI));
                }
            }
 m.removeOntology(o);
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
       OntologyFunctions obj = new OntologyFunctions();
        obj.removeClassAssertion("CONSUMER","TC1");
        obj.removeOTP("TC1", "HAS_ACTIVITY_LEVEL_VALUE", "ORTA");
        System.out.println("\n");
    }
}
