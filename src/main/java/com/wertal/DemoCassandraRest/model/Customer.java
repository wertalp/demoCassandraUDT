package com.wertal.DemoCassandraRest.model;

import com.datastax.driver.core.schemabuilder.UDTType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by wertalp on 04.08.17.
 */
@Table(value = "customer")
public class Customer {
    @PrimaryKey
    @Column(value = "customerid")
    UUID customerid;
    @Column(value = "name")
    String name;
    @Column(value = "vorname")
    String vorname;
    @Column(value = "phones")
    List<String> phones;
    @Column(value = "createdate")
    LocalDateTime createdate;
    @Column(value = "adresse")
    private List<Adresse_type> adresse;

    public Customer() {
    }

    public UUID getCustomerid() {
        return customerid;
    }

    public void setCustomerid(UUID customerid) {
        this.customerid = customerid;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String Vorname) {
        vorname = Vorname;
    }

    public LocalDateTime getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDateTime createdate) {
        this.createdate = createdate;
    }

    public List<Adresse_type> getAdresse() {
        return adresse;
    }

    public void setAdresse(List<Adresse_type> adresse) {
        this.adresse = adresse;
    }
}
