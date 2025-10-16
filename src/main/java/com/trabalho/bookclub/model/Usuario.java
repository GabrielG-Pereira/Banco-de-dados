package com.trabalho.bookclub.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    private String nomeCompleto;
    private String email;
    private String senha;
    private String tipoUsuario;
    private String turmaNome;

    // getters e setters
    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long id) { this.usuarioId = id; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String v) { this.nomeCompleto = v; }
    public String getEmail() { return email; }
    public void setEmail(String v) { this.email = v; }
    public String getSenha() { return senha; }
    public void setSenha(String v) { this.senha = v; }
    public String getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(String v) { this.tipoUsuario = v; }
    public String getTurmaNome() { return turmaNome; }
    public void setTurmaNome(String v) { this.turmaNome = v; }
}
