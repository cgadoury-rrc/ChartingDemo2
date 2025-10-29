package com.cgadoury.chartingdemo2.screens

import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aay.compose.radarChart.RadarChart
import com.aay.compose.radarChart.model.NetLinesStyle
import com.aay.compose.radarChart.model.Polygon
import com.aay.compose.radarChart.model.PolygonStyle

@Composable
fun RadarChartScreen() {
    val radarLabels = listOf(
        "Party A",
        "Party B",
        "Party C",
        "Party D ",
        "Party E",
        "Party F",
        "Party G",
        "Party H",
        "Party I"
    )

    val values = listOf(120.0, 160.0, 110.0, 112.0, 200.00, 120.0, 145.0, 101.0, 200.0)
    val values2 = listOf(180.0, 180.0, 165.0, 135.0, 120.0, 150.0, 140.0, 190.0, 200.0)

    val labelsStyle = TextStyle(
        color = Color.Black,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp
    )

    val scalarValuesStyle = TextStyle(
        color = Color.Blue,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp
    )

    RadarChart(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(400.dp)
            .absoluteOffset(x=0.dp, y=250.dp),
        radarLabels = radarLabels,
        labelsStyle = labelsStyle,
        netLinesStyle = NetLinesStyle(
            netLineColor = Color.Gray,
            netLinesStrokeWidth = 2f,
            netLinesStrokeCap = StrokeCap.Butt
        ),
        scalarSteps = 5,
        scalarValue = 200.0,
        scalarValuesStyle = scalarValuesStyle,
        polygons = listOf(
            Polygon(
                values = values,
                unit = "$",
                style = PolygonStyle(
                    fillColor = Color(0xff8DBEE1),
                    fillColorAlpha = 0.5f,
                    borderColor = Color(0xffFF8B99),
                    borderColorAlpha = 0.5f,
                    borderStrokeWidth = 2f,
                    borderStrokeCap = StrokeCap.Butt
                )
            ),
            Polygon(
                values = values2,
                unit = "$",
                style = PolygonStyle(
                    fillColor = Color(0xffBFF4FF),
                    fillColorAlpha = 0.5f,
                    borderColor = Color(0xffe6ffd6),
                    borderColorAlpha = 0.5f,
                    borderStrokeWidth = 2f,
                    borderStrokeCap = StrokeCap.Butt
                )
            )
        )
    )
}