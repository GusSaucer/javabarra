

public class Ex4 {
    public static void main(String[] args) {
    int ano = 2030;

    if (ano%400 == 0){
        System.out.println("É bissexto  ");
    }else if(ano%100== 0){
        System.out.println("Não é bissexto  ");
    }else if(ano%4 == 0){
        System.out.println("É bissexto  ");
    }else{
        System.out.println("Não é bissexto  ");
    }
    }
}