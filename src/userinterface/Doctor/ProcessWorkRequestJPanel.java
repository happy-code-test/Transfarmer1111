/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MedicineSupplierEnterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.MedicineOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorTreatmentWorkRequest;
import Business.WorkQueue.MedicineSupplierWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    DoctorTreatmentWorkRequest docrequest;
    private UserAccount userAccount;
    private EcoSystem business;
    private Enterprise enterprise;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, DoctorTreatmentWorkRequest docrequest, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.docrequest = docrequest;
        //  this.medicineOrganization = medicineOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;

        populateRequestTable();

    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if (x.equals("class Business.WorkQueue.MedicineSupplierWorkRequest")) {
                    MedicineSupplierWorkRequest supplierWorkRequest = (MedicineSupplierWorkRequest) request;
                    Object[] row = new Object[3];
                    row[0] = supplierWorkRequest.getMedicineName();
                    row[1] = supplierWorkRequest.getQuantityNeeded();
                    row[2] = supplierWorkRequest.getStatus();

                    model.addRow(row);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentsTextFiled = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resultJTextField1 = new javax.swing.JTextField();
        freemedicineTextField1 = new javax.swing.JTextField();
        QuantityTextfield1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nextTextField1 = new javax.swing.JTextField();
        requestBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        freemedicineTextField2 = new javax.swing.JTextField();
        QuantityTextfield2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(0, 102, 102));
        submitJButton.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("SUBMIT RESULT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel1.setText("RESULT :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        commentsTextFiled.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(commentsTextFiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 192, -1));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        jLabel2.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("PATIENT EXAMINATION RESULT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel3.setText("FREE MEDICINE : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel4.setText("OTHER COMMENTS :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel5.setText("QUANTITY: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        resultJTextField1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(resultJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 192, -1));

        freemedicineTextField1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(freemedicineTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 192, -1));

        QuantityTextfield1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(QuantityTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 192, -1));

        jLabel6.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel6.setText("NEXT APPOINTMENT DATE:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        nextTextField1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(nextTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 192, -1));

        requestBtn.setBackground(new java.awt.Color(0, 102, 102));
        requestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestBtn.setText("REQUEST MEDICINE");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 160, 30));

        jLabel7.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel7.setText("MEDICINE REQUIRED : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        freemedicineTextField2.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(freemedicineTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 192, -1));

        QuantityTextfield2.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(QuantityTextfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 192, -1));

        jLabel9.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel9.setText("QUANTITY NEEDED : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        requestTable.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 310, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        //DoctorTreatmentWorkRequest request1 = new DoctorTreatmentWorkRequest();
        if ((!resultJTextField1.getText().equals("")) && (!freemedicineTextField1.getText().equals(""))
                && (!QuantityTextfield1.getText().equals("")) && (!nextTextField1.getText().equals(""))
                && (!commentsTextFiled.getText().equals(""))) {
            boolean isError = false;
            try {

                docrequest.setTestResult(resultJTextField1.getText());
                docrequest.setFreeMed(freemedicineTextField1.getText());
                docrequest.setQuantity(Integer.parseInt(QuantityTextfield1.getText()));
                docrequest.setAppointmentDate(nextTextField1.getText());
                docrequest.setComments(commentsTextFiled.getText());

                docrequest.setStatus("Completed"); //before
                JOptionPane.showMessageDialog(null, "You have successfully treated the patient !", "Information", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e3) {
                isError = true;
                JOptionPane.showMessageDialog(null, "Please input the details in proper format", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill all the fields before submitting ", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
        int quantity = Integer.parseInt(QuantityTextfield2.getText());
        String medicineName = freemedicineTextField2.getText();

        MedicineSupplierWorkRequest supplierWorkRequest = new MedicineSupplierWorkRequest();
        Medicine medicine = new Medicine();

        //        medicine.setName(medicineName);
        //        medicine.setQuantity(quantity);
        supplierWorkRequest.setMedicineName(medicineName);
        supplierWorkRequest.setQuantityNeeded(quantity);

        supplierWorkRequest.setMedicine(medicine);
        supplierWorkRequest.setSender(userAccount);
        supplierWorkRequest.setStatus("Sent");

        Organization org = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof MedicineSupplierEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof MedicineOrganization) {
                            org = organization;
                            //                            System.out.println("orgname" + organization.getName());
                            org.getWorkQueue().getWorkRequestList().add(supplierWorkRequest);
                            break;
                        }
                    }
                }

            }
        }

        if (org != null) {

            userAccount.getWorkQueue().getWorkRequestList().add(supplierWorkRequest);
            JOptionPane.showMessageDialog(null, "Requested medicines successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();

        }
    }//GEN-LAST:event_requestBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QuantityTextfield1;
    private javax.swing.JTextField QuantityTextfield2;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField commentsTextFiled;
    private javax.swing.JTextField freemedicineTextField1;
    private javax.swing.JTextField freemedicineTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nextTextField1;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField resultJTextField1;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}