import java.util.Scanner;
public class Tugas108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int nilai = sc.nextInt();
        int totalCetak = 0;

        if (nilai < 1) {
            System.out.print("nilai minimal adalah 1");
        } else {
            for (int n = 1; n <= nilai; n++) {
                for (int m = 1; m <= n; m++) {
                    System.out.print(" " + m);
                    totalCetak++;
                }
                System.out.println();
            }
            System.out.println("total dicetak: " + totalCetak);
            sc.close();
        }

    }
}