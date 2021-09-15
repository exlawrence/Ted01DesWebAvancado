package br.com.demo.controller;

import br.com.demo.model.Demo;
import br.com.demo.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class Controller {

    @AllArgsConstructor
    @RestController
    @RequestMapping("api/demo")
    public class DemoController {


        private final DemoService service;


        @GetMapping
        public List<Demo> getList() {
            return this.service.demos();
        }

        @GetMapping("/nome")
        public Demo getByName(@RequestParam("nome") String nome) {
            return this.service.getByName(nome);
        }

        @GetMapping("/telefone")
        public Demo getByTelefone(@RequestParam ("telefone")String telefone) {
            return this.service.getByTelefone(telefone);

        }

        @PostMapping
        public String Post(@RequestBody Demo demo){
            this.service.save(demo);
            return "demo salve com sucesso post";
        }

        @PutMapping
        public String Put(){
            return "recebendo put";
        }

        @DeleteMapping("/{id}")
        public String Delete(@PathVariable("id")Long id){
            this.service.remove(id);
            return "removendo delete";
        }
        @DeleteMapping
        public String Delete2(@RequestParam("id")Long id){
            this.service.remove(id);
            return "removendo delete";
        }
    }

}
