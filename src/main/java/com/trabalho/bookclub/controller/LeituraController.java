package com.trabalho.bookclub.controller;

import com.trabalho.bookclub.model.Leitura;
import com.trabalho.bookclub.repository.LeituraRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/leituras")
public class LeituraController {
    private final LeituraRepository repo;
    public LeituraController(LeituraRepository repo){ this.repo = repo; }

    @GetMapping public List<Leitura> listar(){ return repo.findAll(); }

    @PostMapping
    public Leitura criar(@RequestBody Leitura l){
        if (l.getDataInicio()==null) l.setDataInicio(LocalDate.now());
        return repo.save(l);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Leitura> atualizar(@PathVariable Long id, @RequestBody Leitura body){
        return repo.findById(id).map(existing -> {
            existing.setDataFim(body.getDataFim());
            return ResponseEntity.ok(repo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/agrupamento")
    public List<Map<String,Object>> agrupamento(){
        List<Object[]> rows = repo.countLeiturasPorUsuario();
        List<Map<String,Object>> out = new ArrayList<>();
        for (Object[] r: rows){
            Map<String,Object> m = new HashMap<>();
            m.put("nome", r[0]);
            m.put("total", r[1]);
            out.add(m);
        }
        return out;
    }
}
