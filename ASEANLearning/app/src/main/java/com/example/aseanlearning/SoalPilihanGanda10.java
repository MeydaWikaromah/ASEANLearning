package com.example.aseanlearning;

public class SoalPilihanGanda10 {
    public String pertanyaan[] = {
            "Pulau manakah yang merupakan pulau terbesar di Filipina?",
            "Ibu kota Filipina adalah...",
            "Apa festival terbesar di Filipina yang berlangsung selama seminggu?",
            "Kepala negara di Filipina adalah?",
            "Apa nama kelompok etnis terbesar di Filipina?",

    };

    private String pilihanJawaban[][] = {
            {"Pulau Luzon","Pulau Mindanao","Pulau Visayas","Pulau Palawan"},
            {"Manila","Cebu","Davao","Quezon City"},
            {"Sinulog Festival","Ati-Atihan Festival","Panagbenga Festival","Pahiyas Festival"},
            {"Presiden","Raja","Perdana Menteri","Gubernur"},
            {"Melayu","Cina","Tagalog","Amerika"},

    };

    private String jawabanBenar[] = {
            "Pulau Luzon",
            "Manila",
            "Ati-Atihan Festival",
            "Presiden",
            "Tagalog",
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
