package com.mikolajczak.boardgamecollection.database.entities

import android.graphics.Bitmap
import androidx.room.*
import java.sql.Date

@Entity(tableName = "board_games")
data class BoardGame (
    @PrimaryKey @ColumnInfo(name= "title") val title: String,
    @ColumnInfo(name="original_title") val originalTitle: String,
    @ColumnInfo(name="publish_year") val publishYear: Int,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name= "order_date") val orderDate: Date,
    @ColumnInfo(name = "add_date") val addDate: Date,
    @ColumnInfo(name = "price") val price: String,
    @ColumnInfo(name = "SCD") val SCD: String,
    @ColumnInfo(name="code") val code: String,
    @ColumnInfo(name = "bgg_id") val bggId: Long,
    @ColumnInfo(name = "production_code") val productionCode: String,
    @ColumnInfo(name="type") val type: String,
    @ColumnInfo(name = "rank") val rank: Int,
    @ColumnInfo(name = "comment") val comment: String?,
    @ColumnInfo(name="picture") val picture: Bitmap?
)

data class BoardGameWithDesigner(
        @Embedded val boardGame: BoardGame,
        @Relation(
                parentColumn = "title",
                entityColumn = "name"

        )
)
