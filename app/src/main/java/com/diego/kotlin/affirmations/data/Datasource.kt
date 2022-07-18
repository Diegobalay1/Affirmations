package com.diego.kotlin.affirmations.data

import com.diego.kotlin.affirmations.R
import com.diego.kotlin.affirmations.model.Affirmation

/**
 * En paquete data:
 * Puede y debe ocultar esta preparación de datos en una clase de fuente de datos
 * separada que prepara los datos para la aplicación.
 */
class Datasource {

    fun loadAffirmations() : List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }

}