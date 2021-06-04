/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Jordy
 */
public class Profil {
    protected String nama;
    protected String jenKel;
    protected String nim;
    protected String tempatLahir;
    protected List<String> tanggalLahir = new ArrayList<>();
    protected String agama;
    protected String alamatAsal;
    protected String alamatDomisili;
    protected String foto;

    public Profil(String nama, String jenKel, String nim, String tempatLahir, List<String> tanggalLahir, String agama, String alamatAsal, String alamatDomisili, String foto) {
        this.nama = nama;
        this.jenKel = jenKel;
        this.nim = nim;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.alamatAsal = alamatAsal;
        this.alamatDomisili = alamatDomisili;
        this.foto = foto;
    }
}
