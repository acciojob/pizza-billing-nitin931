package com.driver;

public class Pizza {

    private Boolean validBag;
    private Boolean validCheese;
    private Boolean validToppings;
    private int price;
    private final Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        validCheese = true;
        validToppings = true;
        validBag = true;
        if(isVeg){
            this.price = 300;
            bill = "Veg pizza base price : 300\n";
        }
        else{
            this.price=400;
            bill = "Non-veg pizza base price : 400\n";
        }

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
        if(getValidCheese()){
            bill += "Extra Cheese Price : 80\n";
            price += 80;
            setValidCheese(false);
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(getValidToppings()){
            if(isVeg){
                bill += "Extra Toppings For Veg Pizza : 70\n";
                price += 70;
            }
            else{
                bill += "Extra Toppings For Non-veg Pizza : 120\n";
                price += 120;
            }
            setValidToppings(false);
        }

    }

    public void addTakeaway(){
        if(getValidBag()){
            bill += "Paper bag Price : 20\n";
            price += 20;
        }
        setValidBag(false);
    }

    public String getBill(){
        // your code goes here
        return this.bill + "Total : "+price;
    }
}
