package com.example.aseanlearning;

public class SoalPilihanGanda4 {
    public String pertanyaan[] = {
            "Negara di ASEAN yang tidak pernah dijajah adalah...",
            "Apa ibu kota Thailand?",
            "Apa nama raja saat ini di Thailand?",
            "Apa sektor ekonomi terbesar di Thailand?",
            "Sistem politik Thailand saat ini adalah...",

    };

    private String pilihanJawaban[][] = {
            {"Thailand","Laos","Singapura","Malaysia"},
            {"Bangkok","Phuket","Chiang Mai","Pattaya"},
            {"Raja Bhumibol Adulyadej","Raja Vajiralongkorn","Raja Mongkut","Raja Chulalongkorn"},
            {"Pertanian","Pariwisata","Manufaktur","Perdagangan"},
            {"Monarki absolut","Monarki konstitusional","Republik presidensial", "Republik parlementer"},

    };

    private String jawabanBenar[] = {
            "Thailand",
            "Bangkok",
            "Raja Vajiralongkorn",
            "Manufaktur",
            "Monarki konstitusional",
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
