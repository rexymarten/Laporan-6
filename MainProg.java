/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporanbab_6;

import java.util.Scanner;

/**
 *
 * @author Rexy
 */
public class MainProg {

    private static String nama;
    private static String idKerja;
    private static boolean istri;
    private static int anak;
    private static int tahun;
    private double gaji;
    private static int lamakerja;
    private double bonus, tunjangan, tjanak, tjistri, tjjabatan;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Selamat Datang");
            System.out.println("1. Manager");
            System.out.println("2. Pegawai Tetap / PNS");
            System.out.println("3. Pegawai Tidak Tetap / Non PNS");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = scn.nextInt();
            switch (pilihan) {
                case 1:
                    GajiManager();
                    break;
                case 2:
                    GajiPNS();
                    break;
                case 3:
                    GajiNonPNS();
                    break;
                case 4:
                    keluar();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    System.out.println("");
            }
        } while (pilihan != 4);
    }

    private static void GajiManager() {
        Scanner scn = new Scanner(System.in);
        Manager man = new Manager(nama, idKerja, tahun);
        System.out.print("Masukkan Nama  :");
        String nama = scn.nextLine();
        System.out.print("Masukkan ID Kerja :");
        String idKerja = scn.nextLine();
        System.out.print("Masukkan Tahun Masuk : ");
        int tahun = scn.nextInt();
        System.out.println("Apakah Mempunyai Istri ?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan Pilihan\t: ");
        istri = scn.nextInt() == 1;
        System.out.print("Masukkan Jumlah Anak : ");
        anak = scn.nextInt();
        man.setNama(nama);
        man.setIdKerja(idKerja);
        man.setGaji(5000000);
        man.setAnak(anak);
        man.setIstri(istri);
        man.setLamakerja(lamakerja);
        man.setTunjangan();
        man.setTjanak();
        man.setTjistri();
        man.setTunjanganJabatan();
        man.displayMessage();
    }

    private static void GajiPNS() {
        Scanner input = new Scanner(System.in);
        PNS pns = new PNS(nama, idKerja, tahun);
        System.out.print("Masukkan Nama :");
        String nama = input.nextLine();
        System.out.print("Masukkan ID Kerja :");
        String idKerja = input.nextLine();
        System.out.print("Masukkan Tahun Masuk : ");
        int tahun = input.nextInt();
        System.out.println("Apakah Mempunyai Istri ?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan Pilihan : ");
        istri = input.nextInt() == 1;
        System.out.print("Masukkan Jumlah Anak : ");
        anak = input.nextInt();
        pns.setNama(nama);
        pns.setIdKerja(idKerja);
        pns.setLamakerja(lamakerja);
        pns.setGaji(2500000);
        pns.setAnak(anak);
        pns.setIstri(istri);
        pns.setTunjangan();
        pns.setTjanak();
        pns.setTjistri();
        pns.displayMessage();
    }

    private static void GajiNonPNS() {
        Scanner input = new Scanner(System.in);
        NonPNS non = new NonPNS(nama, idKerja, tahun);
        System.out.print("Masukkan Nama :");
        String nama = input.nextLine();
        System.out.print("Masukkan ID Kerja :");
        String idKerja = input.nextLine();
        System.out.println("Masukkan Jml Jam Kerja : ");
        int jam = input.nextInt();
        non.setNama(nama);
        non.setIdKerja(idKerja);
        non.setGaji(1500000);
        non.setJam(jam);
        non.displayMessage();
    }

    private static void keluar() {
        System.out.println("Terimakasih");
        System.exit(0);
    }
}
