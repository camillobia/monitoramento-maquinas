package com.cloudtech.monitoramento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudtech.monitoramento.model.Maquina;

@RestController
@RequestMapping("/maquinas")
public class MaquinaController {

    private static final List<Maquina> maquinas = new ArrayList<>();
    private static Long proximoId = 1L;

    // Cadastrar uma máquina
    @PostMapping("/cadastro")
    public Maquina cadastrar(@RequestBody Maquina maquina) {

        maquina.setId(proximoId);
        proximoId++;

        maquinas.add(maquina);

        return maquina;
    }

    // Listar todas as máquinas cadastradas
    @GetMapping
    public List<Maquina> listar() {
        return maquinas;
    }
}