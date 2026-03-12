package ru.aiapps.petcareapp.data.database

import androidx.room.TypeConverter
import ru.aiapps.petcareapp.data.models.ContactType
import ru.aiapps.petcareapp.data.models.Gender
import ru.aiapps.petcareapp.data.models.MedicalRecordType
import ru.aiapps.petcareapp.data.models.Mood
import ru.aiapps.petcareapp.data.models.PetType
import ru.aiapps.petcareapp.data.models.RecurringInterval
import ru.aiapps.petcareapp.data.models.TaskType
import java.sql.Date

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun fromPetType(value: PetType): String = value.name

    @TypeConverter
    fun toPetType(value: String): PetType = PetType.valueOf(value)

    @TypeConverter
    fun fromGender(value: Gender): String = value.name

    @TypeConverter
    fun toGender(value: String): Gender = Gender.valueOf(value)

    @TypeConverter
    fun fromMedicalRecordType(value: MedicalRecordType): String = value.name

    @TypeConverter
    fun toMedicalRecordType(value: String): MedicalRecordType = MedicalRecordType.valueOf(value)

    @TypeConverter
    fun fromMood(value: Mood): String = value.name

    @TypeConverter
    fun toMood(value: String): Mood = Mood.valueOf(value)

    @TypeConverter
    fun fromTaskType(value: TaskType): String = value.name

    @TypeConverter
    fun toTaskType(value: String): TaskType = TaskType.valueOf(value)

    @TypeConverter
    fun fromRecurringInterval(value: RecurringInterval): String = value.name

    @TypeConverter
    fun toRecurringInterval(value: String): RecurringInterval = RecurringInterval.valueOf(value)

    @TypeConverter
    fun fromContactType(value: ContactType): String = value.name

    @TypeConverter
    fun toContactType(value: String): ContactType = ContactType.valueOf(value)
}