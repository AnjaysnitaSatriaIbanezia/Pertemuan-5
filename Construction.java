package com.pbo;

public class Construction {
    // Class polos atau tanpa constructor
    class polos{
        String dataString;
        int dataInteger;
    }

    // Class dengan constructor
    class MahasiswaUPJ{
        String nama;
        String NIM;
        String jurusan;

        // Constructor dipanggil saat object pertama kali dibuat
        MahasiswaUPJ(){
            System.out.println("Ini adalah constructor");
        }

        //Constructor dengan parameter
        MahasiswaUPJ(String inputNama, String inputNIM, String inputJurusan){
            nama = inputNama;
            NIM = inputNIM;
            jurusan = inputJurusan;

            System.out.println(nama);
            System.out.println(NIM);
            System.out.println(jurusan);
        }
    }
    public class Constructor {
        public static void main(String[] args) {
            MahasiswaUPJ mahasiswa1 = new MahasiswaUPJ("Bagoes", "2019071011", "Perternakan domba gila");
            MahasiswaUPJ mahasiswa2 = new MahasiswaUPJ("Samuel", "2019071012", "Peternakan Godzilla");
        }
    }
