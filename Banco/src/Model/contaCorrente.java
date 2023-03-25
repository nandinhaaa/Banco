package Model;

public class contaCorrente extends Conta {
    public contaCorrente(double saldo) {
        super(saldo);
    }
    
    @Override
    public void atualizar(double taxaPercentual) {
        super.atualizar(2 * taxaPercentual);
    }
}
