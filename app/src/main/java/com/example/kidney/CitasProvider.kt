package com.example.kidney

import com.example.kidney.data.Alimentacion
import com.example.kidney.data.Citas

class CitasProvider {

    companion object {

        val citasList = listOf<Citas>(
            Citas("Cita de control",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Citas("Nefrólogo",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Citas("Examen médico",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Citas("Nutricionista",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png")
        )

    }
}