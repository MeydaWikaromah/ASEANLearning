package com.example.aseanlearning;

public class SoalPilihanGanda5 {
    public String pertanyaan[] = {
            "Apa ibu kota Vietnam?",
            "Budaya Vietnam sangat dipengaruhi oleh negara-negara mana?",
            "Berikut yang termasuk tantangan dan permasalahan di Negara Vietnam,Kecuali...",
            "Apa makanan tradisional Vietnam yang terkenal dan terdiri dari mie beras, daging, sayuran, dan berbagai bumbu?",
            "Vietnam secara geografis terletak di wilayah mana?",

    };

    private String pilihanJawaban[][] = {
            {"Hanoi","Ho Chi Minh City","Da Nang","Hue"},
            {"Tiongkok dan India","Thailand dan Laos","Malaysia dan Singapura","Korea Selatan dan Jepang"},
            {"Kemiskinan","Ketimpangan Sosial","Pelanggaran Hak Asasi Manusia","Bencana Alam"},
            {"Pho","Sushi","Pad Thai","Nasi Goreng"},
            {"Asia Tenggara","Asia Timur","Asia Selatan", "Asia Barat"},

    };

    private String jawabanBenar[] = {
            "Hanoi",
            "Tiongkok dan India",
            "Bencana Alam",
            "Pho",
            "Asia Tenggara",
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
