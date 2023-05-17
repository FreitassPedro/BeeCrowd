import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> animal = new HashMap<>();
        animal.put("Curupira", 300);
        animal.put("Boitata", 1500);
        animal.put("Boto", 600);
        animal.put("Mapinguari", 1000);
        animal.put("iara", 150);
        int chica = 225;

        for (String i : animal.keySet()) {
            int portions = sc.nextInt();
            portions *= animal.get(i);
            animal.replace(i, portions);
        }

        sc.close();

        for (Integer i : animal.values()) {
            chica += i;
        }

        System.out.println(chica);
    }
}