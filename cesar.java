import java.util.*;
import java.lang.Math;

public class cesar {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String pesan, enkripsi;
        
        enkripsi = "";
        int i, key, hasil;
        
        System.out.print("Silahkan Masukan pesan    : ");
        pesan = input.nextLine();

        System.out.print("Silahkan Masukan kunci    : ");
        key = input.nextInt();

        for (i = 0; i <= pesan.length() - 1; i++) {
            hasil = (int) pesan.charAt(i);
            if (hasil == 32) {
                enkripsi = enkripsi + " ";
            } else {
                hasil = hasil + key;
                if (hasil > 90) {
                    hasil = hasil - 26;
                }
                enkripsi = enkripsi + (char) hasil;
            }
        }
        System.out.println("Hasil Enkripsi            : "+ enkripsi);
    }
}
