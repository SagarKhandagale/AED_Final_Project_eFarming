/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author sagar
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private EnterpriseDirectory enterpriseDirectory;
    private OrganizationDirectory organizationDirectory;
    
    private ArrayList<Network> networkList;
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public static void setInstance(EcoSystem system) {
        business = system;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdmin());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    public boolean checkUniqueNetwork(String networkName) 
    {
        for (Network n : business.getNetworkList()) 
        {
            if (n.getNetworkName().toLowerCase().equals(networkName.toLowerCase())) 
            {
                return false;
            }
        }
        return true;
    }
    
//    public boolean checkIfEnterpriseIsUnique(String entName) 
//    {
//        for (Network n : business.getNetworkList()) 
//        {
//            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) 
//            {
//                if (e.getName().toLowerCase().equals(entName.toLowerCase())) 
//                {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    public boolean checkUniqueUser(String userName) 
    {
        boolean flag = true;
        for (Network n : business.getNetworkList()) 
        {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) 
            {
                for (UserAccount u : e.getUserAccountDirectory().getUserAccountList()) 
                {
                    if (u.getUsername().toLowerCase().equals(userName.toLowerCase())) 
                    {
                        flag = false;
                    }
                }
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) 
                {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) 
                    {
                        if (u.getUsername().toLowerCase().equals(userName.toLowerCase())) 
                        {
                            flag = false;
                        }
                    }
                }
            }
        }
        if ("admin".equals(userName.toLowerCase())) {
            flag = false;
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Sorry! " + userName + " already exists in the system!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public boolean checkIfPhoneIsUnique(String phone, String username) 
    {
        for (Network n : business.getNetworkList()) 
        {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) 
            {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) 
                {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) 
                    {
                        String phoneNo = String.valueOf(u.getPhoneNo());
                        if (phoneNo != null) 
                        {
                            if (phoneNo.equals(phone) && !u.getUsername().equals(username)) 
                            {
                                JOptionPane.showMessageDialog(null, "Sorry! This Contact Number already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean checkValidPassword(String passwordValue) 
    {
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(passwordValue);
        return matcher.matches();
    }

    public boolean checkUniqueEmailId(String email, String username) 
    {
        for (Network n : business.getNetworkList()) 
        {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) 
            {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) 
                {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) 
                    {
                        if (u.getEmail() != null) 
                        {
                            if (u.getEmail().toLowerCase().equals(email.toLowerCase()) && !u.getUsername().equals(username)) 
                            {
                                JOptionPane.showMessageDialog(null, "Sorry! This Email Address already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
