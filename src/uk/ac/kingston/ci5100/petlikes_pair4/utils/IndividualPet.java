/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.utils;

/**
 *
 * @author Scorchgid
 */
public class IndividualPet implements Comparable<IndividualPet>
{
    String shop;
    String type;
    String priceString;
    double price;
    String dateAcquired;
    String notes;
    
    public IndividualPet(String shop, String type, String priceString, String dateAcquired, String notes) throws Exception
    {
        this.shop = shop;
        this.type = type;
        this.priceString = priceString;
        this.dateAcquired = dateAcquired;
        this.notes = notes;
        this.price = priceStrings(priceString); //throws Exception;
    }  
    
    public double priceStrings(String a) throws Exception
    {
        double b = Double.parseDouble(a);
        return b;
    }
    
   @Override
   public String toString(){
       return shop + ", " + type + ", " + priceString + ", " + dateAcquired + ", " + notes;
   }
   
   public static String[] getPetHeader()
   {
       String[] colNames = {"Type", "Price","Date Acquired", "Addtional Notes"};
       return colNames;
   }
   
   public int compareTo(IndividualPet q)
   {
       return this.getShop().compareToIgnoreCase((q.getShop()));
   }
   
   
   
    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
