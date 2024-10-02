package com.example.projetinho.Controller;

import com.example.projetinho.Entity.Usuario;
import com.example.projetinho.Service.ServiceAula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class ControllerAula {

    @Autowired
    private ServiceAula serviceAula;

    @PostMapping("/save")
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        try {
            return new ResponseEntity<>(serviceAula.save(usuario), HttpStatus.CREATED);

        }catch (Exception e){
            throw new RuntimeException("Erro ao criar o usuario");
        }
    }
}
