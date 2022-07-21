package com.diego.kotlin.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * En el paquete model:
 * Los desarrolladores a menudo usan model como el nombre del paquete
 * para las clases que modelan (o representan) los datos.
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int)