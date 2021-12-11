/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.BigMarketAdmin;
import Business.Role.FarmerCommAdmin;
import Business.Role.FarmerHelpAdmin;
import Business.Role.TransporterAdmin;
import Business.UserAccount.UserAccount;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class PanelManageEnterpriseAdmin extends javax.swing.JPanel {

    /**
     * Creates new form PanelManageEnterpriseAdmin
     */
    
    private final EcoSystem system;
    
    public PanelManageEnterpriseAdmin(EcoSystem system) {
        initComponents();
        this.system = system;
        populateTable();
        populateCmbNetwork();
        populateCmbEnterprise();
        System.out.println("Constructor : " + system.getEnterpriseDirectory().getEnterpriseList());
    }
    
    private void populateTable() 
    {
        DefaultTableModel model = (DefaultTableModel) tblEnterpriseAdmin.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) 
        {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) 
                {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetworkName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateCmbNetwork() {
        cmbNetwork.removeAllItems();
        
        System.out.println("populateCmbNetwork() System : " + Arrays.toString(system.getNetworkList().toArray()));
        for (Network network : system.getNetworkList())
        {
            cmbNetwork.addItem(network.toString());
        }
    }

    private void populateCmbEnterprise() 
    {
        Network network = null;
        String networkName = cmbNetwork.getSelectedItem().toString();
        
        
        for(Network n : system.getNetworkList())
        {
            if(n.getNetworkName().equals(networkName))
            {
                network = n;
            }
        }
        
        if (network != null)
        {
            cmbEnterprise.removeAllItems();

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                cmbEnterprise.addItem(enterprise.toString());
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

        jLabel1 = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        lblEnterpriseType = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterpriseAdmin = new javax.swing.JTable();
        lblEntAdminName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnEnterpriseAdmin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();

        setBackground(new java.awt.Color(223, 238, 234));

        jLabel1.setText("Manage Enterprise Admin");

        lblNetwork.setText("Network :");

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        lblEnterpriseType.setText("Enterprise:");

        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblEnterpriseAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ));
        jScrollPane1.setViewportView(tblEnterpriseAdmin);

        lblEntAdminName.setText("Enter Name:");

        btnEnterpriseAdmin.setText("Create Enterprise Admin");
        btnEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseAdminActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        lblUsername.setText("Username:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(txtUsername))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEntAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName)
                                    .addComponent(cmbNetwork, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.Alignment.LEADING, 0, 174, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(txtPassword))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnEnterpriseAdmin)))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnEnterpriseAdmin)
                .addContainerGap(1271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseAdminActionPerformed
        
        Enterprise enterprise = null;
        String ent  = cmbEnterprise.getSelectedItem().toString();
        System.out.println("getEnterpriseList : " + Arrays.toString(system.getEnterpriseDirectory().getEnterpriseList().toArray()));
        for (Network network : system.getNetworkList()) 
        {
            for (Enterprise et : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                if(et.getName().equals(ent))
                {
                    enterprise = et;
                }
            }
        }
        
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String name = txtName.getText();
        
        if (username.isEmpty() || password.isEmpty() || name.isEmpty() || cmbEnterprise.getSelectedItem() == null || cmbNetwork.getSelectedItem() == null) 
        {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!system.validatePasswordFormat(password))
            return;
        if (!system.checkUniqueUsername(username))
            return;

        JOptionPane.showMessageDialog(null, "enterprise " + enterprise);
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        UserAccount account = null;
        
        if (null != enterprise.getEnterpriseType()) 
        {   
            switch (enterprise.getEnterpriseType()) 
            {
                case FarmerCommunity:
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FarmerCommAdmin());
                    break;
                case Transportation:
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new TransporterAdmin());
                    break;
                case BigMarketSetup:
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new BigMarketAdmin());
                    break;
                case FarmerHelp:
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FarmerHelpAdmin());
                    break;
                default:
                    break;
            }
        }
        
        txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
        JOptionPane.showMessageDialog(null, "User Account created sucessfully");
        populateTable();
    }//GEN-LAST:event_btnEnterpriseAdminActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed
        
    }//GEN-LAST:event_cmbNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterpriseAdmin;
    private javax.swing.JComboBox<String> cmbEnterprise;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntAdminName;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblEnterpriseAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
