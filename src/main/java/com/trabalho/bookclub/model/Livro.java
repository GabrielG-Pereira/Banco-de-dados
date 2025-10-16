package com.trabalho.bookclub.model;

import jakarta.persistence.*;

@Entity
public class Livro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long livroId;

    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private String classificacaoIndicativa;

    @Column(length = 2000)
    private String descricao;

    // getters e setters
    public Long getLivroId() { return livroId; }
    public void setLivroId(Long id) { this.livroId = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String v) { this.titulo = v; }
    public String getAutor() { return autor; }
    public void setAutor(String v) { this.autor = v; }
    public String getGenero() { return genero; }
    public void setGenero(String v) { this.genero = v; }
    public String getEditora() { return editora; }
    public void setEditora(String v) { this.editora = v; }
    public String getClassificacaoIndicativa() { return classificacaoIndicativa; }
    public void setClassificacaoIndicativa(String v) { this.classificacaoIndicativa = v; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String v) { this.descricao = v; }
}
