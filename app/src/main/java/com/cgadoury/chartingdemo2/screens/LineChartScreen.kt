package com.cgadoury.chartingdemo2.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aay.compose.baseComponents.model.GridOrientation
import com.aay.compose.lineChart.LineChart
import com.aay.compose.lineChart.model.LineParameters
import com.aay.compose.lineChart.model.LineType

/**
 * Purpose - Line Chart Screen - display a line chart with test data
 * @throws N/A
 * @constructor Emits a new LineChartScreen
 * @return Unit
 */
@Composable
fun LineChartScreen(){
    // Line chart data
    val testLineParameters: List<LineParameters> = listOf(

        // Each parameter represents a line on the chart
        LineParameters(
            label = "Goals",
            data = listOf(29.0, 21.0, 29.0, 42.0, 25.0, 39.0),
            lineColor = Color.Red,
            lineType = LineType.DEFAULT_LINE,
            lineShadow = true
        ),
        LineParameters(
            label = "Assists",
            data = listOf(44.0, 42.0, 41.0, 26.0, 47.0, 48.0),
            lineColor = Color(0xFF0000FF),
            lineType = LineType.CURVED_LINE,
            lineShadow = false
        )
    )

    Box(Modifier.fillMaxSize()){
        LineChart(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(400.dp)
                .align(Alignment.Center),
            linesParameters = testLineParameters,
            isGrid = true,
            gridColor = Color.Blue,

            // Data points on the x axis of the chart, match with data parameter
            xAxisData = listOf("2019", "2020", "2021", "2022", "2023", "2024"),
            animateChart = true,
            showGridWithSpacer = true,
            yAxisStyle = TextStyle(
                fontSize = 14.sp,
                color = Color.Gray,
            ),
            xAxisStyle = TextStyle(
                fontSize = 14.sp,
                color = Color.Gray,
                fontWeight = FontWeight.W400
            ),
            yAxisRange = 14,
            oneLineChart = false,
            gridOrientation = GridOrientation.VERTICAL
        )
    }
}