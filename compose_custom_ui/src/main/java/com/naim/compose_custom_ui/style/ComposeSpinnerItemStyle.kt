package com.naim.compose_custom_ui.style

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.naim.compose_custom_ui.style.base.BaseTextStyle

class ComposeSpinnerItemStyle : BaseTextStyle() {
    var spinnerModifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .border(width = 0.5.dp, color = Color.LightGray, shape = RectangleShape)
}