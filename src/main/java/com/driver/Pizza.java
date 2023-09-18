package com.driver;

public class Pizza {

    private final int cheesePrice;
    private final int toppingsPrice;
    private final int paperBagPrice;
    private boolean validBag;
    private boolean validCheese;
    private boolean validToppings;
    private boolean validBill;
    private int price;
    private final Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price = 300;
            toppingsPrice = 70;
        }
        else{
            this.price=400;
            toppingsPrice = 120;
        }

        cheesePrice = 80;
        paperBagPrice = 20;

        bill = "Base Price Of The Pizza: " + price+"\n";

        // your code goes here
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public Boolean getValidBag() {
        return validBag;
    }

    public void setValidBag(Boolean validBag) {
        this.validBag = validBag;
    }

    public Boolean getValidCheese() {
        return validCheese;
    }

    public void setValidCheese(Boolean validCheese) {
        this.validCheese = validCheese;
    }

    public Boolean getValidToppings() {
        return validToppings;
    }

    public void setValidToppings(Boolean validToppings) {
        this.validToppings = validToppings;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!getValidCheese()){
            price += cheesePrice;
            setValidCheese(true);
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!getValidToppings()){
            price += toppingsPrice;
            setValidToppings(true);
        }

    }

    public void addTakeaway(){
        if(!getValidBag()){
            price += paperBagPrice;
        }
        setValidBag(true);
    }

    public String getBill(){
        if(!validBill){
            if(getValidCheese()){
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(getValidToppings()){
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(validBag){
                bill+= "Paperbag Added: " + paperBagPrice + "\n";
            }
            bill += "Total Price: "+price+"\n";
            this.validBill = true;
        }
        return this.bill;
    }
}
