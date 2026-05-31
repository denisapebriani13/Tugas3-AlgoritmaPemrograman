package tugas3algoritmapemrograman;

import java.util.Scanner;

public class Tugas3AlgoritmaPemrograman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array Gaji Pokok
        double[] gaji = {5000000, 6500000, 9500000}; // 0=A, 1=B, 2=C

        // Array Persentase Lembur
        int[] persenLembur = {30, 32, 34, 36, 38};

        System.out.println("=========================================");
        System.out.println("     PROGRAM PERHITUNGAN GAJI KARYAWAN");
        System.out.println("=========================================");

        // Input Golongan
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();

        int index = -1;
        if (golongan.equals("A")) {
            index = 0;
        } else if (golongan.equals("B")) {
            index = 1;
        } else if (golongan.equals("C")) {
            index = 2;
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        double gajiPokok = gaji[index];

        // Input Jam Lembur
        System.out.print("Masukkan Jumlah Jam Lembur : ");
        int jamLembur = input.nextInt();

        if (jamLembur < 0) {
            System.out.println("Jam lembur tidak boleh negatif!");
            return;
        }

        // Tentukan persentase lembur
        int persen;
        if (jamLembur == 1) persen = persenLembur[0];
        else if (jamLembur == 2) persen = persenLembur[1];
        else if (jamLembur == 3) persen = persenLembur[2];
        else if (jamLembur == 4) persen = persenLembur[3];
        else persen = persenLembur[4]; // >=5 jam

        // Perhitungan
        double upahLemburPerJam = (persen / 100.0) * gajiPokok;
        double totalLembur = upahLemburPerJam * jamLembur;
        double totalGaji = gajiPokok + totalLembur;

        // Output
        System.out.println("\n=========================================");
        System.out.println("             HASIL PERHITUNGAN");
        System.out.println("=========================================");
        System.out.println("Golongan            : " + golongan);
        System.out.println("Gaji Pokok          : Rp " + String.format("%,.0f", gajiPokok));
        System.out.println("Jam Lembur          : " + jamLembur + " jam");
        System.out.println("Persentase Lembur   : " + persen + "%");
        System.out.println("Total Gaji Lembur   : Rp " + String.format("%,.0f", totalLembur));
        System.out.println("=========================================");
        System.out.println("TOTAL GAJI          : Rp " + String.format("%,.0f", totalGaji));
        System.out.println("=========================================");

        input.close();
    }
}