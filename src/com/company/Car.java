package com.company;

public class Car {
    private String make;
    private String model;

    public String getMake () {
        return make;
    }

    public void setMake(String newMake){
        make = newMake;

    }

    public String getModel (){
        return model;
    }
    public void setModel(String newModel){
        model = newModel;
    }

    public void getCarDetails() {
        System.out.println("This cars make is " + make );
        System.out.println("This cars model is " + model);
    }

}
