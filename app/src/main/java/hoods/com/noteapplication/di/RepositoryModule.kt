package hoods.com.noteapplication.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import hoods.com.noteapplication.data.repository.NoteRepositoryImpl
import hoods.com.noteapplication.domain.repository.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds//метод связывает интерфейс с его конкретной реализацией.
    @Singleton
    abstract fun bindRepository(repositoryImpl: NoteRepositoryImpl): Repository
}
//привязку интерфейса Repository к его конкретной
// реализации NoteRepositoryImpl




