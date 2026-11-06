class ContaBancaria{
    private String titular;
    private int numero;
    private double saldo;
    ContaBancaria(String titular, int numero, double depositoInicial){
        this.titular = titular;
        this.numero = numero;
        this.saldo = depositoInicial;
    }
    ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }
    //GETTERS:
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }

    //SETTER:
    void depositar(double valor){
        if (valor>0) {
            this.saldo += valor;
            exibirExtrato();
        }else{
            System.out.println("Valor inválido");
        }

    }

    boolean sacar(double valor){
        if (valor<=this.saldo){
            this.saldo -= valor;
            exibirExtrato();
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    //Método comum
    void exibirExtrato(){
        System.out.println("Seu extrato atual é de " + this.saldo);
    }

}