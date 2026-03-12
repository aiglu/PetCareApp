package ru.aiapps.petcareapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "diary_entries")
data class DiaryEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val petId: Long,
    val date: Date,
    val content: String,
    val mood: Mood,
    val photoUri: String?
)

enum class Mood {
    HAPPY, NORMAL, SAD, SICK, PLAYFUL
}