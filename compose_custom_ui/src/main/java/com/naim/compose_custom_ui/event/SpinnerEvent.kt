package com.naim.compose_custom_ui.event

import com.naim.compose_custom_ui.model.SpinnerData

sealed class SpinnerEvent {
    data class onComposeSpinnerItemSelected(val position: Int, val spinnerData: SpinnerData) :
        SpinnerEvent()

    object onComposeSpinnerNothingSelected : SpinnerEvent()
}
