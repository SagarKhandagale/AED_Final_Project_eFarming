/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ShopItems;

/**
 *
 * @author Admin
 */
public class ShopItems {
    
    private int ItemId;
    private String ItemName;
    private String Measure;
    private String DiscountedPrice;

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int ItemId) {
        this.ItemId = ItemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getMeasure() {
        return Measure;
    }

    public void setMeasure(String Measure) {
        this.Measure = Measure;
    }

    public String getDiscountedPrice() {
        return DiscountedPrice;
    }

    public void setDiscountedPrice(String DiscountedPrice) {
        this.DiscountedPrice = DiscountedPrice;
    }
}
