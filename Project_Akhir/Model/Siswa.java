package com.javaoop.tugas.SMT_3.Project_Akhir.Model;

public class Siswa {
    private String nama;
    private int noAbsen;
    private Kelas kelas;

    public Siswa(String nama, int noAbsen, Kelas kelas){
        this.nama = nama;
        this.noAbsen = noAbsen;
        this.kelas = kelas;
    }

    public String getNamaSiswa(){
        return this.nama;
    }

    public void setNamaSiswa(String nama){
        this.nama = nama;
    }

    public int getNoAbsen(){
        return this.noAbsen;
    }

    public void setNoAbsen(int noAbsen){
        this.noAbsen = noAbsen;
    }

    public Kelas getkelas(){
        return this.kelas;
    }

    public void setKelas(Kelas kelas){
        this.kelas = kelas;
    }
}
