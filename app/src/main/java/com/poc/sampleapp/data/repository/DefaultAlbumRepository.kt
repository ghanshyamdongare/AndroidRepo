package com.poc.sampleapp.data.repository

import com.poc.sampleapp.data.api.ServiceApi
import com.poc.sampleapp.data.model.Albums
import com.poc.sampleapp.data.offline.AlbumDao
import java.lang.Exception
import javax.inject.Inject

class DefaultAlbumRepository @Inject constructor(
    private val serviceApi: ServiceApi,
    private val albumDao: AlbumDao
) {
    suspend fun getAlbums() {
        try {
            val result  = serviceApi.getAllAlbum()
            if(result.isSuccessful) {
                clearAlbumsDB()
                insertAlbumsDB(result.body()!!)
            }
        } catch (ex: Exception) {
        }
    }

    fun getAlbumsDB() = albumDao.getAlbums()

    private suspend fun clearAlbumsDB() = albumDao.clearAllAlbums()

    private suspend fun insertAlbumsDB(albums: List<Albums>) = albumDao.insertAllAlbum(albums)
}