import java.util.Scanner;

public class Ex1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite seus segundos:  ");
                int segundos = scanner.nextInt();

                int dias = segundos/86400;
                int horas = (segundos% 86400)/ 3600;
                int minutos = (segundos%86400)%3600/60;
                segundos = (segundos%86400)%3600%60;

                System.out.println(
                        dias + " dia(s), "
                                + horas + " hora(s), "
                                + minutos + " minuto(s) e "
                                + segundos + " segundo(s)");
        }
}
