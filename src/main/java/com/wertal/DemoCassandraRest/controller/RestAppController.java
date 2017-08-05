package com.wertal.DemoCassandraRest.controller;

import com.wertal.DemoCassandraRest.model.Adresse_type;
import com.wertal.DemoCassandraRest.model.Customer;
import com.wertal.DemoCassandraRest.service.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Created by wertalp on 04.08.17.
 */

@RestController
public class RestAppController {

    private CustomerRepository customerRepository;

    public RestAppController(CustomerRepository cus) {
        this.customerRepository = cus;
    }

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseBody
    public String getFoos() {
        List<String> phones = new ArrayList<>();
        List<Adresse_type> adresses = new ArrayList<>();
        Adresse_type addresse1 = new Adresse_type();
        Adresse_type addresse2 = new Adresse_type();
        addresse1.setCountry("Austria");
        addresse1.setStreet("Rennweg");
        addresse1.setPlz("A-3153 Eschenau");

        addresse2.setCountry("Italy");
        addresse2.setStreet("Maremio88");
        addresse2.setPlz("I-30330 Fiorenze");

        adresses.add(addresse1);
        adresses.add(addresse2);
        phones.add("+436764548232");
        phones.add("+417988034576");
        phones.add("+4143500789");
        Customer cust = new Customer();
        cust.setCustomerid(UUID.randomUUID());
        cust.setName("berger");
        cust.setVorname("Herbert");
        cust.setPhones(phones);
        cust.setCreatedate(LocalDateTime.now());
        cust.setAdresse(adresses);

        this.customerRepository.save(cust);

        return "Post some test data";
    }


    @RequestMapping(value = "**", method = RequestMethod.GET)
    @ResponseBody
    public String allotherfallback() {
        return "fallback data";
    }

    @RequestMapping(value = "/api/customer", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Customer> getcustomer() {

        return this.customerRepository.findAll();
    }


}


