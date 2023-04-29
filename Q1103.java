import java.util.Scanner;

public class Q1103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Informe horario dormido
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
                break;
            }

            h1 = (h1 * 60) + m1;
            h2 = (h2 * 60) + m2;
            int minutos = h2 - h1;
            if (minutos < 0) {
                minutos = 1440 - (minutos * -1);
            }
            System.out.println(minutos);
        }

        sc.close();
    }
}