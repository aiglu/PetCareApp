package ru.aiapps.petcareapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "pets")
data class Pet(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val type: PetType,
    val breed: String?,
    val birthDate: Date?,
    val gender: Gender,
    val photoUri: String?,
    val isHidden: Boolean = false,
    val microchipNumber : String?,
    val notes: String?
)

enum class PetType {
    DOG, CAT, BIRD, HORSE, RABBIT, RAT, HUMSTER, SNAKE, OTHER
}

enum class Gender {
    MALE, FEMALE
}