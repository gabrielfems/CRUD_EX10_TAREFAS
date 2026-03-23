package com.atv.ex10.Service;

import com.atv.ex10.Model.Tarefa;
import com.atv.ex10.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> listaTarefas() {
        return repository.findAll();
    }

    public Optional<Tarefa> exibeTarefa(Long id) {
        return repository.findById(id);
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public void deletarTarefa(Long id) {
        repository.deleteById(id);
    }
}