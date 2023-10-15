// Mahasiswa.java
package com.example.model;

public class Mahasiswa {
    // ! Properties sesuai dengan tabel Mahasiswa
    private String nim;
    private String nama;
    private String angkatan;
    private String gender;

    //NAMBAH
    private String asaldaerah;
    private String nomor;
    
    // ! Setter dan Getter Properties

    //ASAL DAERAH DAN NOMOR TELEPON
    public String getAsaldaerah() {
        return asaldaerah;
    }

    public void setAsaldaerah(String asaldaerah) {
        this.asaldaerah = asaldaerah;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    //------------------------------

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    } 

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
