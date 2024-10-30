package com.example.componente_carrusel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.componente_carrusel.adapters.ImageAdapter
import com.example.componente_carrusel.models.ImageItem
import java.util.UUID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val carousel = findViewById<RecyclerView>(R.id.carousel)

        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "https://media.gq.com.mx/photos/6524411eb8a21650645ba1d2/4:3/w_2656,h_1992,c_limit/Dia-de-Muertos-catrina.jpg"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://unamglobal.unam.mx/wp-content/uploads/2023/10/destacada-origenes-e-historias-dia-de-los-muertos-1024x605.jpg"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://incassa.mx/wp-content/uploads/2024/08/freepik-export-20240818234844EjD-1.jpg"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://tycgroup.com/wp-content/uploads/2022/11/1.jpg"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://media.glamour.mx/photos/654133496a33fcbf0cee4260/4:3/w_2664,h_1998,c_limit/significado-de-la-catrina.jpg"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://www.elsoldehermosillo.com.mx/cultura/edxa5r-celrebracion-del-dia-de-muertos/alternates/LANDSCAPE_400/Celrebraci%C3%B3n%20del%20d%C3%ADa%20de%20muertos"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://www.elglobo.com.mx/cdn/shop/products/Pan_de_Muerto_Tradicional_Naranja_Familiar_Ok_3_1200x.jpg?v=1663974194"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://img.freepik.com/fotos-premium/dia-muertos-dia-muertos-mujer-hombre-pareja-disfraces-ai-generativa_839016-259.jpg?w=360"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://s.france24.com/media/display/bb3cf902-f248-11e8-9b85-005056a964fe/w:1280/p:4x3/mexico_dayofthedeadfv.jpg"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://www.elsoldehermosillo.com.mx/cultura/lvp0et-la-comida-no-puede-faltar-en-el-altar-de-muertos/ALTERNATES/LANDSCAPE_768/La%20comida%20no%20puede%20faltar%20en%20el%20altar%20de%20muertos"
            )
        )

        val ImageAdapter = ImageAdapter()
        carousel.adapter = ImageAdapter
        ImageAdapter.submitList(imageList)
    }
}