package com.francaemp.project.cadastropessoa.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francaemp.project.cadastropessoa.model.Pessoa;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {
	
	@GetMapping
	public ResponseEntity<Pessoa> procuraPessoa (){
		return ResponseEntity.ok(new Pessoa ("Romario",29));
	}

}
