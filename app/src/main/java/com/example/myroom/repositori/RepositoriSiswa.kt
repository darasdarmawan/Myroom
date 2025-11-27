package com.example.myroom.repositori

import com.example.myroom.room.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}