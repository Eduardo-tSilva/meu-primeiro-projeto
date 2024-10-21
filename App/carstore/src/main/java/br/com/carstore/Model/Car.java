package br.com.carstore.Model;

public class Car {

    private String id;
    private String name;
    private String color;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public Car( String id, String name, String color) {
        this.id = id;
        this.color = color;
        this.name = name;
    }


}
