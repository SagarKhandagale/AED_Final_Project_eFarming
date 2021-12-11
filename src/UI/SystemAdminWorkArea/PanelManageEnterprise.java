/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.Organization.Type;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class PanelManageEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form PanelManageEnterprise
     */
    
    private final EcoSystem system;
    Enterprise enterprise;
    
    public PanelManageEnterprise(EcoSystem system) {
        initComponents();
        this.system = system;
        populateTable();
        populateComboBox();
    }
    
    private void populateTable() 
    {
        DefaultTableModel model = (DefaultTableModel) tblenterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) 
        {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                Object[] row = new Object[3];
                
                row[0] = enterprise.getName();
                row[1] = network.getNetworkName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
    
    private void populateComboBox() 
    {
        cmbNetwork.removeAllItems();
        cmbEnterpriseType.removeAllItems();

        for (Network network : system.getNetworkList()) 
        {
            cmbNetwork.addItem(network.toString());
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) 
        {
            cmbEnterpriseType.addItem(type.name());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblenterprise = new javax.swing.JTable();
        lblEnterpriseName = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        btnSaveEnterprise = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        lblEnterpriseType = new javax.swing.JLabel();
        cmbEnterpriseType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(223, 238, 234));

        tblenterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Enterprise Type"
            }
        ));
        jScrollPane1.setViewportView(tblenterprise);

        lblEnterpriseName.setText("Enter Enterprise Name:");

        btnSaveEnterprise.setText("Save Enterprise");
        btnSaveEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEnterpriseActionPerformed(evt);
            }
        });

        lblTitle.setText("Manage Enterprise");

        lblNetwork.setText("Network :");

        cmbNetwork.setToolTipText("");

        lblEnterpriseType.setText("Enterprise Type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(cmbNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEnterpriseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(btnSaveEnterprise)))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnSaveEnterprise)
                .addContainerGap(409, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEnterpriseActionPerformed
        
        String network = cmbNetwork.getSelectedItem().toString();
        
        Network nw = null;
        
        for(Network n: system.getNetworkList()) 
        {
            if (n.getNetworkName().equals(network)) 
            {
                nw = n;
            }
        }
        
        EnterpriseType type = EnterpriseType.valueOf(cmbEnterpriseType.getSelectedItem().toString().split(" ")[0]);
        
        String name = txtEnterpriseName.getText();

        if (nw == null || type == null || name.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields to Continue!");
            return;
        }
        if (system.checkUniqueEnterprise(name))
        {
            Enterprise enterprise = nw.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            JOptionPane.showMessageDialog(null, "Enterprise created sucessfully!");
            txtEnterpriseName.setText("");
            populateTable();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Enterprise name already exists in system!", "Warning", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSaveEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveEnterprise;
    private javax.swing.JComboBox<String> cmbEnterpriseType;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblenterprise;
    private javax.swing.JTextField txtEnterpriseName;
    // End of variables declaration//GEN-END:variables
}
