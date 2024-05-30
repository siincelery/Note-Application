package hoods.com.noteapplication.domain.use_cases

import hoods.com.noteapplication.data.local.model.Note
import hoods.com.noteapplication.domain.repository.Repository
import javax.inject.Inject

class AddUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(note: Note) = repository.insert(note)
}

//AddUseCase перегружает оператор invoke,
// что позволяет вызывать его как функцию.
//Это упрощает использование кейса использования
// в других частях приложения.






