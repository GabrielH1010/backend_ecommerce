package com.example.demo5.services;

import com.example.demo5.domain.Cliente;
import com.example.demo5.repositories.ClienteRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepositoryJPA repositoryJPA;

    @Transactional()
    public List<Cliente> findAll() {
        return repositoryJPA.findAll();
    }
}
