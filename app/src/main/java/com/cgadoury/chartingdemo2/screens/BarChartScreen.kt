package com.cgadoury.chartingdemo2.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aay.compose.barChart.BarChart
import com.aay.compose.barChart.model.BarParameters

/**
 * Purpose - Bar Chart Screen - display a bar chart with test data
 * @throws N/A
 * @constructor Emits a new BarChartScreen
 * @return Unit
 */
@Composable
fun BarChartScreen() {
    val testBarParameters:List<BarParameters> = listOf(
        // The number of bar parameters is the amount of bars per x axis data point (i.e. 3 bars for a single year)
        BarParameters(
            dataName = "Games Played",
                      //  2019, 2020, 2021, 2022, 2023, 2024
            data = listOf(71.0, 56.0, 67.0, 81.0, 74.0, 82.0),
            barColor = Color.Blue
        ),
        BarParameters(
            dataName = "Points",
                      //  2019, 2020, 2021, 2022, 2023, 2024
            data = listOf(73.0, 63.0, 70.0, 68.0, 72.0, 87.0),
            barColor = Color.Gray
        ),
        BarParameters(
            dataName = "Penalty Minutes",
                      //  2019, 2020, 2021, 2022, 2023, 2024
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

            // X Axis data points
            xAxisData = listOf("2019", "2020", "2021", "2022", "2023", "2024"),
            isShowGrid = false,
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