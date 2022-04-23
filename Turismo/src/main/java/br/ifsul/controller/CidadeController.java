package br.ifsul.controller;

import br.ifsul.dto.Cidade;
import br.ifsul.repository.CidadeRepository;
import br.ifsul.service.CidadeService;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import antlr.collections.List;

@RestController
@RequestMapping("/turismo")
public class CidadeController {
    private CidadeService service;

    @PostMapping("/adicionar")
    void adicionarCidade(@RequestBody Cidade cidade) {
        service.adicionarCidade(cidade);
    }

    
    
    @GetMapping(value = "/{cpf}")
    public ResponseEntity<Cidade> buscar(@PathVariable String nome) {
        Cidade obj = CidadeService.findByNome(nome);
        return ResponseEntity.ok().body(obj);
    }
  
    
}
