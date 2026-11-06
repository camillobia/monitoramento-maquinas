package com.cloudtech.monitoramento.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "Bem-vindo ao sistema de monitoramento de máquinas da CloudTech Solutions!";
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        Map<String, String> resposta = new HashMap<>();

        resposta.put("status", "online");
        resposta.put("mensagem", "Aplicação de monitoramento em execução");

        return resposta;
    }

    @GetMapping("/versao")
    public String versao() {
        return "Versão 1.0.0";
    }
}