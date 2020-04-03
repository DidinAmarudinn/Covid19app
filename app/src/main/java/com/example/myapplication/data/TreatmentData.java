package com.example.myapplication.data;

import com.example.myapplication.model.CovidModel;
import com.example.myapplication.model.TreatmentModel;

import java.util.ArrayList;

public class TreatmentData {
    private static String[] title= {
            "Minum Parasetamol",
            "Bawang Putih dan Antibiotik?",
            "Self Isolation",
            "Jika Anda merasa tidak sehat dengan kriteria: Demam lebih dari 38°C; dan Batuk/ pilek/nyeri tenggorokan",
            "Pada saat berobat ke fasyankes, Anda harus lakukan tindakan berikut",
            "Tenaga Kesehatan (nakes) di fasyankes akan melakukan screening pasien dalam pengawasan COVID-19:\n",
            "Jika Hasilnya Positif Corona",
            "Jika Hasilnya negatif"

    };
    private static String[] deskripsi= {
            "Menteri Kesehatan Prancis Olivier Veran mengatakan di Twitter pada hari Sabtu, untuk menghilangkan rasa sakit atau demam di rumah, lebih baik menggunakan parasetamol karena obat antiinflamasi yang dijual bebas dapat memperburuk virus corona.\n" +
                    "\n" +
                    "\"Mengonsumsi obat anti-inflamasi (ibuprofen, kortison) bisa menjadi faktor yang memperburuk infeksi. Jika demam, minum parasetamol. Jika Anda sudah mengonsumsi obat antiinflamasi, mintalah saran dokter,\" kata Veran.\n" +
                    "\n" +
                    "Paracetamol mampu mengurangi demam tanpa menyerang balik dengan peradangan. Sedangkan obat anti-inflamasi diketahui berisiko bagi mereka yang memiliki penyakit menular karena cenderung mengurangi respon sistem kekebalan tubuh",
            "Bagaimana dengan bawang putih? Bawang putih memang memiliki beberapa sifat antimikroba, tetapi tidak ada bukti bahwa makan bawang putih mampu melindungi orang dari Covid-19, menurut WHO.\n" +
                    "\n" +
                    "Antibiotik hanya bekerja pada bakteri. Mereka tidak bekerja melawan virus. Sedangkan Covid-19 disebabkan oleh virus, oleh karena itu antibiotik tidak boleh digunakan sebagai pengobatan.",

            "Batasi pergerakan dan minimalkan berbagi ruangan yang sama. Pastikan ruangan bersama (seperti dapur dan kamar mandi) memiliki ventilasi yang baik. ",
            "istirahatlah yang cukup di rumah dan minum air yang cukup. Bila tetap merasa tidak nyaman, keluhan berlanjut, atau disertai dengan kesulitan bernapas (sesak atau napas cepat), segera memeriksakan diri ke fasilitas pelayanan kesehatan (fasyankes)",
            "a. Gunakan masker. b. Apabila tidak memiliki masker, ikuti etika batuk/bersin yang benar dengan cara menutup mulut dan hidung dengan tisu atau lengan atas bagian dalam. c. Usahakan tidak menggunakan transportasi massal.\n",
            "a. Jika memenuhi kriteria pasien dalam pengawasan COVID-19, maka Anda akan dirujuk ke salah satu rumah sakit (RS) rujukan. b. Jika tidak memenuhi kriteria pasien dalam pengawasan COVID-19, maka Anda akan dirawat inap atau rawat jalan tergantung diagnosa dan keputusan dokter fasyankes.\n",
            "I. maka Anda akan dinyatakan sebagai kasus konfirmasi COVID-19.\n"+"\n"+ "II. Sampel akan diambil setiap hari.\n" +
                    "\n"+
                    " III. Anda akan dikeluarkan dari ruang isolasi jika pemeriksaan sampel 2 (dua) kali berturut-turut hasilnya negatif",
            "Anda akan dirawat sesuai dengan penyebab penyakit.\n"


    }   ;
    public static ArrayList<TreatmentModel> getListData(){
        ArrayList<TreatmentModel> list=new ArrayList<>();
        for (int position=0; position<title.length; position++){
            TreatmentModel treatmentModel=new TreatmentModel();
            treatmentModel.setTitle(title[position]);
            treatmentModel.setDeskripsi(deskripsi[position]);
            list.add(treatmentModel);
        }
        return list;
    }
}
