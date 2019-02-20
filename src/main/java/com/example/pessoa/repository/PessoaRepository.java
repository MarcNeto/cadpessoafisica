package com.example.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pessoa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, String>{
	
}
