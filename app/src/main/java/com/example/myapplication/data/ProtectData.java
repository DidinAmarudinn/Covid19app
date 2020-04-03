package com.example.myapplication.data;

import com.example.myapplication.model.CovidModel;
import com.example.myapplication.model.ProtectModel;

import java.util.ArrayList;

public class ProtectData {
    private static String[] title={
            "Cuci tangan sesering mungkin",
            "Terapkan social distancing",
            "Hindari menyentuh mata, hidung dan mulut",
            "Lakukan aturan bersin yang benar",
            "Jika mengalami demam, batuk, dan kesulitan bernapas, segeralah berobat",
            "Jaga Imunitas Tubuh",
            "Gunakan Masker Jika Sakit",
            "Hindari Bepergian ke Luar Rumah"
    };
    private static String[] deskripsi={
            "Cuci tangan secara teratur dan sesering mungkin dengan sabun dan air atau bahan mengandung alkohol akan membunuh virus yang mungkin ada di tangan kamu.",
            "Jaga jarak minimal 1 meter dengan mereka yang batuk atau bersih. Alasannya, ketika seseorang batuk atau bersin atau bersih, mereka menyemprotkan tetesan cairan kecil dari hidung atau mulut mereka yang mungkin mengandung virus. Jika terlalu dekat, kamu bisa menghirup tetesan air yang mungkin saja mengandung virus COVID-19.",
            "Tangan menyentuh banyak permukaan dan virus mungkin menempel di sana. Setelah terkontaminasi, tangan dapat memindahkan virus ke mata, hidung, atau mulut kamu. Dari sana, virus bisa masuk ke tubuh dan bisa membuat sakit.",
            "Pastikan kamu, dan orang-orang di sekitar untuk selalu menutupi mulut dan menutupi hidung dengan siku tangan yang ditekut ketika batuk atau bersih. Kemudian segera buang tisu bekasnya. Alasannya, tetesan menyebarkan virus.",
            "Tetap di rumah jika Anda merasa tidak sehat. Jika Anda mengalami demam, batuk dan kesulitan bernapas, cari bantuan medis dan ikuti arahan otoritas kesehatan setempat. Otoritas nasional dan lokal akan memiliki informasi terbaru tentang situasi di daerah Anda.",
            "Menjaga kesehatan dan kebugaran agar stamina tubuh tetap prima dan sistem imunitas atau kekebalan tubuh meningkat.",
            "Gunakan masker dengan benar hingga menutupi mulut dan hidung ketika Anda sakit atau saat berada di tempat umum.",
            "Hindari bepergian ke luar rumah saat Anda merasa kurang sehat, terutama jika Anda merasa demam, batuk, dan sulit bernapas. Segera hubungi petugas kesehatan terdekat, dan mintalah bantuan mereka. Sampaikan pada petugas jika dalam 14 hari sebelumnya Anda pernah melakukan perjalanan terutama ke negara terjangkit, atau pernah kontak erat dengan orang yang memiliki gejala yang sama. Ikuti arahan petugas kesehatan setempat.",

    };
    public static ArrayList<ProtectModel> getListData(){
        ArrayList<ProtectModel> list=new ArrayList<>();
        for (int position=0; position<title.length; position++){
            ProtectModel protectModel=new ProtectModel();
            protectModel.setTitle(title[position]);
            protectModel.setDeskripsi(deskripsi[position]);
            list.add(protectModel);
        }
        return list;
    }
}
