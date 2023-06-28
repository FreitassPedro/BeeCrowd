import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaA = sc.nextInt();
        int media  = sc.nextInt();
        int notaB = media * 2 - notaA;
        System.out.println(notaB);

        sc.close();
    }
}