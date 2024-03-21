package com.example.demo5.repositories;

import com.example.demo5.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Repository
public class ClienteRepository {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ClienteRepositoryJPA repositoryJPA;

    public Cliente getByCpf(String cpf){
        return repositoryJPA.getByCpf(cpf);
    }
}
