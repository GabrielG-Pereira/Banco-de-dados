package com.trabalho.bookclub.repository;

import com.trabalho.bookclub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
