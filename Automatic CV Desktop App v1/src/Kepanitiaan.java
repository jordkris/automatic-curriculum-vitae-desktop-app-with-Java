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
public class Kepanitiaan {
    protected List<String> nama = new ArrayList<>();
    protected List<String> jabatan = new ArrayList<>();
    protected List<String> tahunMulai = new ArrayList<>();
    protected List<String> tahunSelesai = new ArrayList<>();

    public Kepanitiaan(List<String> nama, List<String> jabatan, List<String> tahunMulai, List<String> tahunSelesai) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.tahunMulai = tahunMulai;
        this.tahunSelesai = tahunSelesai;
    }
}
