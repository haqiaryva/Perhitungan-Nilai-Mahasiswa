package model;

import java.util.ArrayList;

public class DBTables {
    public ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
    public ArrayList<Prodi> dataProdi = new ArrayList<>();

    public boolean prodiExists(String Id){
        for (Prodi prodi : dataProdi) {
            if (prodi.getId() == Id) return true;
        }
        return false;
    }
}
