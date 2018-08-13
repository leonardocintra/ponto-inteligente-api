package com.leonardo.pontointeligente.api.services;

import java.util.Optional;

import com.leonardo.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	Funcionario persistir(Funcionario funcionario);

	Optional<Funcionario> buscarPorCpf(String cpf);

	Optional<Funcionario> bucarPorEmail(String email);

	Optional<Funcionario> buscarPorId(Long id);
}
