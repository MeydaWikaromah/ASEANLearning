package com.example.aseanlearning;

public class SoalPilihanGanda2 {
    public String pertanyaan[] = {
            "Kota mana yang merupakan ibu kota Malaysia?",
            "Apa semboyan negara Malaysia?",
            "Bahasa resmi Malaysia adalah Bahasa...",
            "Tun Abdul Razak adalah pendiri ASEAN yang berasal dari...",
            "Apa mata uang resmi Malaysia?",

    };

    private String pilihanJawaban[][] = {
            {"Kuala Lumpur","Johor Bahru","Penang","Kuching"},
            {"In God We Trust","Bersekutu Bertambah Mutu","Unity in Diversity","Bhinneka Tunggal Ika"},
            {"Inggris","Melayu","Cina","Arab"},
            {"Thailand","Laos","Singapura","Malaysia"},
            {"Dolar","Ringgit","Rupiah", "Baht"},

    };

    private String jawabanBenar[] = {
            "Kuala Lumpur",
            "Bersekutu Bertambah Mutu",
            "Melayu",
            "Malaysia",
            "Ringgit",
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
