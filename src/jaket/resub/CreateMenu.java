/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaket.resub;

/**
 *
 * @author Jake
 */
public class CreateMenu extends javax.swing.JFrame {

    /**
     * Creates new form CreateMenu
     */
    public CreateMenu() {
        initComponents();
    }
    
    private MenuUI frame1 = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        cbExternal = new javax.swing.JCheckBox();
        txtTC = new javax.swing.JTextField();
        txtTCN = new javax.swing.JTextField();
        txtVenueName = new javax.swing.JTextField();
        txtSundry = new javax.swing.JTextField();
        txtTransport = new javax.swing.JTextField();
        txtVenue = new javax.swing.JTextField();
        txtCostDisplay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        btnClearCost = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtExtCompany = new javax.swing.JTextField();
        cbResidential = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtExtCompanyName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAccommodation = new javax.swing.JTextField();
        txtAccommodationNo = new javax.swing.JTextField();
        txtAccommodationCost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTripName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtExtCost = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbExternal.setText("External Trip");
        cbExternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbExternalActionPerformed(evt);
            }
        });

        txtTCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTCNActionPerformed(evt);
            }
        });

        txtCostDisplay.setEditable(false);

        jLabel1.setText("Transport Company:");

        jLabel2.setText("Company Contact No.");

        jLabel3.setText("Venue:");

        jLabel4.setText("Sundry Costs:");

        jLabel5.setText("Transport Costs:");

        jLabel6.setText("Venue Costs:");

        btnCalc.setText("Calculate Cost");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel7.setText("Trip Cost:");

        btnClearCost.setText("Clear Cost");
        btnClearCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCostActionPerformed(evt);
            }
        });

        btnClear.setText("Clear Form");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtExtCompany.setEnabled(false);

        cbResidential.setText("Residential");
        cbResidential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbResidentialActionPerformed(evt);
            }
        });

        jLabel8.setText("Company Name:");

        txtExtCompanyName.setEnabled(false);

        jLabel9.setText("Contact No.");

        txtAccommodation.setEnabled(false);

        txtAccommodationNo.setEnabled(false);

        txtAccommodationCost.setEnabled(false);

        jLabel10.setText("Accommodation:");

        jLabel11.setText("Contact No.");

        jLabel12.setText("Accommodation Cost:");

        jLabel13.setText("Trip Name:");

        txtExtCost.setEnabled(false);

        jLabel14.setText("Cost:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbExternal)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbResidential))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel1)
                                                            .addComponent(jLabel2)
                                                            .addComponent(jLabel3))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtTC, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                                            .addComponent(txtTCN)
                                                            .addComponent(txtVenueName)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(jLabel9)
                                                            .addComponent(jLabel14))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtExtCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                                            .addComponent(txtExtCompany)
                                                            .addComponent(txtExtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel10)
                                                            .addComponent(jLabel11)
                                                            .addComponent(jLabel12))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtAccommodation)
                                                                .addComponent(txtAccommodationNo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                                            .addComponent(txtAccommodationCost, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTransport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(txtVenue, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCostDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSundry))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTripName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblError)
                            .addComponent(btnClearCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTripName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSundry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(lblError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVenueName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc)
                    .addComponent(txtCostDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbExternal)
                    .addComponent(btnClearCost)
                    .addComponent(cbResidential))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtAccommodation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtAccommodationNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAccommodationCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtExtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        double sundry = 0.0;
        double transport = 0.0;
        double venue = 0.0;
        double total = 0.0;
        try{
           // if(cbExternal)
        sundry = Double.parseDouble(txtSundry.getText());
        transport = Double.parseDouble(txtTransport.getText());
        venue = Double.parseDouble(txtVenue.getText());
        lblError.setText("");
        }
        catch(Exception e){
            lblError.setText("Input a valid cost");
        }
        total = (sundry + transport) + venue;
        
        txtCostDisplay.setText(String.valueOf(total));
        
    }//GEN-LAST:event_btnCalcActionPerformed

    private void txtTCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTCNActionPerformed

    private void cbExternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbExternalActionPerformed
        // TODO add your handling code here:
        if(cbExternal.isSelected()){
            txtTC.setEnabled(false);
            txtTCN.setEnabled(false);
            txtTransport.setEnabled(false);
            txtVenue.setEnabled(false);
            txtVenueName.setEnabled(false);
            txtSundry.setEnabled(false);
            txtExtCompany.setEnabled(true);
            txtExtCompanyName.setEnabled(true);
            txtExtCost.setEnabled(true);
            txtSundry.setText("");
            txtTransport.setText("");
            txtVenue.setText("");
            txtAccommodationCost.setText("");
            txtCostDisplay.setText("");
            cbResidential.setEnabled(false);
            
        }
        else{
            txtTC.setEnabled(true);
            txtTCN.setEnabled(true);
            txtTransport.setEnabled(true);
            txtVenue.setEnabled(true);
            txtVenueName.setEnabled(true);
            txtSundry.setEnabled(true);
            txtAccommodationCost.setText("");
            txtExtCost.setText("");
            txtCostDisplay.setText("");
        }
        
        
    }//GEN-LAST:event_cbExternalActionPerformed

    private void btnClearCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCostActionPerformed
        // TODO add your handling code here:
        txtSundry.setText("");
        txtTransport.setText("");
        txtVenue.setText("");
        txtAccommodation.setText("");
        txtCostDisplay.setText("");
        lblError.setText("");
    }//GEN-LAST:event_btnClearCostActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        //This sends the trip name to the trip name to the ArrayList in the TripArray class.
        String name;
        name = txtTripName.getText();
        TripArray sendName = new TripArray();
        sendName.addTrip(name);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frame1 = new MenuUI();
        if(!frame1.isVisible()){
            frame1.setVisible(true);
            CloseFrame();
        }
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtAccommodation.setText("");
        txtAccommodationCost.setText("");
        txtCostDisplay.setText("");
        txtExtCompany.setText("");
        txtExtCompanyName.setText("");
        txtExtCost.setText("");
        txtSundry.setText("");
        txtTC.setText("");
        txtTCN.setText("");
        txtTransport.setText("");
        txtTripName.setText("");
        txtVenue.setText("");
        txtVenueName.setText("");
        cbExternal.setSelected(false);
        cbResidential.setSelected(false);
        lblError.setText("");
        
        txtTC.setEnabled(true);
        txtTCN.setEnabled(true);
        txtTransport.setEnabled(true);
        txtVenue.setEnabled(true);
        txtVenueName.setEnabled(true);
        txtSundry.setEnabled(true);
        txtAccommodationCost.setText("");
        txtExtCost.setText("");
        txtCostDisplay.setText("");
        txtExtCompany.setEnabled(false);
        txtExtCompanyName.setEnabled(false);
        txtExtCost.setEnabled(false);
        txtAccommodation.setEnabled(false);
        txtAccommodationCost.setEnabled(false);
        txtAccommodationNo.setEnabled(false);
        
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void cbResidentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbResidentialActionPerformed
        // TODO add your handling code here:
        if(cbResidential.isSelected()){
            if(cbExternal.isSelected()){
                
            }
            else{
                txtAccommodation.setEnabled(true);
                txtAccommodationCost.setEnabled(true);
                txtAccommodationNo.setEnabled(true);
            }
        }
        else{
            txtAccommodation.setEnabled(false);
            txtAccommodationCost.setEnabled(false);
            txtAccommodationNo.setEnabled(false);
        }
    }//GEN-LAST:event_cbResidentialActionPerformed

    public void CloseFrame(){
        super.dispose();
    }
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
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearCost;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbExternal;
    private javax.swing.JCheckBox cbResidential;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtAccommodation;
    private javax.swing.JTextField txtAccommodationCost;
    private javax.swing.JTextField txtAccommodationNo;
    private javax.swing.JTextField txtCostDisplay;
    private javax.swing.JTextField txtExtCompany;
    private javax.swing.JTextField txtExtCompanyName;
    private javax.swing.JTextField txtExtCost;
    private javax.swing.JTextField txtSundry;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txtTCN;
    private javax.swing.JTextField txtTransport;
    private javax.swing.JTextField txtTripName;
    private javax.swing.JTextField txtVenue;
    private javax.swing.JTextField txtVenueName;
    // End of variables declaration//GEN-END:variables
}
