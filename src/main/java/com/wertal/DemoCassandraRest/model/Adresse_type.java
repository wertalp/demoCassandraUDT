package com.wertal.DemoCassandraRest.model;

import org.springframework.data.cassandra.mapping.UserDefinedType;

/**
 * Created by wertalp on 04.08.17.
 */
@UserDefinedType("adresse_type")
public class Adresse_type {
    String plz;
    String street;
    String country;

    public Adresse_type() {
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStreet() {
        
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
