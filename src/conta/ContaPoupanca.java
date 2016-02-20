package conta;

import java.math.BigDecimal;

import cliente.Cliente;

public class ContaPoupanca extends ContaCorrente {

	private BigDecimal limiteSaque;

	public ContaPoupanca(int numero, BigDecimal saldo, BigDecimal limiteSaque, Cliente cliente) {
		super(numero, saldo, cliente);
		this.limiteSaque = limiteSaque;
		// TODO Auto-generated constructor stub
	}

}
