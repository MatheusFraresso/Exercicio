package cliente;

import java.util.Date;

public class Cliente {

	private String nome;
	private int id;
	private long cpf;
	private Date nascimento;

	public Cliente(String nome, int id, long cpf, Date nascimento) {
		this.nome = nome;
		this.id = id;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}

}
