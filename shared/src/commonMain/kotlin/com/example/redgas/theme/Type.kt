package com.example.redgas.theme

data class RedGasTypography(val bodyLarge: RedGasTextStyle, val titleLarge: RedGasTextStyle, val labelSmall: RedGasTextStyle)

data class RedGasTextStyle(
    val fontFamily: RedGasFontFamily,
    val fontWeight: RedGasFontWeight,
    val fontSize: Float
)

enum class RedGasFontFamily { DEFAULT, CURSIVE }

enum class RedGasFontWeight { NORMAL, MEDIUM }

val redGasTypography = RedGasTypography(
    bodyLarge = RedGasTextStyle(
        fontFamily = RedGasFontFamily.DEFAULT,
        fontWeight = RedGasFontWeight.NORMAL,
        fontSize = 16f
    ),
    titleLarge = RedGasTextStyle(
        fontFamily = RedGasFontFamily.DEFAULT,
        fontWeight = RedGasFontWeight.NORMAL,
        fontSize = 22f
    ),
    labelSmall = RedGasTextStyle(
        fontFamily = RedGasFontFamily.DEFAULT,
        fontWeight = RedGasFontWeight.MEDIUM,
        fontSize = 11f
    ),
)
