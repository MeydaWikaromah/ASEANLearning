package com.example.aseanlearning;

public class SoalPilihanGanda9 {
    public String pertanyaan[] = {
            "Myanmar adalah negara dengan sistem pemerintahan apa?",
            "Yang merupakan ibu kota Myanmar adalah...",
            "Industri utama yang menjadi tulang punggung ekonomi Myanmar adalah...",
            "Kelompok etnis yang mayoritas di Myanmar adalah...",
            "Yang menjadi produk ekspor utama Myanmar adalah...",

    };

    private String pilihanJawaban[][] = {
            {"Monarki","Republik","Oligarki","Totaliter"},
            {"Naypyidaw","Yangon","Mandalay","Bagan"},
            {"Pertanian","Pertambangan","Pariwisata","Manufaktur"},
            {"Bamar","Karen","Chin","Mon"},
            {"Beras","Minyak bumi","Tekstil","Karet"},

    };

    private String jawabanBenar[] = {
            "Republik",
            "Naypyidaw",
            "Pertanian",
            "Bamar",
            "Minyak bumi",
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
