package hoods.com.noteapplication.common

//управления состоянием экрана в приложении
sealed class ScreenViewState<out T> {
    object Loading:ScreenViewState<Nothing>()
    data class Success<T>(val data:T):ScreenViewState<T>()
    data class Error(val message:String?):ScreenViewState<Nothing>()
}