public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(
                "Gustavo",
                123,
                500.00);

        minhaConta.depositar(200.00);
        minhaConta.sacar(1000.00);
        minhaConta.sacar(300.00);
        minhaConta.exibirExtrato();
    }
}



