package com.trabalho.bookclub.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Leitura {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leituraId;

    @ManyToOne @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne @JoinColumn(name = "livro_id")
    private Livro livro;

    private LocalDate dataInicio;
    private LocalDate dataFim;

    // getters e setters
    public Long getLeituraId() { return leituraId; }
    public void setLeituraId(Long id) { this.leituraId = id; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario u) { this.usuario = u; }
    public Livro getLivro() { return livro; }
    public void setLivro(Livro l) { this.livro = l; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate d) { this.dataInicio = d; }
    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate d) { this.dataFim = d; }
}
