package com.cgadoury.chartingdemo2.destinations

open class Destination(val route:String) {
    object LineChart: Destination("linechart")
    object BarChart: Destination("barchart")
    object PieChart: Destination("piechart")
    object DonutChart: Destination("donutchart")
    object RadarChart: Destination("radarchart")
}