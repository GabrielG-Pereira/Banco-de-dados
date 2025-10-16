package com.trabalho.bookclub.repository;

import com.trabalho.bookclub.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {}
