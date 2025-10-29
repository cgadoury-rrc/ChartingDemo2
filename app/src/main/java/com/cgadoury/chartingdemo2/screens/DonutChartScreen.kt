package com.cgadoury.chartingdemo2.screens

import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.aay.compose.donutChart.DonutChart
import com.aay.compose.donutChart.model.PieChartData

@Composable
fun DonutChartScreen() {
    // Donut chart uses pie chart data!
    val testPieChartData: List<PieChartData> = listOf (
        PieChartData(
            partName = "Games Played",
            data = 888.0,
            color = Color.Green
        ),
        PieChartData(
            partName = "Total Goals",
            data = 344.0,
            color = Color.Cyan
        ),
        PieChartData(
            partName = "Total Assists",
            data = 473.0,
            color = Color.Magenta
        ),
        PieChartData(
            partName = "Penalty Minutes",
            data = 425.0,
            color = Color.Red
        )
    )

    // Create the donut chart
    DonutChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .absoluteOffset(x=0.dp, y=250.dp),
        pieChartData = testPieChartData,
        centerTitle = "Stats",
        centerTitleStyle = TextStyle(color = Color(0xFF071952)),
        outerCircularColor = Color.LightGray,
        innerCircularColor = Color.Gray,
        ratioLineColor = Color.DarkGray
    )
}