package com.example.recyclerview_ex.data

object Data {

    val daftarSiswaBaru = arrayListOf(
        "Muhammad Azhumashafa Ahsananditya",
        "Muhammad Naufal Aulia",
        "Lalu Hilmy Abdurahman",
        "Mohammad Yasin Fitrah Filasuf",
        "Janu Anggana Saputra",
        "Reyhan Mohamad Akbar",
        "Rafif Musyaffa Falah",
        "Muhammad Fathan Hakim",
        "Aldimas Fajar Kurniawan",
        "Althaaf Ridha Muhammad Zaydaan Batubara",
        "Danish Maula Hasbi",
        "Ananda Dwi Mirza",
        "Genta Halilintar",
        "Muhammad Hanif Mishbahuddin",
        "Harits",
        "Syauqi Alif Ibrahim",
        "Muhammad Rafli Husein",
        "Galang Davian Pradana",
        "Muhammad Faiq Al Harits",
        "Ahmad Miqdad",
        "Lukman Hakim Al Qowiyyu",
        "Fairuzaky Rizq Alifiano",
        "Muhammad Hanan Sarwono",
        "Ramadhan Kautsar Pasya",
        "Muhammad lyad Irviansyah",
        "Kalingga Rafif Danisworo Kusnaji",
        "Khairiansyah Hafizh",
        "Altaf Parves Shua Ilham",
        "Hibban Abdurrahman Faries",
        "Fawaz Al Fajr",
        "Abdi Rabbani Syachandri",
    )

    val daftarUmur = arrayListOf(
        "18",
        "16",
        "15",
        "15",
        "16",
        "15",
        "15",
        "15",
        "16",
        "16",
        "15",
        "15",
        "15",
        "15",
        "15",
        "15",
        "15",
        "15",
        "15",
        "17",
        "15",
        "15",
        "16",
        "15",
        "15",
        "15",
        "16",
        "15",
        "15",
        "15",
        "15",
        "15",
    )

    val listNama: ArrayList<DataSiswa>
        get() {
            val listNama = arrayListOf<DataSiswa>()
            for (position in daftarSiswaBaru.indices) {
                val data = DataSiswa(
                    nama = daftarSiswaBaru[position],
                    umur = daftarUmur[position]
                )
                listNama.add(data)
            }
            return listNama
        }
}