class Carro {
    private String modelo, cor;
    private boolean eletrico; //true para eletrico false para manual
    private int pneus = 4;
    Carro( String cor, boolean eletrico) { // MÉTODO CONSTRUCTOR - só acontece uma vez e serve para criar o objeto
        this.modelo = modelo;
        this.cor = cor;
        this.eletrico = eletrico;
        this.pneus = pneus;
    }

    public String getModelo() { // Método GETTER
        return this.modelo;
    }

    public int getPneus() { // Método GETTER
        return this.pneus;
    }

    public String getCor() { // Método GETTER
        return this.cor;
    }

    public boolean setCor(String cor) { // Método SETTER
        if (!cor.equals("Branco")){
            this.cor = cor;
            return true;
        }
            return false;
        }

    void ligar() {
        System.out.println("Ligado!");
    }


}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro( "Marrom", false);


        meuCarro.ligar();
        System.out.println(meuCarro.setCor("Branco"));


    }
}
