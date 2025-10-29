package com.cgadoury.chartingdemo2.screens

import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.aay.compose.donutChart.PieChart
import com.aay.compose.donutChart.model.PieChartData

@Composable
fun PieChartScreen() {

    val testPieChartData: List<PieChartData> = listOf (
        PieChartData(
            partName = "Total Goals",
            data = 344.0,
            color = Color.Gray
        ),
        PieChartData(
            partName = "Total Assists",
            data = 473.0,
            color = Color(0xFFFFC300)
        )
    )

    PieChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .absoluteOffset(x=0.dp, y=250.dp),
        pieChartData = testPieChartData,
        ratioLineColor = Color.LightGray,
        textRatioStyle = TextStyle(color = Color.Gray)
    )
}