package ex2;

public class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco>=0){
            this.preco = preco;
        }else{
            this.preco = 0;
            System.out.println("Preço Inválido");
        }
    }
    public double calcularFrete(){
        return 10.00;
    }

    public double calcularPrecoFinal(){
        return getPreco() + calcularFrete();
    }
}
