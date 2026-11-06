package com.cloudtech.monitoramento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudtech.monitoramento.model.Producao;

@RestController
@RequestMapping("/producao")
public class ProducaoController {

    private static final List<Producao> registros = new ArrayList<>();

    // Registrar dados de produção
    @PostMapping
    public Producao cadastrar(@RequestBody Producao producao) {

        registros.add(producao);

        return producao;
    }

    // Consultar dados de produção
    @GetMapping
    public List<Producao> listar() {

        return registros;
    }
}