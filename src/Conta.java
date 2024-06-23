import lombok.Getter;

//Classe abstratas não podem ser instanciadas
@Getter
public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;


    protected int agencia;

    protected int conta;

    protected double saldo;

    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        if(valor >= 0)
        {
            saldo += valor;
        }
        else
        {
            System.out.println("----------------------------------------\nNão foi possivel realizar o deposito\n----------------------------------------");
        }

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        if(valor <= this.saldo)
        {
            this.sacar(valor);
            contaDestino.depositar(valor);

            System.out.println("----------------------------------------\nTransferencia realizado com sucesso\n----------------------------------------");
        }
        else
        {
            System.out.println("----------------------------------------\nSaldo insuficiente para Transferencia\n----------------------------------------");
        }

    }

//
//    public int getAgencia() {
//        return agencia;
//    }
//
//    public int getConta() {
//        return conta;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }

    protected void imprimirInfosComuns(){
        System.out.println(this.cliente);
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


}
