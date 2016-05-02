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
public class Manager extends Employee {
    private double TunjanganJabatan, bonus, tunjangan, tjanak, tjistri;
    private boolean istri;
    private int anak, lamakerja;
    private double gaji;

    public Manager(String nama, String idKerja, int tahun) {
        super(nama, idKerja, tahun);
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getTunjanganJabatan() {
        return TunjanganJabatan;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTjistri() {
        return tjistri;
    }

    public double getTjanak() {
        return tjanak;
    }

    public int getLamakerja() {
        return lamakerja;
    }

    public void setTjistri() {
        if (istri) {
            tjistri = 0.1 * (gaji + lamakerja + tunjangan);
        }
    }

    public void setTjanak() {
        if (anak < 3) {
            tjanak = 0.15 * anak * (gaji + lamakerja + tunjangan);
        } else {
            tjanak = 0.15 * 3 * (gaji + lamakerja + tunjangan);
        }
    }

    public void setTunjanganJabatan() {
        TunjanganJabatan = 0.1 * anak * (gaji + lamakerja + tunjangan);
    }

    public void setTunjangan() {
        if (lamakerja < 5) {
            bonus = 0;
            tunjangan = 0;
        } else if (lamakerja > 5 && lamakerja < 11) {
            bonus = 0.05 * lamakerja;
            tunjangan = 0;
        } else if (lamakerja > 10) {
            bonus = 0.1 * lamakerja;
            tunjangan = 0.1 * lamakerja;
        }
    }

    public void displayMessage() {
        System.out.println("Rincian Data Karyawan : ");
        System.out.println("Nama              : " + super.getNama());
        System.out.println("Istri             : " + super.getIstri()); 
        System.out.println("Lama Kerja        : " + super.getLamakerja());
        System.out.println("Gaji              : " + super.getGaji());
        System.out.println("Tunjangan         : " + getTunjangan());
        System.out.println("Tunjangan Istri   : " + getTjistri());
        System.out.println("Tunjangan Anak    : " + getTjanak());
        System.out.println("Tunjangan Jabatan : " + getTunjanganJabatan());
        System.out.println("Total Gaji        : " + (getGaji() + getTunjangan() + getTjistri()
                + getTunjanganJabatan() + getTjanak()));
    }

}
