package ru.otus.daggerhomework

import android.app.Application
import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class ViewModelReceiver @Inject constructor(
    @AppName private val context: Context,
    private val colorState: StateFlow<Int>
) {

    fun observeColors(): StateFlow<Int> {
        if (context !is Application) throw RuntimeException("Здесь нужен контекст апликейшена")
        Toast.makeText(context, "Color received", Toast.LENGTH_LONG).show()
        return colorState
    }

}