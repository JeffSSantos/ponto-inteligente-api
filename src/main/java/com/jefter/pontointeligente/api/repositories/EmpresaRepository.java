package com.jefter.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jefter.pontointeligente.api.entities.Empresa;

/**
 * Repositorio da entidade Empresa.
 * 
 * @author Jefter
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
