package conta;

import java.math.BigDecimal;

import cliente.Cliente;

public class ContaCorrente {
	private int numero;
	private BigDecimal saldo;
	private Cliente cliente;
	private String extrato;

	public ContaCorrente(int numero, BigDecimal saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public boolean saque(BigDecimal valor) {
		if (saldo.subtract(valor).doubleValue() < 0) {
			return false;
		} else {
			saldo = saldo.subtract(valor);
			String ext = "\nsaque no valor de " + valor;
			extrato.concat(ext);
			return true;
		}
	}

	public void deposito(BigDecimal valor) {
		saldo = saldo.add(valor);
		String ext = "\ndeposito no valor de " + valor;
		extrato.concat(ext);
	}

	public String gerarExtrato() {
		return extrato;
	}

}
