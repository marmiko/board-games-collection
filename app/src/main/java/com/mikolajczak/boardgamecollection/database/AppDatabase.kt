package com.mikolajczak.boardgamecollection.database

import androidx.room.Database
import com.mikolajczak.boardgamecollection.database.daos.BoardGameDao
import com.mikolajczak.boardgamecollection.database.entities.BoardGame

@Database(entities = [BoardGame::class], version=1)
abstract class AppDatabase {
    abstract fun boardGameDao(): BoardGameDao
}