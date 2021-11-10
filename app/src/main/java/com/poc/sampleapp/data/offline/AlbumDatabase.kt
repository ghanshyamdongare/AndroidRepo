package com.poc.sampleapp.data.offline

import androidx.room.Database
import androidx.room.RoomDatabase
import com.poc.sampleapp.data.model.Albums

@Database(entities = [Albums::class], version = 1, exportSchema = false)
abstract class AlbumDatabase: RoomDatabase() {
    abstract fun getAlbumDao(): AlbumDao
}