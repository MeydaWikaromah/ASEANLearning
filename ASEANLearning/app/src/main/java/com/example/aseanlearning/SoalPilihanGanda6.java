package com.example.aseanlearning;

public class SoalPilihanGanda6 {
    public String pertanyaan[] = {
            "Apa sektor ekonomi utama di Laos?",
            "Apa kepercayaan agama mayoritas di Laos?",
            "Apa arti dari Peace, Independence, Democracy, Unity and Prosperity semboyan Negara Laos?",
            "Ibukota negara Laos adalah...",
            "Negara Laos berbagi perbatasan dengan negara-negara berikut, kecuali...",

    };

    private String pilihanJawaban[][] = {
            {"Pertanian","Industri manufaktur","Pariwisata","Pertambangan"},
            {"Buddhisme","Islam","Hinduisme","Kristen"},
            {"Kekuatan melalui persatuan","Kemerdekaan, Kesatuan, Demokrasi, Kemakmuran","Satu orang, satu jiwa","Karya, Kesatuan, Kemajuan"},
            {"Vientiane","Luang Prabang","Pakse","Savannakhet"},
            {"Thailand","Vietnam","Malaysia", "Kamboja"},

    };

    private String jawabanBenar[] = {
            "Pertanian",
            "Buddhisme",
            "Kemerdekaan, Kesatuan, Demokrasi, Kemakmuran",
            "Vientiane",
            "Malaysia",
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
