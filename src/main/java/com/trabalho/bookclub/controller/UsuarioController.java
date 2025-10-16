package com.trabalho.bookclub.controller;

import com.trabalho.bookclub.model.Usuario;
import com.trabalho.bookclub.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository repo;
    public UsuarioController(UsuarioRepository repo){ this.repo = repo; }

    @GetMapping public List<Usuario> listar(){ return repo.findAll(); }
    @PostMapping public Usuario criar(@RequestBody Usuario u){ return repo.save(u); }
}
