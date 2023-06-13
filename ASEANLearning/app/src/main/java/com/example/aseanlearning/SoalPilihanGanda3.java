package com.example.aseanlearning;

public class SoalPilihanGanda3 {
    public String pertanyaan[] = {
            "Negara ASEAN yang memiliki wilayah paling kecil adalah...",
            "Singapura memiliki sejarah multikultural yang kaya dengan berbagai kelompok etnis. 2 Kelompok etnis terbesar di Singapura adalah...",
            "Bahasa resmi di Singapura adalah...",
            "Singapura memiliki sistem politik...",
            "Negara mana di ASEAN yang dikenal sebagai pusat keuangan regional?",

    };

    private String pilihanJawaban[][] = {
            {"Singapura","Malaysia","Brunei Darussalam","Laos"},
            {"Orang Melayu","Orang India","Orang Tionghoa","Orang Arab"},
            {"Inggris","Melayu","Mandarin","Tamil"},
            {"Monarki Konstitusional","Republik Parlementer","Monarki Absolut","Republik Presidensial"},
            {"Singapura","Malaysia","Filipina", "Thailand"},

    };

    private String jawabanBenar[] = {
            "Singapura",
            "Orang Tionghoa",
            "Inggris",
            "Republik Parlementer",
            "Singapura",
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
