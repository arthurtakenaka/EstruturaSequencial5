import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        double metros, centimetros;
        System.out.println("Digite quantos metros quer em cm: ");
        metros = entrada.nextDouble();
        centimetros = metros * 100;
        System.out.println("O valor deu : " +centimetros + " cm");
    }
}
