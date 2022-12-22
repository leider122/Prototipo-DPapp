package com.example.kidney

import com.example.kidney.data.Dialisis

class DialisisProvider {

    companion object {

        val dialisisList = listOf<Dialisis>(
            Dialisis("Preescripción de la diálisis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Dialisis("Control de liquidos",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Dialisis("Medicamentos",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Dialisis("Estado de ánimo",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png")
        )

    }
}