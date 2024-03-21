package com.example.demo5.repositories;

import com.example.demo5.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositoryJPA extends JpaRepository<Cliente, Long> {

    @Query("select cliente from Cliente cliente where cliente.cpf = ?1")
    public Cliente getByCpf(String cpf);

    public Cliente findByCpf(String cpf);
}
