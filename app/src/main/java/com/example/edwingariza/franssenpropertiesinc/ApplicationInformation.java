package com.example.edwingariza.franssenpropertiesinc;

/**
 * Created by edwingariza on 4/10/17.
 */

public class ApplicationInformation {

    String name;
    String address;
    String city;


public ApplicationInformation(int i, String string, String cursorString){

}

public ApplicationInformation()
{
    this.name = name;
    this.address = address;
    this.city = city;
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}