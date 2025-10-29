package com.cgadoury.chartingdemo2.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.aay.compose.barChart.BarChart
import com.aay.compose.barChart.model.BarParameters

@Composable
fun BarChartScreen() {
    val testBarParameters:List<BarParameters> = listOf(
        // Number of bar parameters is the amount of bars per
        // x axis data point (i.e. 3 bars for a single year)
        BarParameters(
            dataName = "Games Played",
            data = listOf(71.0, 56.0, 67.0, 81.0, 74.0, 82.0),
            barColor = Color.Blue
        ),
        BarParameters(
            dataName = "Points",
            data = listOf(73.0, 63.0, 70.0, 68.0, 72.0, 87.0),
            barColor = Color.Gray
        ),
        BarParameters(
            dataName = "Penalty Minutes",
            data = listOf(45.0, 12.0, 23.0, 43.0, 57.0, 61.0),
            barColor = Color.Red
        )
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(400.dp)

            // Unfortunately BarChart does not accept modifier
            .absoluteOffset(x=0.dp, y=250.dp)
    ) {
        BarChart(
           chartParameters = testBarParameters,
            gridColor = Color.DarkGray,
            xAxisData = listOf("2019", "2020", "2021", "2022", "2023", "2024"),
            isShowGrid = true,
            animateChart = true,
            showGridWithSpacer = true,
            yAxisStyle = TextStyle(
                fontSize = 14.sp,
                color = Color.DarkGray
            ),
            xAxisStyle = TextStyle(
                fontSize = 14.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.W400
            ),
            yAxisRange = 15,
            barWidth = 15.dp
        )
    }
}