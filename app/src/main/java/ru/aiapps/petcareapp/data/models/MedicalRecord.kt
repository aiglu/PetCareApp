package ru.aiapps.petcareapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName="medical_records")
data class MedicalRecord(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val petId: Long,
    val recordType: MedicalRecordType,
    val title: String,
    val date: Date,
    val vetName: String?,
    val notes: String?,
    val documentUri: String?,
    val nextDate: Date?
)

enum class MedicalRecordType {
    VACCINATION, EXAMINATION, TREATMENT, SURGERY, LAB_TEST, OTHER
}
