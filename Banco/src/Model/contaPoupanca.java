package Model;

	public class contaPoupanca extends Conta {
	    public contaPoupanca(double saldo) {
	        super(saldo);
	    }
	    
	    @Override
	    public void atualizar(double taxaPercentual) {
	        super.atualizar(3 * taxaPercentual);
	    }
	}

