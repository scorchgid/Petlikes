/**
 * @author k1009705(Gideon), k1258579(Charlotte)
 */

package uk.ac.kingston.ci5100.petlikes_pair4.utils;

import java.util.ArrayList;

public class IndividualPetStore implements Comparable<IndividualPetStore>

{
    private String shopName;
    private String rawAddress;
    private String phoneNumbers;
    private String website;
    private String openCloseTime;
    
    //Address splitting
    private String[] arrayAddress;
    private String addressFirstLine; 
    private String addressCounty;
    private String addressPostcode;
    private String addressCountry;
    //Phone Num to an Integer
    private Integer phoneNumbersNum;
    
    private ArrayList<IndividualPet> pet = new ArrayList<IndividualPet>();

    public ArrayList<IndividualPet> getPets() {
        return pet;
    }
    public void setPet(ArrayList<IndividualPet> pet) {
        this.pet = pet;
    }

    public IndividualPetStore(String shopName, String rawAddress, String phoneNumbers, String website, String openCloseTime) {
        this.shopName = shopName;
        this.rawAddress = rawAddress;
        this.phoneNumbers = phoneNumbers;
        this.website = website;
        this.openCloseTime = openCloseTime;
    }

    //--ToString--
    /**
     * Redoes a pet store to string separated by commas
     * (kinda like the original file/array)
     * @return formatted address in string format
     */
    @Override
    public String toString() {
        return shopName + ", " + rawAddress + ", " + phoneNumbers + ", " + website + ", " + openCloseTime;
    }
    /**
     * Get an individual pet store in formatted input
     * @return formatted petstore info
     */
    public String getIndividualPetStore()
    {
        String a = 
                this.getShopName() +"\n"
                + this.getRawAddress() +"\n"
                + this.getPhoneNumbers() +"\n"
                + this.getWebsite() +"\n"
                + this.getOpenCloseTimes()+"\n";
        return a;
    }
            
    //method that returns a string, and that stirng is the format that you want to appear of your petshops
    //
    
    //--ConvertTelephoneNumberStringToInt--
   /**
     * convert phone numbers to int, not sure why we kept this so ignore
     * @return phone number as int
     */
    public int getTelephoneAsInt ()
    {
        int s = Integer.parseInt(this.getPhoneNumbers());
        return s;
    }
            
    //--Compareable--
    
    /**
     * Sorts shops by name
     * @return sorted shop names
     */
    
    public int compareTo(IndividualPetStore q)
    {
        return this.getShopName().compareToIgnoreCase(q.getShopName());
    }
    
    //---GetandSetters---
    
    /**
     * 
     * @return shopName as String
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 
     * @param shopName new value of name
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * gets the rawAddress
     * @return rawAddress as String
     */
    public String getRawAddress() {
        return rawAddress;
    }  
    
    /**
     * sets the rawAddress
     * @param rawAddress a string containing AddressLine1
     */
    public void setRawAddress(String rawAddress) {
        this.rawAddress = rawAddress;
    }
    
    /**
     *
     * @return phoneNumbers as String
     */ 
    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * 
     * @param phoneNumbers String containing phoneNumbers
     */
    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    
    /**
     * 
     * @return website as String
     */
    public String getWebsite() {
        return website;
    }
    
    /**
     * 
     * @param website String containing website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 
     * @return openCloseTime as String
     */
    public String getOpenCloseTimes() {
        return openCloseTime;
    }
    
    /**
     * sets the openCloseTime
     * @param openCloseTime String containing openCloseTime
     */
    public void setOpenCloseTime(String openCloseTime) {
        this.openCloseTime = openCloseTime;
    }  
    
    //---Get and Set for Splitted Address---
    /**
     * gets the addressFirstLine
     * @return addressFirstLine as String
     */
    public String getAddressFirstLine() {
        return addressFirstLine;
    }

    /**
     * sets the addressFirstLine
     * @param addressFirstLine a string containing addressFirstLine
     */
    public void setAddressFirstLine(String addressFirstLine) {
        this.addressFirstLine = addressFirstLine;
    }

    /**
     * gets the addressCounty
     * @return addressCounty as String
     */
    public String getAddressCounty() {
        return addressCounty;
    }

    /**
     * sets the addressCounty
     * @param addressCounty a string containing AddressCounty
     */
    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    /**
     * gets the addressCountry
     * @return addressCountry as String
     */
    public String getAddressCountry() {
        return addressCountry;
    }

    /**
     * sets the addressCountry
     * @param addressCountry a string containing AddressCountry
     */
    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    /**
     * gets the AddressPostcode
     * @return AddressPostcode as String
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * sets the addressPostcode
     * @param addressPostcode a string containing AddressLine1
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }   
}
