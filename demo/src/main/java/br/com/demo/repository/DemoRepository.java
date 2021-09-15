package br.com.demo.repository;

import br.com.demo.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Long> {

    Demo findByNome(String nome);

    Demo findByTelefone(String telefone);


}


