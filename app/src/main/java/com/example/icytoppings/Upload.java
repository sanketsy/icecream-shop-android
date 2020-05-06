package com.example.icytoppings;

public class Upload {

    private String Icecream;
    private String Cost;

    Upload() {}

    public String toString() {
        return "Icecream = " + Icecream +
                "\n" + Cost ;
    }

    public Upload(String Icecream, String Cost) {
        this.Icecream = Icecream;
        this.Cost = Cost;
    }

    public String getIcecream() {
        return Icecream;
    }

    public void setIcecream(String Icecream) {
        this.Icecream = Icecream;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }


}
