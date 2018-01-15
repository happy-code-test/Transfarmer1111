/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CallCentre;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CallCentreOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ComplaintWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deekshithav
 */
public class FarmerHelpDeskWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerHelpDeskWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private CallCentreOrganization organization;
    private Enterprise enterprise;
    //  private Network network;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public FarmerHelpDeskWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CallCentreOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        //  this.network = network;

        populateTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            // row[0] = request.getDate();
            //row[0] = request;
            row[0] = request;
            row[1] = request.getComplaintMessage();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getDate();
            //row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();

            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        lasttimeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sextextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addressline2textfield = new javax.swing.JTextField();
        middlenametextfield = new javax.swing.JTextField();
        lastnametextfield = new javax.swing.JTextField();
        agetextfield = new javax.swing.JTextField();
        addressline1textfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        citytexxtfield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        statetextfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        firstnametextfield = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dobtextfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        countrytextfield1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        phonenotextfield1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        occupationTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        departmentComboBox = new javax.swing.JComboBox<>();
        submitJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Chalkboard", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("WELCOME TO MINISTRY OF AGRICULTURE AND FARMER WELFARE WORKAREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        workRequestJTable.setFont(new java.awt.Font("Chalkboard", 0, 10)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DEPARTMENT", "COMPLAINT MESSAGE", "FARMER NAME", "DATE COMPLAINT FILED", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 104, 778, 97));

        lasttimeTextField.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(lasttimeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 577, 450, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel2.setText("ADDRESS LINE 2:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 427, -1, -1));

        sextextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(sextextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 367, 250, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel3.setText("MIDDLE NAME: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 367, -1, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel5.setText("MARITAL STATUS:* ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 517, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel6.setText("LAST NAME*:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 397, -1, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel8.setText("SEX: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 367, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel9.setText("FIRST NAME*: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 337, -1, 20));

        addressline2textfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(addressline2textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 427, 250, 20));

        middlenametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(middlenametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 367, 280, 20));

        lastnametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(lastnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 397, 280, 20));

        agetextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(agetextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 337, 250, 20));

        addressline1textfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(addressline1textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 427, 280, 20));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel10.setText("ADDRESS LINE 1: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 427, -1, 20));

        citytexxtfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(citytexxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 457, 280, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel11.setText("PHONE NUMBER*: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 487, -1, -1));

        statetextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(statetextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 457, 250, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel12.setText("STATE:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 457, -1, -1));

        firstnametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(firstnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 337, 280, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel13.setText("CITY: ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 457, -1, 20));

        dobtextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(dobtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 397, 250, 20));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel14.setText("DATE OF BIRTH*:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 397, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 102, 102));
        jLabel15.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("FARMER'S PERSONAL INFORMATION: ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 287, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel16.setText("COUNTRY:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 487, -1, 20));

        countrytextfield1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(countrytextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 487, 280, 20));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel17.setText("DID YOU FACE THIS ISSUE BEFORE ? (IF YES, PLEASE MENTION)");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 557, 590, 60));

        phonenotextfield1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(phonenotextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 487, 250, 20));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Seperated");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 547, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Married");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 517, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Single");
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 517, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Widowed");
        add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 547, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel18.setText("OCCUPATION: ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 517, -1, 20));

        occupationTextField1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(occupationTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 517, 280, 20));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel19.setText("AGE:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 337, 30, -1));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("ASSIGN THE COMPLAINT TO THE RESPECTIVE DEPARTMENT");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 234, -1, -1));

        departmentComboBox.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crops", "Marketing & Prices", "Fertilizers & Pesticides", "Storage", "Animal Husbandry", "Education", "Loans & Finance", "Insurance", "Healthcare" }));
        add(departmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 231, 258, -1));

        submitJButton.setBackground(new java.awt.Color(0, 102, 102));
        submitJButton.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("SUBMIT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 655, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        // TODO add your handling code here:

        int selectedrow = workRequestJTable.getSelectedRow();

        if (selectedrow >= 0) {

            ComplaintWorkRequest request = (ComplaintWorkRequest) workRequestJTable.getValueAt(selectedrow, 0);
            firstnametextfield.setText(request.getFirstName());
            middlenametextfield.setText(request.getMiddleName());
            lastnametextfield.setText(request.getLastName());
            agetextfield.setText(String.valueOf(request.getAge()));
            sextextfield.setText(request.getSex());
            addressline1textfield.setText(request.getAddressLine1());
            addressline2textfield.setText(request.getAddressLine2());
            citytexxtfield.setText(request.getCity());
            statetextfield.setText(request.getState());
            countrytextfield1.setText(request.getCountry());
            dobtextfield.setText(request.getDOB());
            phonenotextfield1.setText(String.valueOf(request.getPhoneNo()));
            occupationTextField1.setText(request.getOccupation());
            lasttimeTextField.setText(request.getLastTimeIssue());

            if (request.getMaritalStatus().equals(jRadioButton2.getText())) {
                jRadioButton2.setSelected(true);
            } else if (request.getMaritalStatus().equals(jRadioButton3.getText())) {
                jRadioButton3.setSelected(true);
            } else if (request.getMaritalStatus().equals(jRadioButton4.getText())) {
                jRadioButton4.setSelected(true);
            } else {
                jRadioButton1.setSelected(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please Select any row");
        }

    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            ComplaintWorkRequest request = (ComplaintWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

            if ((request.getDepartment().equals(departmentComboBox.getSelectedItem().toString()))) {
                boolean isError = false;
                if (selectedRow < 0) {
                    return;
                }
                //before

                JOptionPane.showMessageDialog(null, "Your complaint has been registered successfully and respective personal from"
                        + departmentComboBox.getSelectedItem().toString() + " department will contact you shortly!", "Information", JOptionPane.INFORMATION_MESSAGE);

                request.setStatus("Complaint Registered");
            } else {
                JOptionPane.showMessageDialog(null, "Please make sure you register the complaint to the appropriate department", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select any row");
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressline1textfield;
    private javax.swing.JTextField addressline2textfield;
    private javax.swing.JTextField agetextfield;
    private javax.swing.JTextField citytexxtfield;
    private javax.swing.JTextField countrytextfield1;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JTextField dobtextfield;
    private javax.swing.JTextField firstnametextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnametextfield;
    private javax.swing.JTextField lasttimeTextField;
    private javax.swing.JTextField middlenametextfield;
    private javax.swing.JTextField occupationTextField1;
    private javax.swing.JTextField phonenotextfield1;
    private javax.swing.JTextField sextextfield;
    private javax.swing.JTextField statetextfield;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
