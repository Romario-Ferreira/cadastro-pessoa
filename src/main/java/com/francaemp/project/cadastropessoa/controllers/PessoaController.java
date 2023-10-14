package com.francaemp.project.cadastropessoa.controllers;

import com.francaemp.project.cadastropessoa.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francaemp.project.cadastropessoa.model.Pessoa;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {

	@Autowired
	PessoaService pessoaService;

	@GetMapping
	public ResponseEntity<Pessoa> procuraPessoa () throws Exception {
		return ResponseEntity.ok(pessoaService.retornaPessoa());
	}

}
