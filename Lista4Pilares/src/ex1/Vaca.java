package ex1;
public class Vaca extends Animal{
    public Vaca(String nome) {
        super(nome);
    }

    @Override// NÃO É MAIS OBRIGATÓRIO
    public String emitirSom() {
        return "Muuu";
    }
}
