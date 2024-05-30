package hoods.com.noteapplication.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import hoods.com.noteapplication.data.local.converters.DateConverter
import hoods.com.noteapplication.data.local.model.Note
//определение структуры базы данных
@TypeConverters(value = [DateConverter::class])
@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
//Передаем абстрактный метод для доступа к данным для NoteDao
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao
}











