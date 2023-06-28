import java.util.Scanner;

public class Q2344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        if (nota >= 86) {
            System.out.println("A");
        } else if (nota >= 61) {
            System.out.println("B");
        } else if (nota >= 36) {
            System.out.println("C");
        } else if (nota >= 1) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

    }
}