package com.example.kidney

import com.example.kidney.data.Alimentacion

class AlimentacionProvider {
    companion object {

        val alimentacionList = listOf<Alimentacion>(
            Alimentacion("Martes, 22 de noviembre",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Alimentacion("Lunes, 21 de noviembre",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Alimentacion("Domingo, 20 de noviembre",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png")
        )

    }
}