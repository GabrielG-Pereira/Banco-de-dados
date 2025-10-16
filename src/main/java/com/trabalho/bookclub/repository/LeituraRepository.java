package com.trabalho.bookclub.repository;

import com.trabalho.bookclub.model.Leitura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface LeituraRepository extends JpaRepository<Leitura, Long> {
    @Query("SELECT u.nomeCompleto, COUNT(l) FROM Leitura l JOIN l.usuario u GROUP BY u.usuarioId")
    List<Object[]> countLeiturasPorUsuario();
}
