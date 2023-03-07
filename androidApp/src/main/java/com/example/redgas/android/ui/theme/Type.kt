package com.example.redgas.android.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.redgas.theme.*

val Typography = redGasTypography.toTypography()

fun RedGasTypography.toTypography() = Typography(
    bodyLarge = bodyLarge.toTextStyle(),
    titleLarge = titleLarge.toTextStyle(),
    labelSmall = labelSmall.toTextStyle()
)

fun RedGasTextStyle.toTextStyle() = TextStyle(
    fontFamily = fontFamily.toFontFamily(),
    fontWeight = fontWeight.toFontWeight(),
    fontSize = fontSize.sp
)

fun RedGasFontFamily.toFontFamily() = when(this) {
    RedGasFontFamily.DEFAULT -> FontFamily.Default
    RedGasFontFamily.CURSIVE -> FontFamily.Cursive
}

fun RedGasFontWeight.toFontWeight() = when(this) {
    RedGasFontWeight.NORMAL -> FontWeight.Normal
    RedGasFontWeight.MEDIUM -> FontWeight.Medium
}
