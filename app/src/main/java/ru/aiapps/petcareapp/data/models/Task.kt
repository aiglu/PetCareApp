package ru.aiapps.petcareapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val petId: Long?,
    val title: String,
    val description: String?,
    val dateTime: Date,
    val taskType: TaskType,
    val isRecurring: Boolean = false,
    val recurringInterval: RecurringInterval?,
    val isCompleted: Boolean = false,
    val reminderTime: Int? // минут до события
)

enum class TaskType {
    FEEDING, WALK, MEDICINE, VET_VISIT, GROOMING, OTHER
}

enum class RecurringInterval {
    DAILY, WEEKLY, MONTHLY, YEARLY
}