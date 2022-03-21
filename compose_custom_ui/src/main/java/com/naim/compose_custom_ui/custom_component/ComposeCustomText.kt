package com.naim.compose_custom_ui.custom_component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.naim.compose_custom_ui.style.base.BaseTextStyle

@Composable
fun ComposeCustomText(text: String, baseTextStyle: BaseTextStyle) {
    Text(
        text = text,
        modifier = baseTextStyle.modifier,
        color = baseTextStyle.color,
        fontSize = baseTextStyle.fontSize,
        fontStyle = baseTextStyle.fontStyle,
        fontWeight = baseTextStyle.fontWeight,
        fontFamily = baseTextStyle.fontFamily,
        letterSpacing = baseTextStyle.letterSpacing,
        textDecoration = baseTextStyle.textDecoration,
        textAlign = baseTextStyle.textAlign,
        lineHeight = baseTextStyle.lineHeight,
        overflow = baseTextStyle.overflow,
        softWrap = baseTextStyle.softWrap,
        maxLines = baseTextStyle.maxLines,
        onTextLayout = baseTextStyle.onTextLayout
    )
}