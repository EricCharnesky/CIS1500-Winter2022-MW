package com.example.morejavafx;

public class Coffee {
    private String size;
    private String milk;
    private String sugar;
    private int milkQuantity;

    public Coffee(String size, String sugar) {
        this.size = size;
        this.milk = "";
        this.sugar = sugar;
        milkQuantity = 0;
    }

    @Override
    public String toString(){
        return size + " coffee with " + milkQuantity + " " + milk + " and sugar: " + sugar;
    }

    public String getSize() {
        return size;
    }
    
    public String getMilk() {
        return milk;
    }

    public void setNoMilk(){
        milk = "no milk";
    }

    public void setSoyMilk(){
        milk = "soy";
    }

    public void setWholeMilk(){
        milk = "whole milk";
    }

    public String getSugar() {
        return sugar;
    }

   public void setNoSugar(){
        sugar = "no sugar";
   }

   public void setSugar(){
        sugar = "sugar";
   }
   public void setNoSugarSugar(){
        sugar = "'no sugar' sugar";
   }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(int milkQuantity) {
        this.milkQuantity = milkQuantity;
    }
}
