package com.example.kidney

import com.example.kidney.data.Preescripcion

class PreescripcionProvider {

    companion object {

        val preescripcionList = listOf<Preescripcion>(
            Preescripcion("Dialisis 10-6"),
            Preescripcion("Dialisis 10-7"),
            Preescripcion("Dialisis 10-8")
        )

    }
}