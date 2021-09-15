package br.com.demo.service;

import br.com.demo.model.Demo;
import br.com.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DemoService {

    private final DemoRepository repository;

    public void save(Demo demo){
        this.repository.save(demo);
    }

    public List<Demo> demos(){
        return this.repository.findAll();
    }

    public void remove(Long id) {
        this.repository.deleteById(id);
    }
    public Demo getByName(String nome){
        return this.repository.findByNome(nome);
    }

    public Demo getByTelefone(String telefone) {
        return this.repository.findByTelefone(telefone);
    }

}