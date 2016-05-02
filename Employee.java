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
public class Employee {
private String nama;
    private String idKerja;
    private boolean istri;
    private int anak;
    private final int tahun;
    private double gaji;
    private int lamakerja;
    
    public Employee(String nama, String idKerja, int tahun) {
        this.nama = nama;
        this.idKerja = idKerja;
        this.tahun = tahun;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdKerja(String idKerja) {
        this.idKerja = idKerja;
    }

    public void setLamakerja(int lamakerja) {
        this.lamakerja = 2016 - tahun;
    }

    public void setIstri(boolean istri) {
        this.istri = istri;
    }

    public boolean getIstri() {
        return istri;
    }

    public void setAnak(int anak) {
        this.anak = anak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public int getLamakerja() {
        return lamakerja;
    }

    public double getGaji() {
        return gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getIdKerja() {
        return idKerja;
    }

    public int getTahun() {
        return tahun;
    }

    public int getAnak() {
        return anak;
    }
}
