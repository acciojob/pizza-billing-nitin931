package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public String getBill() {
        String bill;
        if(super.getVeg()){
            if(getValidBag()){
                bill = "Veg-Deluxe Pizza Price : "+getPrice();
            }
            else {
                bill = "Veg-Deluxe Pizza Prize : "+(getPrice()-20) +"\nPaper bag Price : 20";
            }
        }
        else{
            if(getValidBag()){
                bill = "Non-veg-Deluxe Pizza Price : "+getPrice();
            }
            else {
                bill = "Non-veg-Deluxe Pizza Prize : "+(getPrice()-20) +"\nPaper bag Price : 20";
            }

        }
        return bill +"\nTotal Price : "+getPrice();
    }

    @Override
    public void addExtraCheese() {

    }
    @Override
    public void addExtraToppings() {
        super.addExtraToppings();
    }
}
