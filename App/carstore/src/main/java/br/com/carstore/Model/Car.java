package br.com.carstore.Model;

public class Car {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }


}
