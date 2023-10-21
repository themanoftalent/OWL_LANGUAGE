package testowlprj;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDArgument;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLVariable;
import org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary;

public class CreateRulesFrame extends javax.swing.JFrame {

    public static final IRI localLocation_IRI = IRI.create("file:/ONTOLOGIES/Test.owl");
    public static final IRI Ont_Base_IRI = IRI.create("http://www.aydin.edu.tr/ontologies/");
    OWLOntologyManager m = OWLManager.createOWLOntologyManager();
    OWLDataFactory f = OWLManager.getOWLDataFactory();
    OWLOntology o = null;

    public CreateRulesFrame() {
        initComponents();
        String tcno;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        yastxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        kilotxt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        AKTIVITECB = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        ALLERGYCB = new javax.swing.JComboBox();
        ADDBTN = new javax.swing.JButton();
        EXITBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ONERMECB = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("YAŞ");
        jLabel18.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel18.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel18.setPreferredSize(new java.awt.Dimension(300, 40));

        yastxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yastxt.setMaximumSize(new java.awt.Dimension(300, 40));
        yastxt.setMinimumSize(new java.awt.Dimension(300, 40));
        yastxt.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("KİLO");
        jLabel19.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel19.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel19.setPreferredSize(new java.awt.Dimension(300, 40));

        kilotxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kilotxt.setMaximumSize(new java.awt.Dimension(300, 40));
        kilotxt.setMinimumSize(new java.awt.Dimension(300, 40));
        kilotxt.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("AKTİVİTE DÜZEY DEĞERİ");
        jLabel23.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel23.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel23.setName(""); // NOI18N
        jLabel23.setPreferredSize(new java.awt.Dimension(300, 40));

        AKTIVITECB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AKTIVITECB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YAVAS", "ORTA", "HIZLI" }));
        AKTIVITECB.setMaximumSize(new java.awt.Dimension(300, 40));
        AKTIVITECB.setMinimumSize(new java.awt.Dimension(300, 40));
        AKTIVITECB.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("ALERJİ ADI");
        jLabel27.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel27.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel27.setPreferredSize(new java.awt.Dimension(300, 40));

        ALLERGYCB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ALLERGYCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LAKTOZ", "GLUTEN", "BALIK", "YUMURTA" }));
        ALLERGYCB.setMaximumSize(new java.awt.Dimension(300, 40));
        ALLERGYCB.setMinimumSize(new java.awt.Dimension(300, 40));
        ALLERGYCB.setPreferredSize(new java.awt.Dimension(300, 40));

        ADDBTN.setBackground(new java.awt.Color(255, 255, 255));
        ADDBTN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ADDBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        ADDBTN.setText("ADD TO OWL");
        ADDBTN.setBorderPainted(false);
        ADDBTN.setContentAreaFilled(false);
        ADDBTN.setDefaultCapable(false);
        ADDBTN.setMaximumSize(new java.awt.Dimension(300, 75));
        ADDBTN.setMinimumSize(new java.awt.Dimension(300, 75));
        ADDBTN.setPreferredSize(new java.awt.Dimension(300, 75));
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        EXITBTN.setBackground(new java.awt.Color(255, 255, 255));
        EXITBTN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        EXITBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        EXITBTN.setText("ÇIKIŞ");
        EXITBTN.setBorderPainted(false);
        EXITBTN.setContentAreaFilled(false);
        EXITBTN.setDefaultCapable(false);
        EXITBTN.setMaximumSize(new java.awt.Dimension(300, 75));
        EXITBTN.setMinimumSize(new java.awt.Dimension(300, 75));
        EXITBTN.setPreferredSize(new java.awt.Dimension(300, 75));
        EXITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("CREATE SWRL RULES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText(">");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText(">");

        ONERMECB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ONERMECB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FENA", "ILAC_KULLAN", "DOKTOR_KONTOL" }));
        ONERMECB.setMaximumSize(new java.awt.Dimension(300, 40));
        ONERMECB.setMinimumSize(new java.awt.Dimension(300, 40));
        ONERMECB.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("ÖNERME YAP");
        jLabel28.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel28.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel28.setPreferredSize(new java.awt.Dimension(300, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EXITBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ONERMECB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(kilotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(yastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(125, 125, 125))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ALLERGYCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AKTIVITECB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(yastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kilotxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ONERMECB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AKTIVITECB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ALLERGYCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(204, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//CONSUMER(?C), HAS_ALLERGY(?C, BALIK), HAS_ACTIVITY_LEVEL_VALUE(?C, YAVAS),HAS_AGE(?C, ?A), greaterThanOrEqual(?A, 45) -> HAS_RECOMMEND(?C, FENA)

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        try {
            o = m.loadOntologyFromOntologyDocument(localLocation_IRI);
            double kilo = Double.parseDouble(kilotxt.getText().trim());

//CREATE CONSUMER(?C)
            OWLClass CONSUMER = f.getOWLClass(IRI.create(Ont_Base_IRI + "#CONSUMER"));
            SWRLVariable C = f.getSWRLVariable(IRI.create(Ont_Base_IRI + "#C"));
            SWRLClassAtom CON_C = f.getSWRLClassAtom(CONSUMER, C);

//HAS_ALLERGY(?C, BALIK)
            String alerji = ALLERGYCB.getSelectedItem().toString();
            OWLNamedIndividual ind_A = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + alerji));
            SWRLIndividualArgument varA = f.getSWRLIndividualArgument(ind_A);
//      if (o.containsObjectPropertyInSignature(IRI.create(Ont_Base_IRI + "#HAS_ALLERGY"), true)) {
                OWLObjectProperty HAS_ALLERGY = f.getOWLObjectProperty(IRI.create(Ont_Base_IRI + "#HAS_ALLERGY"));
                SWRLObjectPropertyAtom HAS_ALLERGY_PROP = f.getSWRLObjectPropertyAtom(HAS_ALLERGY, C, varA);
//          }

// HAS_ACTIVITY_LEVEL_VALUE(?C, YAVAS)
            String aktivite = AKTIVITECB.getSelectedItem().toString();
            OWLNamedIndividual ind_F = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + aktivite));
            SWRLIndividualArgument varF = f.getSWRLIndividualArgument(ind_F);
            OWLObjectProperty HAS_ACTIVITY_LEVEL_VALUE = f.getOWLObjectProperty(IRI.create(Ont_Base_IRI + "#HAS_ACTIVITY_LEVEL_VALUE"));
            
            SWRLObjectPropertyAtom HAS_ACTIVITY_LEVEL_PROP = f.getSWRLObjectPropertyAtom(HAS_ACTIVITY_LEVEL_VALUE, C, varF);



// HAS_AGE(?C, ?A)
            SWRLVariable varAge = f.getSWRLVariable(IRI.create(Ont_Base_IRI + "#A"));
            OWLDataProperty HAS_AGE = f.getOWLDataProperty(IRI.create(Ont_Base_IRI + "#HAS_AGE"));
            SWRLDataPropertyAtom HAS_AGE_PROP = f.getSWRLDataPropertyAtom(HAS_AGE, C, varAge);

// greaterThanOrEqual(?A, 45)
            OWLLiteral literal = f.getOWLLiteral(Integer.parseInt(yastxt.getText().trim()));
            SWRLDArgument yas = f.getSWRLLiteralArgument(literal);
            SWRLBuiltInAtom greaterThanOrEqual1 = f.getSWRLBuiltInAtom(SWRLBuiltInsVocabulary.GREATER_THAN_OR_EQUAL.getIRI(), Arrays.asList(varAge, yas));

            // HAS_RECOMMEND(?C, FENA)
            String onerme = ONERMECB.getSelectedItem().toString();
            OWLNamedIndividual ind_O = f.getOWLNamedIndividual(IRI.create(Ont_Base_IRI + "#" + onerme));
            SWRLIndividualArgument varO = f.getSWRLIndividualArgument(ind_O);
            OWLObjectProperty HAS_RECOMMEND = f.getOWLObjectProperty(IRI.create(Ont_Base_IRI + "#HAS_RECOMMEND"));
            SWRLObjectPropertyAtom HAS_RECOMMEND_PROP = f.getSWRLObjectPropertyAtom(HAS_RECOMMEND, C, varO);

// CREATE CONSUMER(?C), HAS_ALLERGY(?C, BALIK), HAS_ACTIVITY_LEVEL_VALUE(?C, YAVAS),HAS_AGE(?C, ?A),greaterThanOrEqual(?A, 45) -> HAS_RECOMMEND(?C, FENA)
              
            Set<SWRLAtom> antecedent = new HashSet<SWRLAtom>();
            antecedent.add(CON_C);
            antecedent.add(HAS_ALLERGY_PROP);
            antecedent.add(HAS_ACTIVITY_LEVEL_PROP);
            antecedent.add(HAS_AGE_PROP);
            antecedent.add(greaterThanOrEqual1);
            SWRLRule rule = f.getSWRLRule(antecedent, Collections.singleton(HAS_RECOMMEND_PROP));

// SVAE TO THE ONTOLOGY
            m.applyChange(new AddAxiom(o, rule));
            m.saveOntology(o);

        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }//GEN-LAST:event_ADDBTNActionPerformed


    private void EXITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateRulesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JComboBox AKTIVITECB;
    private javax.swing.JComboBox ALLERGYCB;
    private javax.swing.JButton EXITBTN;
    private javax.swing.JComboBox ONERMECB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kilotxt;
    private javax.swing.JTextField yastxt;
    // End of variables declaration//GEN-END:variables
}
