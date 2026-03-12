package ru.aiapps.petcareapp.data.database

import android.content.Context
import androidx.databinding.adapters.Converters
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.aiapps.petcareapp.data.models.Contact
import ru.aiapps.petcareapp.data.models.DiaryEntry
import ru.aiapps.petcareapp.data.models.FeedingRecord
import ru.aiapps.petcareapp.data.models.MedicalRecord
import ru.aiapps.petcareapp.data.models.Pet
import ru.aiapps.petcareapp.data.models.Task
import ru.aiapps.petcareapp.data.models.WeightRecord

@Database(
    entities = [
        Pet::class,
        MedicalRecord::class,
        DiaryEntry::class,
        Task::class,
        WeightRecord::class,
        FeedingRecord::class,
        Contact::class
    ],
    version = 1,
    exportSchema = false
)

@TypeConverters(Converters::class)
abstract class PetDatabase : RoomDatabase() {
    abstract fun petDao(): PetDao
    abstract fun medicalRecordDao(): MedicalRecordDao
    abstract fun diaryEntryDao(): DiaryEntryDao
    abstract fun taskDao(): TaskDao
    abstract fun weightRecordDao(): WeightRecordDao
    abstract fun feedingRecordDao(): FeedingRecordDao
    abstract fun contactDao(): ContactDao

    companion object {
        @Volatile
        private var INSTANCE: PetDatabase? = null

        fun getDatabase(context: Context): PetDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PetDatabase::class.java,
                    "pet_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}