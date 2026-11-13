public abstract class Funcionario {
    private String nome;
    private double salario;
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() { return nome; }
    public double getSalario() { return salario; }
    public double calcularBonus() {
        return salario * 0.10;
    }
    public abstract double calcularSalarioLiquido();
}