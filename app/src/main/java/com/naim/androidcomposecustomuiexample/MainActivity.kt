package com.naim.androidcomposecustomuiexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.naim.androidcomposecustomuiexample.ui.theme.AndroidComposeCustomUIExampleTheme
import com.naim.compose_custom_ui.event.SpinnerEvent
import com.naim.compose_custom_ui.model.SpinnerData
import com.naim.compose_custom_ui.screen.ComposeSpinner
import com.naim.compose_custom_ui.style.ComposeSpinnerItemStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val list = listOf<Int>(
//                1,
//                2,
//                3,
//                4,
//                5,
//                6,
//                7,
//                8,
//                9,
//                10,
//                11,
//                12,
//                13,
//                14,
//                15,
//                16,
//                17,
//                18,
//                19,
//                20
//            )
//            ComposeGridView(
//                list,
//                gridColumn = 3,
//                horizontalArrangement = Arrangement.Start
//            ) { item, itemPosition ->
//                Row(
//                    modifier = Modifier
//                        .size(40.dp),
//                    horizontalArrangement = Arrangement.SpaceEvenly,
//                ) {
//                    Text(
//                        text = item.toString(),
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .clickable {
//                                println("Click Item $item $itemPosition")
//                            }
//                            .padding(10.dp),
//                        textAlign = TextAlign.Center
//                    )
//                }
//            }

//            val list = listOf(
//                RadioButtonData(title = "Bangladesh"),
//                RadioButtonData(title = "India"),
//                RadioButtonData(title = "Malaysia", isEnable = false),
//                RadioButtonData(title = "Australia"),
//            )
//            ComposeRadioGroup(list = list){
//
//            }

            val list = listOf(
                SpinnerData(title = "Bangladesh"),
                SpinnerData(title = "India"),
                SpinnerData(title = "Malaysia"),
                SpinnerData(title = "Australia"),
            )
            ComposeSpinner(
                itemList = list,
                itemStyle = ComposeSpinnerItemStyle().apply {
                    modifier = Modifier.fillMaxWidth()
                }) {
                when (it) {
                    is SpinnerEvent.onComposeSpinnerNothingSelected -> {
                        println("Spinner nothing selected")
                    }
                    is SpinnerEvent.onComposeSpinnerItemSelected -> {
                        println("Spinner ${it.position} selected")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeCustomUIExampleTheme {
        Greeting("Android")
    }
}