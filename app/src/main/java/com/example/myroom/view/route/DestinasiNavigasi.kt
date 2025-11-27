package com.example.myroom.view.route

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composable
     */
    val route: String

    /**
     * String resources id yang berisi judul yang akan ditampilkan di layar
        halaman.
     */
    val titleRes: Int
}