package fr.ryfacto.samplemokographics.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.ryfacto.samplemokographics.shared.Greeting
import android.widget.TextView
import dev.icerock.moko.graphics.colorInt
import fr.ryfacto.samplemokographics.shared.Theme

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
        tv.setTextColor(Theme.primaryColor.colorInt())
    }
}
