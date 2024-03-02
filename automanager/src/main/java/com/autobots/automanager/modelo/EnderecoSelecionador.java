package com.autobots.automanager.modelo;

import java.util.List;

import com.autobots.automanager.entidades.Endereco;


public class EnderecoSelecionador {
	public Endereco selecionar(List<Endereco> enderecos, long id) {
		for (Endereco endereco : enderecos) {
			if (endereco.getId() == id) {
				return endereco;
			}
		}
		return null;
	}
}
