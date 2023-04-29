import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dias = sc.nextInt();

        int anos = dias / 365;
        int mes = (dias % 365 ) / 30;
        int dia = (dias % 365) % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}