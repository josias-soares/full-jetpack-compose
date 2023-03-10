package br.com.unicredvisa.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import br.com.unicredvisa.ui.theme.*

private val DarkColorPalette = darkColors(
    background = Color.White,
    primary = PrimaryDark,
    primaryVariant = PrimaryVariantDark,
    secondary = SecondaryDark
)

private val LightColorPalette = lightColors(
    background = Color.White,
    primary = PrimaryLight,
    primaryVariant = PrimaryVariantLight,
    secondary = SecondaryLight

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun UnicredVisaTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}