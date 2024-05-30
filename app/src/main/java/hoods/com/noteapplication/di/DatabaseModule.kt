package hoods.com.noteapplication.di

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import hoods.com.noteapplication.data.local.NoteDao
import hoods.com.noteapplication.data.local.NoteDatabase
import hoods.com.noteapplication.data.local.model.Note
import javax.inject.Singleton
//отвечает за создание и предоставление экземпляров
// базы данных Room (NoteDatabase) и DAO (NoteDao)
@Module //класс является Dagger-модулем.
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides //метод предоставляет экземпляр объекта
    @Singleton //гарантировать, что будет создан только
               // один экземпляр NoteDao для всего приложения.
    fun provideNoteDao(database: NoteDatabase): NoteDao =
        database.noteDao

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context,
    ): NoteDatabase = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "notes_db"
    )
        .build()

}



