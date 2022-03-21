package com.naim.compose_custom_ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.naim.compose_custom_ui.custom_component.ComposeCustomText
import com.naim.compose_custom_ui.event.SpinnerEvent
import com.naim.compose_custom_ui.model.SpinnerData
import com.naim.compose_custom_ui.style.ComposeSpinnerItemStyle


@Composable
fun ComposeSpinner(
    itemList: List<SpinnerData>,
    itemStyle: ComposeSpinnerItemStyle,
    onSpinnerEvent: (SpinnerEvent) -> Unit
) {
    manageDropDownView(itemList = itemList, itemStyle = itemStyle, onSpinnerEvent)
}

@Composable
private fun manageDropDownView(
    itemList: List<SpinnerData>,
    itemStyle: ComposeSpinnerItemStyle,
    onSpinnerEvent: (SpinnerEvent) -> Unit
) {
    var _isExpanded by remember { mutableStateOf(false) }
    var selectedTitle by remember {
        mutableStateOf(itemList[0].title)
    }

    Box(
        modifier = itemStyle.spinnerModifier.clickable(onClick = { _isExpanded = !_isExpanded }),
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            ComposeCustomText(
                text = selectedTitle,
                itemStyle.apply { modifier = Modifier.weight(1f) })
            Icon(
                modifier = Modifier.weight(.2f),
                imageVector = Icons.Filled.ArrowDropDown,
                contentDescription = null
            )
        }
        DropdownMenu(
            expanded = _isExpanded,
            onDismissRequest = {
                _isExpanded = !_isExpanded
                onSpinnerEvent.invoke(SpinnerEvent.onComposeSpinnerNothingSelected)
            },
        ) {
            itemList.forEachIndexed { position, item ->
                DropdownMenuItem(onClick = {
                    _isExpanded = !_isExpanded
                    selectedTitle = itemList[position].title
                    onSpinnerEvent.invoke(SpinnerEvent.onComposeSpinnerItemSelected(position, item))
                }) {
                    ComposeCustomText(
                        text = item.title,
                        itemStyle
                    )
                }
            }
        }

    }

//    Button(onClick = { _isExpanded = !_isExpanded }, modifier = itemStyle.modifier) {
//
//        Icon(
//            modifier = Modifier.size(24.dp),
//            imageVector = Icons.Filled.ArrowDropDown,
//            contentDescription = null,
//        )
//    }


}