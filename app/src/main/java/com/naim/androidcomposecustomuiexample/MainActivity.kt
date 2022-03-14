package com.naim.androidcomposecustomuiexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.naim.androidcomposecustomuiexample.ui.theme.AndroidComposeCustomUIExampleTheme
import com.naim.compose_custom_ui.model.RadioButtonData
import com.naim.compose_custom_ui.screen.ComposeRadioGroup

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

            val list = listOf(
                RadioButtonData(title = "Bangladesh"),
                RadioButtonData(title = "India"),
                RadioButtonData(title = "Malaysia")
            )
            ComposeRadioGroup(list = list)
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