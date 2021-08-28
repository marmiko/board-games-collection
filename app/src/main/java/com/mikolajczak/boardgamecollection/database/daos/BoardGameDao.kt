package com.mikolajczak.boardgamecollection.database.daos

import androidx.room.Dao
import androidx.room.Query
import com.mikolajczak.boardgamecollection.database.entities.BoardGame

@Dao
interface BoardGameDao {
    @Query("SELECT * FROM board_games")
    fun getAll(): List<BoardGame>

    @Query("SELECT * FROM board_games WHERE title IN (:titles)")
    fun loadAllByTitle(titles: Array<String>): List<BoardGame>


}