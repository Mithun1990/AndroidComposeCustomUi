package com.naim.compose_custom_ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonColors
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.naim.compose_custom_ui.R
import com.naim.compose_custom_ui.model.RadioButtonData

@Composable
fun ComposeRadioGroup(
    list: List<RadioButtonData>,
    radioButtonColor: Color? = colorResource(id = R.color.purple_500),
    radioButtonDisableColor: Color? = colorResource(id = R.color.disable_color)

) {
    val selectedRadioButton = remember { mutableStateOf(list.first()) }
    val rbTextColor = radioButtonColor ?: colorResource(id = R.color.purple_500)
    val rbDisableColor = radioButtonDisableColor ?: colorResource(id = R.color.disable_color)
    val colors: RadioButtonColors = RadioButtonDefaults.colors(
        selectedColor = rbTextColor,
        unselectedColor = rbTextColor,
        disabledColor = rbDisableColor
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        list.forEachIndexed { index, radioButtonData ->
            val enable = radioButtonData.isEnable ?: true
            Row {
                RadioButton(
                    modifier = Modifier
                        .size(24.dp),
                    selected = index == list.indexOf(selectedRadioButton.value),
                    onClick = { selectedRadioButton.value = radioButtonData },
                    colors = colors,
                    enabled = enable
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    modifier = Modifier
                        .weight(.5f, fill = true),
                    text = radioButtonData.title,
                    color = if (enable) rbTextColor else rbDisableColor
                )
            }

        }
    }


}