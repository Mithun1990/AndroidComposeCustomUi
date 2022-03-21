package com.naim.compose_custom_ui.style.base

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

open class BaseTextStyle {
    open var modifier: Modifier = Modifier
    open var color: Color = Color.Unspecified
    open var fontSize: TextUnit = TextUnit.Unspecified
    open var fontStyle: FontStyle? = null
    open var fontWeight: FontWeight? = null
    open var fontFamily: FontFamily? = null
    open var letterSpacing: TextUnit = TextUnit.Unspecified
    open var textDecoration: TextDecoration? = null
    open var textAlign: TextAlign? = null
    open var lineHeight: TextUnit = TextUnit.Unspecified
    open var overflow: TextOverflow = TextOverflow.Clip
    open var softWrap: Boolean = true
    open var maxLines: Int = Int.MAX_VALUE
    open var onTextLayout: (TextLayoutResult) -> Unit = {}
}