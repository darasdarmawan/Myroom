package com.example.myroom.room

import androidx.room.Dao
import androidx.room.Query

@Dao
interface SiswaDAO {
    @Query("SELECT * from tblSiswa ORDER BY nama ASC")

}