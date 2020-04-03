package com.example.myapplication.data;

import com.example.myapplication.model.CovidModel;

import java.util.ArrayList;
public class CovidData {
    private static String[] title={
            "Apa Itu Coviid-19?",
            "Gejala Umum Covid-19?",
            "Bagaimana Penularan Virus Covid-19?",
            "Siapa Yang Beresiko Terkena Covid-19?",
            "Apakah sudah ada vaksin atau pengobatan spesifik untuk COVID-19? ",
            "Seberapa Bahaya Covid-19?",
            "Apakah antibiotik efektif dalam mencegah dan mengobati COVID-19? ",
            "Bagaimana membedakan antara COVID-19 dengan influenza biasa? ",
            "Berapa lama waktu yang diperlukan sejak tertular/terinfeksi hingga muncul gejala COVID-19? ",
            "Amankah jika kita menerima paket barang dari Tiongkok atau negara lain yang melaporkan virus ini? "

    };
    private static String[] deskripsi={
                    "COVID-19 adalah penyakit yang disebabkan oleh Novel Coronavirus (2019-nCoV), jenis baru coronavirus yang pada manusia menyebabkan penyakit mulai flu biasa hingga penyakit yang serius seperti Middle East Respiratory Syndrome (MERS) dan Sindrom Pernapasan Akut Berat/ Severe Acute Respiratory Syndrome (SARS).\n" +
                    "\n" +
                    "Pada 11 Februari 2020, World Health Organization (WHO) mengumumkan nama penyakit yang disebabkan 2019-nCov, yaitu Coronavirus Disease (COVID-19).",
                    "Gejala umum berupa demam ≥38°C, batuk kering, dan sesak napas. Jika ada orang yang dalam 14 hari sebelum muncul gejala tersebut pernah melakukan perjalanan ke negara terjangkit, atau pernah merawat/kontak erat dengan penderita COVID-19, maka terhadap orang tersebut akan dilakukan pemeriksaan laboratorium lebih lanjut untuk memastikan diagnosisnya.",
                    "Seseorang dapat terinfeksi dari penderita COVID-19. Penyakit ini dapat menyebar melalui tetesan kecil (droplet) dari hidung atau mulut pada saat batuk atau bersin. Droplet tersebut kemudian jatuh pada benda di sekitarnya. Kemudian jika ada orang lain menyentuh benda yang sudah terkontaminasi dengan droplet tersebut, lalu orang itu menyentuh mata, hidung atau mulut (segitiga wajah), maka orang itu dapat terinfeksi COVID-19. Seseorang juga bisa terinfeksi COVID-19 ketika tanpa sengaja menghirup droplet dari penderita. Inilah sebabnya mengapa kita penting untuk menjaga jarak hingga kurang lebih satu meter dari orang yang sakit. ",
                    "Orang yang tinggal atau bepergian di daerah di mana virus 2019-nCoV bersirkulasi sangat mungkin berisiko terinfeksi. Saat ini, Tiongkok merupakan negara terjangkit COVID-19 dengan sebagian besar kasus telah dilaporkan. Mereka yang terinfeksi di negara lain adalah orang-orang yang belum lama ini bepergian dari Tiongkok atau yang telah tinggal atau bekerja secara dekat dengan para wisatawan, seperti anggota keluarga, rekan kerja atau tenaga medis yang merawat pasien sebelum mereka tahu pasien tersebut terinfeksi COVID-19.\n" +
                            "\n" +
                            "Petugas kesehatan yang merawat pasien yang terinfeksi COVID-19 berisiko lebih tinggi dan harus konsisten melindungi diri mereka sendiri dengan prosedur pencegahan dan pengendalian infeksi yang tepat.",
                    "Belum ada vaksin atau pengobatan spesifik untuk virus ini. Namun, gejala yang disebabkan oleh virus ini dapat diobati. Oleh karena itu pengobatan harus didasarkan pada kondisi klinis pasien dan perawatan suportif dapat sangat efektif.",
                    "Seperti penyakit pernapasan lainnya, infeksi 2019-nCoV dapat menyebabkan gejala ringan termasuk pilek, sakit tenggorokan, batuk, dan demam. Beberapa orang mungkin akan menderita sakit yang parah, seperti disertai pneumonia atau kesulitan bernafas. Walaupun fatalitas penyakit ini masih jarang, namun bagi orang yang berusia lanjut, dan orang-orang dengan kondisi medis yang sudah ada sebelumnya (seperti, diabetes dan penyakit jantung), mereka biasanya lebih rentan untuk menjadi sakit parah.",
                     "Tidak, antibiotik tidak bekerja melawan virus, hanya bakteri. Novel Coronavirus (2019-nCoV) adalah virus. Oleh karena itu, antibiotik tidak boleh digunakan sebagai sarana pencegahan atau pengobatan. Namun, jika Anda dirawat di rumah sakit untuk COVID-19, Anda mungkin menerima antibiotik, karena infeksi sekunder bakteri mungkin terjadi.",
                    "Orang yang terinfeksi 2019-nCoV dan influenza akan mengalami gejala infeksi saluran pernafasan yang sama, seperti demam, batuk dan pilek. Walaupun gejalanya sama, tapi penyebab virusnya berbeda-beda. Namun kesamaan gejala tersebut membuat kita sulit mengidentifikasi masing-masing penyakit tersebut, sehingga pemeriksaan laboratorium sangat diperlukan untuk mengkonfirmasi apakah seseorang terinfeksi 2019-nCoV.\n" +
                    "\n" +
                    "Untuk itulah WHO merekomendasikan setiap orang yang menderita demam, batuk, dan sulit bernapas harus mencari pengobatan sejak dini, dan memberitahukan petugas kesehatan jika mereka telah melakukan perjalanan dalam 14 hari sebelum muncul gejala, atau jika mereka telah melakukan kontak erat dengan seseorang yang sedang menderita gejala infeksi saluran pernafasan.",
                    "Waktu yang diperlukan sejak tertular/terinfeksi hingga muncul gejala disebut masa inkubasi. Saat ini masa inkubasi COVID-19 diperkirakan antara 2-11 hari, dan perkiraan ini dapat berubah sewaktu-waktu sesuai perkembangan kasus. Berdasarkan data dari penyakit akibat coronavirus sebelumnya, seperti MERS dan SARS, masa inkubasi COVID-19 juga bisa mencapai 14 hari.",
                    "Ya, aman. Orang yang menerima paket tidak berisiko tertular COVID-19. Dari pengalaman dengan coronavirus lain, kita tahu bahwa jenis virus ini tidak bertahan lama pada objek, seperti surat atau paket."
    };
    public static ArrayList<CovidModel> getListData(){
        ArrayList<CovidModel> list=new ArrayList<>();
        for (int position=0; position<title.length; position++){
            CovidModel covidModel=new CovidModel();
            covidModel.setTitle(title[position]);
            covidModel.setDeskripsi(deskripsi[position]);
            list.add(covidModel);
        }
        return list;
    }
}
