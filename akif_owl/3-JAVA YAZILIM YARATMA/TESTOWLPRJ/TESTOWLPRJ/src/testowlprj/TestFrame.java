package testowlprj;

import javax.swing.JOptionPane;

public class TestFrame extends javax.swing.JFrame {

    OntologyFunctions obj = new OntologyFunctions();

    public TestFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel29 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TCTXT = new javax.swing.JTextField();
        ADTXT = new javax.swing.JTextField();
        YASTXT = new javax.swing.JTextField();
        KILOTXT = new javax.swing.JTextField();
        AKTIVITECB = new javax.swing.JComboBox();
        ALLERGYCB = new javax.swing.JComboBox();
        ADDBTN = new javax.swing.JButton();
        EXITBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("TC_NO");
        jLabel29.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel29.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel29.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("AD_SOYAD");
        jLabel17.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel17.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel17.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("YAŞ");
        jLabel18.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel18.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel18.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("KİLO");
        jLabel19.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel19.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel19.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("AKTİVİTE DÜZEY DEĞERİ");
        jLabel23.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel23.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel23.setName(""); // NOI18N
        jLabel23.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("ALERJİ ADI");
        jLabel27.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel27.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel27.setPreferredSize(new java.awt.Dimension(300, 40));

        TCTXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TCTXT.setMaximumSize(new java.awt.Dimension(300, 40));
        TCTXT.setMinimumSize(new java.awt.Dimension(300, 40));
        TCTXT.setPreferredSize(new java.awt.Dimension(300, 40));

        ADTXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADTXT.setMaximumSize(new java.awt.Dimension(300, 40));
        ADTXT.setMinimumSize(new java.awt.Dimension(300, 40));
        ADTXT.setPreferredSize(new java.awt.Dimension(300, 40));

        YASTXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YASTXT.setMaximumSize(new java.awt.Dimension(300, 40));
        YASTXT.setMinimumSize(new java.awt.Dimension(300, 40));
        YASTXT.setPreferredSize(new java.awt.Dimension(300, 40));

        KILOTXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        KILOTXT.setMaximumSize(new java.awt.Dimension(300, 40));
        KILOTXT.setMinimumSize(new java.awt.Dimension(300, 40));
        KILOTXT.setPreferredSize(new java.awt.Dimension(300, 40));

        AKTIVITECB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AKTIVITECB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YAVAS", "ORTA", "HIZLI" }));
        AKTIVITECB.setMaximumSize(new java.awt.Dimension(300, 40));
        AKTIVITECB.setMinimumSize(new java.awt.Dimension(300, 40));
        AKTIVITECB.setPreferredSize(new java.awt.Dimension(300, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YASTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KILOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALLERGYCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AKTIVITECB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 124, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EXITBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YASTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KILOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AKTIVITECB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALLERGYCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed

        String tcno = TCTXT.getText().trim();
        String ad = ADTXT.getText().trim();
        int yas = Integer.parseInt(YASTXT.getText().trim());
        double kilo = Double.parseDouble(KILOTXT.getText().trim());
        String aktivite = AKTIVITECB.getSelectedItem().toString();
        String alerji = ALLERGYCB.getSelectedItem().toString();

        try {
            obj.saveClassAssertion("CONSUMER", tcno);

            obj.SaveDTPString(tcno, "HAS_NAME_SURNAME", ad);
            obj.SaveDTPInteger(tcno, "HAS_AGE", yas);
            obj.SaveDTPDouble(tcno, "HAS_WEIGHT", kilo);
            obj.SAVEOTP(tcno, "HAS_ALLERGY", alerji);
            obj.SAVEOTP(tcno, "HAS_ACTIVITY_LEVEL_VALUE", aktivite);

            JOptionPane.showMessageDialog(null, "GONDERİLDİ" );
            JOptionPane.showMessageDialog(null, obj.getAnObjectProperty(tcno, "HAS_RECOMMEND") );
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void EXITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTNActionPerformed
        String tcno = TCTXT.getText().trim();
        String ad = ADTXT.getText().trim();
        int yas = Integer.parseInt(YASTXT.getText().trim());
        double kilo = Double.parseDouble(KILOTXT.getText().trim());
        String aktivite = AKTIVITECB.getSelectedItem().toString();
        String alerji = ALLERGYCB.getSelectedItem().toString();

        try {

            obj.removeDTPString(tcno, "HAS_NAME_SURNAME", ad);
            obj.removeDTPInteger(tcno, "HAS_AGE", yas);
            obj.removeDTPDouble(tcno, "HAS_WEIGHT", kilo);
            obj.removeOTP(tcno, "HAS_ALLERGY", alerji);
            obj.removeOTP(tcno, "HAS_ACTIVITY_LEVEL_VALUE", aktivite);
            obj.removeClassAssertion("CONSUMER", tcno);

       JOptionPane.showMessageDialog(null, "SİLİNDİ!!");
        } catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }

        System.exit(0);
    }//GEN-LAST:event_EXITBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JTextField ADTXT;
    private javax.swing.JComboBox AKTIVITECB;
    private javax.swing.JComboBox ALLERGYCB;
    private javax.swing.JButton EXITBTN;
    private javax.swing.JTextField KILOTXT;
    private javax.swing.JTextField TCTXT;
    private javax.swing.JTextField YASTXT;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    // End of variables declaration//GEN-END:variables
}
