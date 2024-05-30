package hoods.com.noteapplication.domain.repository

import hoods.com.noteapplication.data.local.model.Note
import kotlinx.coroutines.flow.Flow
//определяет только методы, которые должны быть доступны,
// без указания, как они реализованы.
interface Repository {
    fun getAllNotes(): Flow<List<Note>>
    fun getNoteById(id: Long): Flow<Note>
    suspend fun insert(note: Note)
    suspend fun update(note: Note)
    suspend fun delete(id: Long)
    fun getBookMarkedNotes(): Flow<List<Note>>
}


//Характеристика	fun	                   suspend fun
//Поток выполнения	Текущий поток	       Корутина
//Блокировка потока	Да	                   Нет
//Асинхронность	    Нет	                   Да
//Применение	    Большинство случаев	   Асинхронный код
