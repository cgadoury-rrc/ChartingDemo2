package com.cgadoury.chartingdemo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cgadoury.chartingdemo2.Navigation.Navigation
import com.cgadoury.chartingdemo2.destinations.Destination
import com.cgadoury.chartingdemo2.screens.BarChartScreen
import com.cgadoury.chartingdemo2.screens.DonutChartScreen
import com.cgadoury.chartingdemo2.screens.LineChartScreen
import com.cgadoury.chartingdemo2.screens.PieChartScreen
import com.cgadoury.chartingdemo2.screens.RadarChartScreen
import com.cgadoury.chartingdemo2.ui.theme.ChartingDemo2Theme

/**
 * Purpose - Charting Demo 2 - demonstrating the AAY charting library
 * AAY chart is a Kotlin multi-platform library containing 5 different chart composable's including:
 * - Bar Chart
 * - Donut Chart (Almost a variation of Pie Chart)
 * - Line Chart
 * - Pie Chart
 * - Radar Chart
 * Supported platforms are Desktop, Android, IOS, and Web
 * @version 1.1.0
 * @dependencies implementation("io.github.thechance101:chart:$latestVersion")
 * @author Colton Gadoury
 * @see "https://github.com/TheChance101/AAY-chart"
 */
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChartingDemo2Theme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "Charts Demo 2") }
                        )
                    },
                    bottomBar = {
                        Navigation(navController)
                    }
                ) { paddingValues ->
                    paddingValues.calculateBottomPadding()
                    NavHost(
                        navController = navController,
                        startDestination = Destination.LineChart.route,
                    ){
                        composable(Destination.LineChart.route) {
                            LineChartScreen()
                        }
                        composable(Destination.BarChart.route) {
                            BarChartScreen()
                        }
                        composable(Destination.PieChart.route) {
                            PieChartScreen()
                        }
                        composable(Destination.DonutChart.route) {
                            DonutChartScreen()
                        }
                        composable(Destination.RadarChart.route) {
                            RadarChartScreen()
                        }
                    }
                }
            }
        }
    }
}
