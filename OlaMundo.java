import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {

        System.out.println("Olá Mundo!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite A: ");
        Integer a = entrada.nextInt();

        System.out.print("Digite B: ");
        Integer b = entrada.nextInt();

        System.out.print("Digite C: ");
        Integer c = entrada.nextInt();

        if (a > b && a > c) {
            System.out.println("Maior=" + a);
        }
        if (b > a && b > c) {
            System.out.println("Maior=" + b);
        }
        if (c > a && c > b) {
            System.out.println("Maior=" + c);
        }
    }
}
