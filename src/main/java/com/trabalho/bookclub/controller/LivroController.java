package com.trabalho.bookclub.controller;

import com.trabalho.bookclub.model.Livro;
import com.trabalho.bookclub.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroRepository repo;
    public LivroController(LivroRepository repo){ this.repo = repo; }

    @GetMapping public List<Livro> listar(){ return repo.findAll(); }
    @PostMapping public Livro criar(@RequestBody Livro l){ return repo.save(l); }
}
