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
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }

}