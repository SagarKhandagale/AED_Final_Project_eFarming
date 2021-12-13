/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.UserRegistration;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.Farmer;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.UserRegistrationRequest;
import Business.WorkQueue.WorkQueue;
import UI.MainJFrame;
import java.awt.CardLayout;
import java.awt.PopupMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author sagar
 */
public class PanelUserRegistration extends javax.swing.JPanel {

    private EcoSystem system;
    private boolean flag = false;
    JPanel userProcessContainer;
    
    public PanelUserRegistration(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        fillCmbOrganization();
        fillCmbStateNetwork();
    }
    
    public void fillCmbOrganization()
    {
        cmbOrganization.addItem(Organization.Type.Farmer.getValue());
        cmbOrganization.addItem(Organization.Type.FarmingShopOwner.getValue());
        cmbOrganization.addItem(Organization.Type.Transporter.getValue());
        cmbOrganization.addItem(Organization.Type.BigMarket.getValue());
        cmbOrganization.addItem(Organization.Type.Company.getValue());
        cmbOrganization.addItem(Organization.Type.NGO.getValue());
        
        String orgType = cmbOrganization.getSelectedItem().toString();
        String Role = "";
        
        if(orgType.equals("Farmer Organization"))
            Role = "Farmer";
        else if(orgType.equals("ShopOwner Organization"))
            Role = "Shop Owner";
        else if(orgType.equals("Transporter Organization"))
            Role = "Transporter";
        else if(orgType.equals("BigMarket Organization"))
            Role = "Big Market Manager";
        else if(orgType.equals("Company Organization"))
            Role = "Company Manager";
        else if(orgType.equals("NGO Organization"))
            Role = "NGO Officer";
        
        lblDisplayRole.setText("Role : " + Role);
    }
    
    public void fillCmbStateNetwork()
    {
        cmbStateNetwork.removeAllItems();
        for (Network network : system.getNetworkList()) {
            cmbStateNetwork.addItem(network.toString());
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

        btnRegister = new javax.swing.JButton();
        lblState = new javax.swing.JLabel();
        cmbStateNetwork = new javax.swing.JComboBox<>();
        lblDisplayRole = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        lblOrganization = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblEmailId = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 238, 234));
        setPreferredSize(new java.awt.Dimension(1440, 800));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblState.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblState.setText("State:");
        lblState.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        cmbStateNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDisplayRole.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        cmbOrganization.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrganizationItemStateChanged(evt);
            }
        });

        txtUsername.setText("SagarK");

        lblOrganization.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblOrganization.setText("Organization Type:");
        lblOrganization.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        txtName.setText("BMO");

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblUsername.setText("Username:");
        lblUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        txtContactNo.setText("1234567890");

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPassword.setText("Password:");
        lblPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        txtEmailId.setText("sk@gmail.com");

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName.setText("Organization Name:");
        lblName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        txtCity.setText("Boston");

        lblContactNo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblContactNo.setText("Contact No:");
        lblContactNo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        txtPassword.setText("Admin@123");

        lblEmailId.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblEmailId.setText("Email Id:");
        lblEmailId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        lblCity.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblCity.setText("City:");
        lblCity.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW USER REGISTRATION");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcons/TRY2 copy.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcons/TRY2 copy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcons/a.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbStateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDisplayRole, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(323, 323, 323))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(582, 582, 582))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDisplayRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(cmbStateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        String nw = cmbStateNetwork.getSelectedItem().toString();
        
        Network network = null;
        
        for(Network n: system.getNetworkList()) 
        {
            if (n.getNetworkName().equals(nw)) 
            {
                network = n;
            }
        }
        Type type = Type.valueOf(cmbOrganization.getSelectedItem().toString().split(" ")[0]);
        System.out.println("Check : " + type);
        String emailAddress = txtEmailId.getText();
        String username = txtUsername.getText();
        String name = txtName.getText();
        String password = txtPassword.getText();
        String phone = txtContactNo.getText();
        String city = txtCity.getText();

        if (network == null || type == null || name.isEmpty() || username.isEmpty() || password.isEmpty() || emailAddress.isEmpty() || city.isEmpty() || phone.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All of the above the fields are required for registration!!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!system.checkValidPassword(password))
        return;
        if (!system.checkUniqueUsername(username))
        return;
        if (!this.system.validateEmailFormat(emailAddress))
        return;
        if (!this.system.validatePhoneFormat(phone))
        return;

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getEmail() != null) {
                            if (u.getEmail().toLowerCase().equals(emailAddress.toLowerCase())) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Email Address already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
            }
        }

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        String phoneNo = String.valueOf(u.getPhoneNo());
                        if (phoneNo!= null) {
                            if (phoneNo.equals(phone)) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Contact Number already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
            }
        }

        if (Organization.Type.Farmer == type)
        {
            flag = true;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.FarmerCommunity)
                {
                    Organization org = enterprise.getOrganizationDirectory().createOrganization(type, name);
                    Employee emp = org.getEmployeeDirectory().createEmployee(name);
                    UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(username, password, emp, new Farmer());
                    ua1.setEmail(emailAddress);
                    ua1.setPhoneNo(Long.parseLong(phone));
                    ua1.setCity(city);
                    String bodyMsg = "Hello " + username + ", \n Thank you for registering with us. Your account is activated. Happy Farming!";
                }
            }
        }
        else
        {
            UserRegistrationRequest registrationRequest = new UserRegistrationRequest();
            registrationRequest.setOrgName(name);
            registrationRequest.setUserName(username);
            registrationRequest.setPassword(password);
            registrationRequest.setEmailId(emailAddress);
            registrationRequest.setNetwork(network);
            registrationRequest.setCity(city);
            registrationRequest.setOrgType(type);
            registrationRequest.setStatus("Requested");
            registrationRequest.setContactNo(phone);

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
                {
                    System.out.println("Inside Userregistration Org : " + org);
                    if (org.getName().equals(name))
                    {
                        if (enterprise.getWorkQueue() == null)
                        {
                            enterprise.setWorkQueue(new WorkQueue());
                        }
                        flag = true;
                    }
                }
                if(flag)
                {
                    enterprise.getWorkQueue().getWorkRequestList().add(registrationRequest);
                }
            }
        }
        if (flag)
        {
            String bodyMsg = "Hello " + username + ", \n Thank you for registering with us. Your account will be activated within 48 hours. We will keep you posted here.";
            // We need to implement SMS and Email here
            JOptionPane.showMessageDialog(null, "You have been registered succesfully!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry! No such Organization is created by the enterprise");
        }
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmailId.setText("");
        txtCity.setText("");
        txtContactNo.setText("");
        btnRegister.setEnabled(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cmbOrganizationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrganizationItemStateChanged
        // TODO add your handling code here:
        String orgType = cmbOrganization.getSelectedItem().toString();
        String Role = "";
        
        if(orgType.equals("Farmer Organization"))
            Role = "Farmer";
        else if(orgType.equals("ShopOwner Organization"))
            Role = "Shop Owner";
        else if(orgType.equals("Transporter Organization"))
            Role = "Transporter";
        else if(orgType.equals("BigMarket Organization"))
            Role = "Big Market Manager";
        else if(orgType.equals("Company Organization"))
            Role = "Company Manager";
        else if(orgType.equals("NGO Organization"))
            Role = "NGO Officer";

        lblDisplayRole.setText("Role : " + Role);
    }//GEN-LAST:event_cmbOrganizationItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbOrganization;
    private javax.swing.JComboBox<String> cmbStateNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblDisplayRole;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
