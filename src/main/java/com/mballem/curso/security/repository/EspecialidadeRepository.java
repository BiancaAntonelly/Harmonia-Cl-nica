package com.mballem.curso.security.repository;

import com.mballem.curso.security.domain.Especialidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
    @Query("select e from Especialidade e where (lower(substring(e.titulo, 1, 1)) = lower(:search) or lower(e.titulo) like lower(concat('%', :search, '%')))")
    Page<Especialidade> findAllByTitulo(@Param("search")String search, Pageable pageable);
}
