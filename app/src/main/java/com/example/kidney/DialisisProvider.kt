package com.example.kidney

import com.example.kidney.data.Dialisis

class DialisisProvider {

    companion object {

        val dialisisList = listOf<Dialisis>(
            Dialisis("Cambiar riñon",
                "tomó mucha gaseosa y le salieron calculos :'v",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Dialisis("Dialisis de refuerzo",
                "el riñon se esta recuperando al 100%",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png"),
            Dialisis("Dialisis de refuerzo",
                "el riñon se esta recuperando al 100%",
                "https://cdn.pixabay.com/photo/2021/10/09/12/36/kidney-6694025_960_720.png")
        )

    }
}