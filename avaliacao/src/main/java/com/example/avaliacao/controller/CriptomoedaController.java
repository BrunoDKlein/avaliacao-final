package com.example.avaliacao.controller;

import com.example.avaliacao.entity.Criptomoeda;
import com.example.avaliacao.service.CriptomoedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/criptomoeda")
public class CriptomoedaController {
    @Autowired
    private CriptomoedaService criptomoedaService;

    @PostMapping
    public Criptomoeda salvaCriptomoeda(@RequestBody Criptomoeda criptomoeda) {
        return criptomoedaService.salvarCriptomoeda(criptomoeda);
    }

    @GetMapping("{id}")
    public Criptomoeda buscaCriptomoedaPorId(@PathVariable Long id) {
        return criptomoedaService.buscarCriptomoedaPorId(id).get();
    }

    @GetMapping
    public List<Criptomoeda> listaCriptomoedas() {
        return criptomoedaService.buscarTodasAsCriptomoedas();
    }

    @PutMapping("{id}")
    public String editaCriptomoeda(@PathVariable Long id, @RequestBody Criptomoeda criptomoeda) {
        Optional<Criptomoeda> criptomoedaAtual = criptomoedaService.buscarCriptomoedaPorId(id);
        if (criptomoedaAtual.isEmpty()) {
            return "Criptomoeda com id " + id + " não encontrada";
        }
        criptomoeda.setId(criptomoedaAtual.get().getId());
        criptomoedaService.editarCriptomoeda(criptomoeda);
        return "Criptomoeda atualizada com sucesso";
    }

    @DeleteMapping("{id}")
    public String deletaCriptomoeda(@PathVariable Long id) {
        criptomoedaService.excluirCriptomoeda(id);
        return "Criptomoeda deletada com sucesso";
    }

    @GetMapping("converte/{moeda}/{valor}")
    public HashMap converte(@PathVariable String moeda, @PathVariable Double valor) {
        HashMap conversao = new HashMap<String, Double>();
        Criptomoeda criptomoedaParaConverter = criptomoedaService.buscarCriptomoedaPorSigla(moeda);
        conversao.put(criptomoedaParaConverter.getSigla(), valor);
        conversao.put("R$", (criptomoedaParaConverter.getPrecoAtual() * valor));
        return conversao;
    }
}



