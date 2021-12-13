/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EnterpriseAdmins;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sagar
 */
public class PanelFarmerHelpManageUserAccount extends javax.swing.JPanel {
    
    private final Enterprise enterprise;
    private final EcoSystem ecosystem;
    Organization organization;
    private final OrganizationDirectory organizationDirectory;
    /**
     * Creates new form PanelFarmerHelpManageUserAccount
     */
    public PanelFarmerHelpManageUserAccount(Enterprise enterprise, EcoSystem system, Organization organization, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.enterprise = enterprise;
        this.ecosystem = system;
        this.organization = organization;
        this.organizationDirectory = organizationDirectory;
        System.out.println("Above populateCmbOrganizationName");
        populateCmbOrganizationName();
        populateTable();
    }
    public void populateCmbOrganizationName() 
    {
        System.out.println("Inside populateCmbOrganizationName");
        cmbOrganizationName.removeAllItems();
        System.out.println("getOrganizationList : " + organizationDirectory.getOrganizationList());
        for (Organization org : organizationDirectory.getOrganizationList()) 
        {
            System.out.println("org.getName() : " + org.getName());
            cmbOrganizationName.addItem(org.getName());
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblUserAccount.getModel();

        model.setRowCount(0);

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) 
        {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) 
            {
                Object row[] = new Object[4];
                row[0] = org.getOrgType();
                row[1] = org.getName();
                row[2] = ua;
                row[3] = ua.getRole();
                ((DefaultTableModel) tblUserAccount.getModel()).addRow(row);
            }
        }
    }

    public void populateCmbEmployee(Organization organization) {
        cmbEmployee.removeAllItems();
        System.out.println("populateCmbEmployee");
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            cmbEmployee.addItem(employee.toString());
        }
    }

    private void populateCmbRole(Organization organization) {
        cmbRole.removeAllItems();
        System.out.println("Inside populateCmbRole");
        for (Role role : organization.getSupportedRole()) 
        {
            cmbRole.addItem(role.toString());
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

        txtUsername = new javax.swing.JTextField();
        lblOrganizationName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        lblOrganizationType = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnAddUserAccount = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserAccount = new javax.swing.JTable();
        cmbOrganizationName = new javax.swing.JComboBox<>();
        cmbEmployee = new javax.swing.JComboBox<>();
        cmbRole = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        lblManageEmployee = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 238, 234));

        lblOrganizationName.setBackground(new java.awt.Color(255, 255, 255));
        lblOrganizationName.setText("Organization Name:");
        lblOrganizationName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        lblRole.setBackground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Role:");
        lblRole.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        lblOrganizationType.setBackground(new java.awt.Color(255, 255, 255));
        lblOrganizationType.setText("Organization Type:");
        lblOrganizationType.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");
        lblUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        btnAddUserAccount.setText("Create User Account");
        btnAddUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserAccountActionPerformed(evt);
            }
        });

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        lblPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        tblUserAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization Type", "Organization Name", "Username", "Role"
            }
        ));
        jScrollPane1.setViewportView(tblUserAccount);

        cmbOrganizationName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganizationName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbOrganizationNameMousePressed(evt);
            }
        });

        cmbEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(212, 52));

        lblManageEmployee.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblManageEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageEmployee.setText("MANAGE FARMER COMMUNITY ENTERPRISE USERS");
        lblManageEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblManageEmployee.setPreferredSize(new java.awt.Dimension(212, 40));
        lblManageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageEmployeeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcons/TRY2 copy.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcons/TRY2 copy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddUserAccount)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbOrganizationName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsername)
                                .addComponent(txtPassword)
                                .addComponent(cmbRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddUserAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserAccountActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if ("".equals(username) || "".equals(password)|| cmbOrganizationName.getSelectedItem() == null || cmbEmployee.getSelectedItem() == null || cmbRole.getSelectedItem() == null) 
        {
            JOptionPane.showMessageDialog(null, "Please enter all required fields!");
            return;
        }
        if (!ecosystem.validatePasswordFormat(password)) {
            return;
        }
        if (!ecosystem.checkUniqueUsername(username)) {
            return;
        }
        String orgn = null;
        if(!cmbOrganizationName.getSelectedItem().toString().equals(null))
        {
            System.out.println("cmbOrganizationName Not null");
            orgn = cmbOrganizationName.getSelectedItem().toString();
            System.out.println("cmbOrganizationName orgn : " + orgn);
        }
            
        
        Organization org = null;
        for(Organization o : organizationDirectory.getOrganizationList())
        {
            if(o.getName().equals(orgn))
            {
            System.out.println("o: " + o);
                org = o;
            }
        }
        
        String emp = cmbEmployee.getSelectedItem().toString();
        Employee employee = null;
//        System.out.println("getEmployeeList" + org.getEmployeeDirectory().getEmployeeList());
        for(Employee e : org.getEmployeeDirectory().getEmployeeList())
        {
            if(e.getName().equals(emp))
                employee = e;
        }
        
        String roleName = cmbRole.getSelectedItem().toString();
        Role role = null;
        for(Role r : org.getSupportedRole())
        {
            if(r.toString().equals(roleName))
                role = r;
        }
        
//        Role role = (Role) cmbRole.getSelectedItem();
        org.getUserAccountDirectory().createUserAccount(username, password, employee, role);
        populateTable();
        txtUsername.setText("");
        txtPassword.setText("");
        JOptionPane.showMessageDialog(null, "User created successfully");
    }//GEN-LAST:event_btnAddUserAccountActionPerformed

    private void cmbOrganizationNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbOrganizationNameMousePressed
        // TODO add your handling code here:
        String orgn = null;
        if(!cmbOrganizationName.getSelectedItem().toString().equals(null))
        {
//            System.out.println("cmbOrganizationName Not null");
            orgn = cmbOrganizationName.getSelectedItem().toString();
//            System.out.println("cmbOrganizationName orgn : " + orgn);
        }
            
        
        Organization org = null;
        for(Organization o : organizationDirectory.getOrganizationList())
        {
            if(o.getName().equals(orgn))
            {
//            System.out.println("o: " + o);
                org = o;
            }
        }
        
        if (org != null) 
        {
            populateCmbEmployee(org);
            populateCmbRole(org);
        }
    }//GEN-LAST:event_cmbOrganizationNameMousePressed

    private void lblManageEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageEmployeeMousePressed
        //        manageEmployee();
    }//GEN-LAST:event_lblManageEmployeeMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUserAccount;
    private javax.swing.JComboBox<String> cmbEmployee;
    private javax.swing.JComboBox<String> cmbOrganizationName;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageEmployee;
    private javax.swing.JLabel lblOrganizationName;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblUserAccount;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
