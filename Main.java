import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Largura do array
        int n = sc.nextInt();
        int[] numbers = new int[n ];


        //escolha numeros
        for(int i = 0; i<n; i++) {
            int escolha = sc.nextInt();
            numbers[i] = sc.nextInt();
        }

        for (int i=0; i<numbers.length; i++) {
            int moment = numbers[i];
            if (moment == numbers[i]);
            System.out.println(moment);
        }
        sc.close();
    }
}