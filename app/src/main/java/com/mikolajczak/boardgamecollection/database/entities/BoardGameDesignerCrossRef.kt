package com.mikolajczak.boardgamecollection.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["board_game_title", "designer_last_name", "designer_first_name"])
data class BoardGameDesignerCrossRef(
        @ColumnInfo(name = "board_game_title") val boardGameTitle: String,
        @ColumnInfo(name = "designer_last_name") val designerLastName: String,
        @ColumnInfo(name = "designer_first_name") val designerFirstName:String
)