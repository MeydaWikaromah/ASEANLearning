package com.example.aseanlearning;

public class SoalPilihanGanda1 {
    public String pertanyaan[] = {
            "Kapan Indonesia bergabung menjadi anggota ASEAN?",
            "Wakil Indonesia sebagai pendiri ASEAN adalah ....",
            "Sebuah negara kepulauan di Asia Tenggara yang terletak antara benua Asia dan Australia serta antara Samudra Pasifik dan Samudra Hindia yaitu Negara...",
            "Apa semboyan negara Indonesia?",
            "Negara Indonesia adalah negara demokrasi dengan sistem pemerintahan...",

    };

    private String pilihanJawaban[][] = {
            {"1967","1971","1985","1999"},
            {"H.R. Dharsono","Umarjadi Notowijono","Rusli Noor","Adam Malik"},
            {"Malaysia","Indonesia","Thailand","Vietnam"},
            {"Bhinneka Tunggal Ika","In God We Trust","Unity in Diversity","Peace, Progess, Prosperity"},
            {"Monarki","Kerajaan","Presidensial", "Dinasti"},

    };

    private String jawabanBenar[] = {
            "1967",
            "Adam Malik",
            "Indonesia",
            "Bhinneka Tunggal Ika",
            "Presidensial",
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
