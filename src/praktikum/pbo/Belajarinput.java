package praktikum.pbo;

import javax.swing.*;
import java.util.Scanner;

public class Belajarinput {

    public static void main(String[] args) {

        String namaLengkap;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama lengkap anda : ");
        namaLengkap = input.nextLine();

        System.out.println("Nama lengkap anda adalah " + namaLengkap);

    }
}
