package com.example.avaliacao.service;

import com.example.avaliacao.entity.Criptomoeda;
import com.example.avaliacao.repository.CriptomoedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CriptomoedaService {
    @Autowired
    private CriptomoedaRepository criptomoedaRepository;

    public Criptomoeda salvarCriptomoeda(Criptomoeda criptomoeda) {
        return criptomoedaRepository.save(criptomoeda);
    }

    public Optional<Criptomoeda> buscarCriptomoedaPorId(Long id) {
        return criptomoedaRepository.findById(id);
    }

    public List<Criptomoeda> buscarTodasAsCriptomoedas() {
        return criptomoedaRepository.findAll();
    }

    public Criptomoeda editarCriptomoeda(Criptomoeda criptomoeda) {
        return criptomoedaRepository.save(criptomoeda);
    }

    public void excluirCriptomoeda(Long id) {
        criptomoedaRepository.deleteById(id);
    }

    public Criptomoeda buscarCriptomoedaPorSigla(String sigla) {
        return criptomoedaRepository.findBySigla(sigla);
    }


}


