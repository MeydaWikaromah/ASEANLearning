package com.example.aseanlearning;

public class SoalPilihanGanda7 {
    public String pertanyaan[] = {
            "Kota manakah yang merupakan ibu kota Kamboja?",
            "Bahasa resmi yang digunakan di Kamboja adalah...",
            "Salah satu tempat wisata terkenal di Kamboja adalah...",
            "Kamboja memiliki garis pantai yang panjang di tepi laut...",
            "Kamboja berbatasan langsung dengan negara-negara berikut, kecuali...",

    };

    private String pilihanJawaban[][] = {
            {"Phnom Penh","Siem Reap","Battambang","Sihanoukville"},
            {"Bahasa Khmer","Bahasa Inggris","Bahasa Prancis","Bahasa Thai"},
            {"Angkor Wat","Borobudur","Petronas Twin Towers","Marina Bay Sands"},
            {"Andaman","Arab","China Selatan","Lautan Pasifik"},
            {"Thailand","Laos","Myanmar","Vietnam"},

    };

    private String jawabanBenar[] = {
            "Phnom Penh",
            "Bahasa Khmer",
            "Angkor Wat",
            "China Selatan",
            "Myanmar",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getPilihanJawaban4(int x){
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
