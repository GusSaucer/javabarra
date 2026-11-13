package ex4;

public class AuditoriaInterna {
    private double totalTributos;

    public void registrar(ContaBancaria conta) {
        double tributo = conta.calcularTributos();
        System.out.printf("%s: R$ %.2f%n", conta.getTitular(), tributo);
        totalTributos += tributo;
    }

    public void exibirTotal() {
        System.out.printf("Total de tributos: R$ %.2f%n", totalTributos);
    }
}