package com.example.aseanlearning;

public class SoalPilihanGanda8 {
    public String pertanyaan[] = {
            "Brunei Darussalam memiliki luas wilayah sekitar...",
            "Brunei Darussalam terkenal dengan kekayaannya di sektor...",
            "Brunei Darussalam memiliki status politik sebagai...",
            "Kota terbesar dan ibu kota Negara Brunei Darussalam adalah...",
            "Apa nama negara yang secara resmi disebut sebagai Kerajaan di ASEAN?",

    };

    private String pilihanJawaban[][] = {
            {"5.765 km²","10.972 km²","20.770 km²","50.345 km²"},
            {"Pertambangan minyak dan gas","Pertanian dan perkebunan","Pariwisata","Industri manufaktur"},
            {"Monarki absolut","Republik parlementer","Monarki konstitusional","Negara otonom"},
            {"Bandar Seri Begawan","Kuala Lumpur","Bangkok","Jakarta"},
            {"Thailand","Brunei Darussalam","Myanmar","Vietnam"},

    };

    private String jawabanBenar[] = {
            "5.765 km²",
            "Pertambangan minyak dan gas",
            "Monarki konstitusional",
            "Bandar Seri Begawan",
            "Brunei Darussalam",
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
