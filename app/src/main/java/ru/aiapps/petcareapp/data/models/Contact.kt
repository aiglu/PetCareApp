package ru.aiapps.petcareapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val contactType: ContactType,
    val phone: String?,
    val email: String?,
    val address: String?,
    val notes: String?
)

enum class ContactType {
    VET, GROOMER, HOTEL, TRAINER, PHARMACY, TRIMMER, OTHER
}