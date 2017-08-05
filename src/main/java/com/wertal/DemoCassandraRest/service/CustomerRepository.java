package com.wertal.DemoCassandraRest.service;

import com.wertal.DemoCassandraRest.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by wertalp on 04.08.17.
 */
public interface CustomerRepository extends CrudRepository<Customer, UUID> {

}
