package com.francaemp.project.cadastropessoa.repositories;

import com.francaemp.project.cadastropessoa.model.Pessoa;
import com.francaemp.project.cadastropessoa.utils.Encriptador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

    default Pessoa retornaPessoa (){
        return new Pessoa ("Romario",29, Encriptador.encriptar("teste"));
    }
}
