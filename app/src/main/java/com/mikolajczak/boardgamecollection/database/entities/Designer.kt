package com.mikolajczak.boardgamecollection.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "designers", primaryKeys = ["first_name", "last_name"])
data class Designer(
        @ColumnInfo(name = "first_name") val firstName: String,
        @ColumnInfo(name = "last_name") val lastName: String
)

