package com.francaemp.project.cadastropessoa.services;

import com.francaemp.project.cadastropessoa.model.Pessoa;
import com.francaemp.project.cadastropessoa.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;


    public Pessoa retornaPessoa() throws Exception {
        return pessoaRepository.retornaPessoa();
    }




}
