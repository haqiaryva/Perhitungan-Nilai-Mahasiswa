package TugasWeek23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM : ");
        int nim = input.nextInt();
        System.out.println();
        System.out.print("Nilai Tubes : ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Nilai Quiz : ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS : ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : "+nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek : ");
        System.out.println("1. Nilai Tubes : " + nilaiTubes);
        System.out.println("2. Nilai Quiz : " + nilaiQuiz);
        System.out.println("3. Nilai Tugas : " + nilaiTugas);
        System.out.println("4. Nilai UTS : " + nilaiUTS);
        System.out.println("5. Nilai UAS : " + nilaiUAS);
        System.out.println("Total Nilai : " + (nilaiTubes+nilaiQuiz+nilaiTugas
        +nilaiUTS+nilaiUAS));
        
        
        
    }
    
}
