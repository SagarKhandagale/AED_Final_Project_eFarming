/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author sagar
 */
public abstract class Role {
    
    public enum RoleType {
        
        Admin("Admin"),
        FarmerCommAdmin("FarmerCommAdmin"),
        TransporterAdmin("TransporterAdmin"),
        BigMarketAdmin("BigMarketAdmin"),
        FarmerHelpAdmin("FarmerHelpAdmin"),
        Farmer("Farmer"),
        ShopOwner("ShopOwner"),
        Transporter("Transporter"),
        BigMarketManager("BigMarketManager"),
        CompanyManager("CompanyManager"),
        NgoOfficer("NgoOfficer"),
        WeatherForecastManager("WeatherForecastManager"),
        SmartFarmingManager("SmartFarmingManager");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
}
