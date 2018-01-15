/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovermentEnterprise;
import Business.Network.Network;
import Business.Organization.BankingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InterestFreeLoanWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.TrayIcon;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author jhalak
 */
public class RequestInterestFreeLoanJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    ImageIcon picture;

    /**
     * Creates new form RequestInterestFreeLoanJPanel
     */
    public RequestInterestFreeLoanJPanel(JPanel userProcessContainer, UserAccount account,
            Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        // valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioYes = new javax.swing.JRadioButton();
        radioNo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cmbIncome = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        chkCurrentIncome = new javax.swing.JCheckBox();
        chkLoanUsed = new javax.swing.JCheckBox();
        chkAgriLand = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtloan = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        attachImagebtn = new javax.swing.JButton();
        imageDisplayLabel = new javax.swing.JLabel();
        fileNameTextField = new javax.swing.JTextField();
        attachImagebtn1 = new javax.swing.JButton();
        fileNameTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Chalkboard SE", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("QUICK FARM LOAN APPLICATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 350, -1));

        lblName.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        lblName.setText("1. NAME :");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        lblAge.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        lblAge.setText("2. AGE:");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lblGender.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        lblGender.setText("3. GENDER:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        lblAddress.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        lblAddress.setText("4. ADDRESS:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel6.setText("6. HAVE YOU APPLIED FOR A LOAN, RECIEVED A LOAN OR COSIGNED ON A LOAN WITH THE FREE LOAN ASSOCIATION IN THE PAST ?*");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 780, -1));

        buttonGroup1.add(radioYes);
        radioYes.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        radioYes.setText("Yes");
        add(radioYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        buttonGroup1.add(radioNo);
        radioNo.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        radioNo.setText("No");
        add(radioNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel7.setText("7. HOW MUCH IS YOUR MONTHLY INCOME ? *");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 270, -1));

        cmbIncome.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        cmbIncome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Above 20000", "Between 15000 and 20000", "Below 10000" }));
        add(cmbIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel8.setText("8. PLEASE PROVIDE ANY OF THE FOLLOWING DOCUMENT PROOF ? * ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 440, -1));

        txtName.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, -1));

        txtAge.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, -1));

        txtGender.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, -1));

        txtAddress.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, -1));

        chkCurrentIncome.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        chkCurrentIncome.setText("Proof of Current Income");
        add(chkCurrentIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 180, -1));

        chkLoanUsed.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        chkLoanUsed.setText("Proof of how the loan will be used");
        add(chkLoanUsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        chkAgriLand.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        chkAgriLand.setText("Proof of Agricultural land you have");
        add(chkAgriLand, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(0, 102, 102));
        btnSubmit.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 620, 120, 25));

        jLabel9.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel9.setText("5. HOW MUCH LOAN YOU REQUIRE ? *");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, -1));

        txtloan.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(txtloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 150, 30));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< BACK ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 624, 120, 30));

        attachImagebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        attachImagebtn.setText("Browse");
        attachImagebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachImagebtnActionPerformed(evt);
            }
        });
        add(attachImagebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 80, 30));
        add(imageDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 250, 150));

        fileNameTextField.setEditable(false);
        add(fileNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 170, 30));

        attachImagebtn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        attachImagebtn1.setText("Browse");
        attachImagebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachImagebtn1ActionPerformed(evt);
            }
        });
        add(attachImagebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 80, 30));

        fileNameTextField2.setEditable(false);
        add(fileNameTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (!txtName.getText().isEmpty() && txtName.getText() != null
                && !txtAge.getText().isEmpty() && txtAge.getText() != null
                && !txtloan.getText().isEmpty() && txtloan.getText() != null
                && cmbIncome.getSelectedItem() != null
                && (chkAgriLand.isSelected() || chkCurrentIncome.isSelected() || chkLoanUsed.isSelected())) {

            if (!radioNo.isSelected() && !radioYes.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select the loan received with Free association");

            } else {
                AddRequest();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter values for empty field");
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel dwjp = (FarmerWorkAreaJPanel) component;
        dwjp.populateInterestFreeLoanRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void attachImagebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachImagebtnActionPerformed
        // TODO add your handling code here:
        JFileChooser attachFile = new JFileChooser();
        // attachFile.setFileFilter(new FileNameExtensionFilter("Ima".jpg"));
        attachFile.showOpenDialog(null);
        File filePath = attachFile.getSelectedFile();
        if (filePath != null) {
            try {
                Image image = ImageIO.read(filePath);
                if (image != null) {
                    image = image.getScaledInstance(250, 140, java.awt.Image.SCALE_SMOOTH);
                    picture = new ImageIcon(image);
                    imageDisplayLabel.setIcon(picture);
                    String fileAbsolutePath = filePath.getAbsolutePath();
                    if (fileAbsolutePath != null) {
                        String fileName = fileAbsolutePath.substring(fileAbsolutePath.lastIndexOf("\\") + 1);
                        fileNameTextField.setText(fileName);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select an image", "", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Image could not be set successfully");
            }
        }

    }//GEN-LAST:event_attachImagebtnActionPerformed

    private void attachImagebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachImagebtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attachImagebtn1ActionPerformed

    private void refreshForm() {
        txtName.setText("");
        txtAddress.setText("");
        txtAge.setText("");
        txtName.setText("");
        txtloan.setText("");
        txtGender.setText("");
        radioNo.setSelected(true);
        chkAgriLand.setSelected(false);
        chkCurrentIncome.setSelected(false);
        chkLoanUsed.setSelected(false);
        cmbIncome.setSelectedIndex(0);
        fileNameTextField.setText("");
        imageDisplayLabel.setIcon(null);
    }

    private void AddRequest() {
        try {
            int age = 0;
            int loanAmount = 0;
            String name = txtName.getText();
            String gender = txtGender.getText();
            String address = txtAddress.getText();
            String monthlyIncome = cmbIncome.getSelectedItem().toString();

            age = Integer.parseInt(txtAge.getText());
            loanAmount = Integer.parseInt(txtloan.getText());

            InterestFreeLoanWorkRequest interestFreeLoanWorkRequest = new InterestFreeLoanWorkRequest();
            interestFreeLoanWorkRequest.setName(name);
            interestFreeLoanWorkRequest.setAge(age);
            interestFreeLoanWorkRequest.setAddress(address);
            interestFreeLoanWorkRequest.setAmount(loanAmount);
            interestFreeLoanWorkRequest.setGender(gender);
            interestFreeLoanWorkRequest.setMonthlyIncome(monthlyIncome);
            interestFreeLoanWorkRequest.setImage(picture);
            if (radioYes.isSelected()) {
                interestFreeLoanWorkRequest.setIsLoanApplied(true);
            } else {
                interestFreeLoanWorkRequest.setIsLoanApplied(false);
            }

            if (chkAgriLand.isSelected()) {
                interestFreeLoanWorkRequest.setIsAgriLand(true);
            } else {
                interestFreeLoanWorkRequest.setIsAgriLand(false);
            }
            if (chkLoanUsed.isSelected()) {
                interestFreeLoanWorkRequest.setIsLoanUsed(true);
            } else {
                interestFreeLoanWorkRequest.setIsLoanUsed(false);
            }

            if (chkCurrentIncome.isSelected()) {
                interestFreeLoanWorkRequest.setIsCurrentIncome(true);
            } else {
                interestFreeLoanWorkRequest.setIsCurrentIncome(false);
            }
            interestFreeLoanWorkRequest.setSender(userAccount);
            interestFreeLoanWorkRequest.setStatus("Sent");

            Organization org = null;
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof GovermentEnterprise) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof BankingOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }

                }
            }

            if (org != null) {

                if (!org.getWorkQueue().getWorkRequestList().contains(interestFreeLoanWorkRequest)
                        && !interestFreeLoanWorkRequest.getIsLoanApplied()) {
                    org.getWorkQueue().getWorkRequestList().add(interestFreeLoanWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(interestFreeLoanWorkRequest);
                    JOptionPane.showMessageDialog(null, "Your request has been added successfully");
                    refreshForm();
                } else {
                    JOptionPane.showMessageDialog(null, "Your request cannot be processed at the moment as you have already applied for it before.Kindly visit the nearest bank for the help");
                    refreshForm();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter age and loan amount in integer");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attachImagebtn;
    private javax.swing.JButton attachImagebtn1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkAgriLand;
    private javax.swing.JCheckBox chkCurrentIncome;
    private javax.swing.JCheckBox chkLoanUsed;
    private javax.swing.JComboBox<String> cmbIncome;
    private javax.swing.JTextField fileNameTextField;
    private javax.swing.JTextField fileNameTextField2;
    private javax.swing.JLabel imageDisplayLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtloan;
    // End of variables declaration//GEN-END:variables
}
