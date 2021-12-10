/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EnterpriseAdmins;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.RoleBigMarketManager.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sagar
 */
public class PanelBMSetupAdminWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    
    /**
     * Creates new form PanelBigMarketManagerWorkArea
     */
    public PanelBMSetupAdminWorkArea(JPanel upc, UserAccount acc, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = upc;
        this.account = acc;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        manageOrganization();
    }
    
    private void manageOrganization() 
    {
        PanelBMSetupManageOrganization bnmoj = new PanelBMSetupManageOrganization(enterprise.getOrganizationDirectory());
        pnlRight.add("PanelBMSetupManageOrganization", bnmoj);
        CardLayout layout = (CardLayout) pnlRight.getLayout();
        layout.next(pnlRight);
    }
    
    private void manageUserAccount() 
    {
        PanelBMSetupManageUserAccount bnmoj = new PanelBMSetupManageUserAccount(enterprise, system, organization);
        pnlRight.add("PanelBMSetupManageUserAccount", bnmoj);
        CardLayout layout = (CardLayout) pnlRight.getLayout();
        layout.next(pnlRight);
    }
    
    private void manageUserRequests() 
    {
        PanelBMSetupManageWorkRequest bnmoj = new PanelBMSetupManageWorkRequest(enterprise);
        pnlRight.add("PanelBMSetupManageWorkRequest", bnmoj);
        CardLayout layout = (CardLayout) pnlRight.getLayout();
        layout.next(pnlRight);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        lblTopHeading = new javax.swing.JLabel();
        lblIconManageOrg = new javax.swing.JLabel();
        lblIconManageUserAcc = new javax.swing.JLabel();
        lblIconManageRequest = new javax.swing.JLabel();
        lblManageOrganization = new javax.swing.JLabel();
        lblManageUserAcc = new javax.swing.JLabel();
        lblManageRequest = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();

        lblTopHeading.setText("BIG MARKET SETUP ENTERPRISE");

        lblIconManageOrg.setText("Logo");

        lblIconManageUserAcc.setText("Logo");

        lblIconManageRequest.setText("Logo");

        lblManageOrganization.setText("MANAGE ORGANIZATION");
        lblManageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageOrganizationMousePressed(evt);
            }
        });

        lblManageUserAcc.setText("MANAGE USER ACCOUNT");
        lblManageUserAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageUserAccMousePressed(evt);
            }
        });

        lblManageRequest.setText("MANAGE USER REQUESTS");
        lblManageRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageRequestMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTopHeading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                        .addComponent(lblIconManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                        .addComponent(lblIconManageUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManageUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                        .addComponent(lblIconManageRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManageRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTopHeading)
                .addGap(45, 45, 45)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconManageUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconManageRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(582, Short.MAX_VALUE))
        );

        pnlRight.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageOrganizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageOrganizationMousePressed
        manageOrganization();
    }//GEN-LAST:event_lblManageOrganizationMousePressed

    private void lblManageUserAccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageUserAccMousePressed
        manageUserAccount();
    }//GEN-LAST:event_lblManageUserAccMousePressed

    private void lblManageRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageRequestMousePressed
        manageUserRequests();
    }//GEN-LAST:event_lblManageRequestMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIconManageOrg;
    private javax.swing.JLabel lblIconManageRequest;
    private javax.swing.JLabel lblIconManageUserAcc;
    private javax.swing.JLabel lblManageOrganization;
    private javax.swing.JLabel lblManageRequest;
    private javax.swing.JLabel lblManageUserAcc;
    private javax.swing.JLabel lblTopHeading;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    // End of variables declaration//GEN-END:variables
}
