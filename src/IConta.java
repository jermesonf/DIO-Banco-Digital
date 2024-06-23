public interface IConta {

    //todos metodos em uma interface sao publicos
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
