package hoods.com.noteapplication.data.local.converters

import androidx.room.TypeConverter
import java.util.Date
//преобразования объектов Date в тип данных,
// который может быть сохранен в базе данных Room
class DateConverter {
    //Long в Date
    @TypeConverter
    fun toDate(date: Long?): Date? {
        return date?.let { Date(it) }
    }
//Date в Long
    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }

}


