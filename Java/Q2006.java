import java.util.Scanner;

public class Q2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] votos = new int[5];
        int correctAnswer = sc.nextInt();
        sc.nextLine();

        String line = sc.nextLine();
        String parts[] = line.split(" ");
        for (int i = 0; i < votos.length; i++) {
            votos[i] = Integer.parseInt(parts[i]);
        }


        int total = 0;
        for (int check : votos) {
            if (check == correctAnswer) {
                total++;
            }
        }
        System.out.println(total);
        sc.close();
    }
}
