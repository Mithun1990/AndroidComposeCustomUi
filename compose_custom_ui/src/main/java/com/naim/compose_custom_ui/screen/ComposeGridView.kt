package com.naim.compose_custom_ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun <T> ComposeGridView(
    data: List<T>,
    gridColumn: Int,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    itemContent: @Composable BoxScope.(T, Int) -> Unit
) {
    LazyColumn {
        gridItems(data, gridColumn, horizontalArrangement, itemContent)
    }
}

private fun <T> LazyListScope.gridItems(
    data: List<T>,
    gridColumn: Int,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    itemContent: @Composable BoxScope.(T, Int) -> Unit
) {
    val rows = if (data.count() == 0) 0 else 1 + (data.count() - 1) / gridColumn
    items(rows) { rowIndex ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = Alignment.CenterVertically
        ) {

            for (columnIndex in 0 until gridColumn) {
                val itemIndex = rowIndex * gridColumn + columnIndex
                if (itemIndex < data.count()) {
                    Box(
                        modifier = Modifier
                            .weight(0.1f, fill = true),
                        contentAlignment = Alignment.Center
                    ) {
                        itemContent.invoke(this, data[itemIndex], itemIndex)
                    }
                } else {
                    Spacer(modifier = Modifier.weight(.1f, fill = true))
                }
            }
        }
    }
}