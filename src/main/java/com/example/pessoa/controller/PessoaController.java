package com.example.pessoa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pessoa.model.Pessoa;
import com.example.pessoa.repository.PessoaRepository;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@PostMapping
	public Pessoa adicionar(@RequestBody @Valid Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@DeleteMapping
	public Pessoa deletar(@RequestBody Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
		return pessoa;
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Pessoa> listaPessoas(){
		Iterable<Pessoa> listaPessoas = pessoaRepository.findAll();		
		return listaPessoas;		
	}
}
