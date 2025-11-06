package com.cgadoury.chartingdemo2.Navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cgadoury.chartingdemo2.destinations.Destination

/**
 * Purpose - Navigation - handles the navigation for the app
 * @param navController: NavController - nav controller for the composable
 * @throws N/A
 * @constructor Emits the navigation bar
 * @return Unit
 */
@Composable
fun Navigation(navController: NavController) {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
        ) {
            Button(
                modifier = Modifier.padding(2.dp).weight(1f),
                onClick = { navController.navigate(Destination.LineChart.route) }
            ) {
                Text(text = "Line Chart")
            }
            Button(
                modifier = Modifier.padding(2.dp).weight(1f),
                onClick = { navController.navigate(Destination.BarChart.route) }
            ){
                Text(text = "Bar Chart")
            }
            Button(
                modifier = Modifier.padding(2.dp).weight(1f),
                onClick = { navController.navigate(Destination.PieChart.route) }
            ) {
                Text(text = "Pie Chart")
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
        ) {
            Button(
                modifier = Modifier.padding(2.dp).weight(1f),
                onClick = { navController.navigate(Destination.DonutChart.route) }
            ){
                Text(text = "Donut Chart")
            }
            Button (
                modifier = Modifier.padding(2.dp).weight(1f),
                onClick = { navController.navigate(Destination.RadarChart.route) }
            ) {
                Text(text = "Radar Chart")
            }
        }
    }
}
