/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporanbab_6;

/**
 *
 * @author Rexy
 */
public class NonPNS extends Employee {
    private int jam, lamakerja;
    public NonPNS(String nama, String idKerja, int tahun) {
        super(nama, idKerja, tahun);}
    public void setJam(int jam) {
        this.jam = jam;}
    public void displayMessage(){
        int lembur = jam>10?(jam-10)*10000:0;
        System.out.println("Rincian Data Karyawan : ");
        System.out.println("Nama              : "+super.getNama());
        System.out.println("ID Kerja          : "+super.getIdKerja());
        System.out.println("Lama Kerja        : "+super.getLamakerja());
        System.out.println("Gaji              : "+super.getGaji());
        System.out.println("Gaji Lembur       : "+lembur);
        System.out.println("Total Gaji        : "+(super.getGaji()+lembur));
    }
    }


