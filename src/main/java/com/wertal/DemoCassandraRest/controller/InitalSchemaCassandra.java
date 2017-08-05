package com.wertal.DemoCassandraRest.controller;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by wertalp on 04.08.17.
 */
@Component
public class InitalSchemaCassandra implements CommandLineRunner {

    private Cluster cluster;
    private Session session;


    public InitalSchemaCassandra(Cluster cluster, Session session) {
        this.cluster = cluster;
        this.session = session;
        cluster.getMetadata().getKeyspaces().stream().forEach(item -> System.out.println("KKKKEEEEE : " + item));
    }

    ;


    public void initial() {


        String createTypeAdresse = "create TYPE if not exists kspers.adresse_type ( plz text, \n " +
                " street text , \n " +
                " country  text ) \n ";

        String dropTable = "drop table if exists kspers.customer";
        String dropType = "drop Type if exists kspers.adresse_type";

        String createCustomer = "create table if not exists kspers.customer ( \n " +
                " customerid uuid PRIMARY KEY, \n " +
                " name text , \n " +
                " vorname text , \n " +
                " createdate timestamp , \n " +
                " adresse list<FROZEN <adresse_type>> , \n " +
                " phones list< text> ) \n ";


        this.session.execute(dropTable);
        this.session.execute(dropType);
        this.session.execute(createTypeAdresse);
        this.session.execute(createCustomer);
        System.out.println("Excute creating Table  Customer");


    }

    @Override
    public void run(String... strings) throws Exception {
        initial();
    }
}
