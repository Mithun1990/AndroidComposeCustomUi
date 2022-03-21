package com.naim.compose_custom_ui.event

import com.naim.compose_custom_ui.model.RadioButtonData

sealed class RadioButtonEvent {
    data class onRadioButtonSelected(val radioButtonData: RadioButtonData) : RadioButtonEvent()
}