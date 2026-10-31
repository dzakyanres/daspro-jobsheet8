import java.util.Scanner;
public class Tugas208{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nilai (minimal 3: ");
        int nilai = sc.nextInt();
        int totalNilai = 0;

        if (nilai < 3) {
            System.out.println("nilai tidak boleh dibawah 3");
        } else {
            for (int n = 1; n <= nilai; n++) {
                for (int m = 1; m <= nilai; m++) {
                    int hasil = m * n;
                    totalNilai += m;
                    System.out.print(hasil + "\t");
                }
                System.out.println();
                
            }
            System.out.print("total nilai: "+ totalNilai);
        }

    }
}