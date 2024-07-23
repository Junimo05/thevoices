package com.example.thevoices.presentations.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.thevoices.R

@Composable
fun BottomBar(
    navController: NavController
) {
    //change it to State
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }
    val items = listOf(
        BottomBarItem(
            route = "home",
            selectedIcon = R.drawable.home,
            unselectedIcon = R.drawable.home,
            contentDescription = "Home"
        ),
        BottomBarItem(
            route = "search",
            selectedIcon = R.drawable.search,
            unselectedIcon = R.drawable.search,
            contentDescription = "Search"
        ),
        BottomBarItem(
            route = "record",
            selectedIcon = R.drawable.record,
            unselectedIcon = R.drawable.record,
            contentDescription = "Record"
        ),
        BottomBarItem(
            route = "profile",
            selectedIcon = R.drawable.person,
            unselectedIcon = R.drawable.person,
            contentDescription = "Profile"
        ),
        BottomBarItem(
            route = "settings",
            selectedIcon = R.drawable.setting,
            unselectedIcon = R.drawable.setting,
            contentDescription = "Settings"
        ),
    )


    NavigationBar {
        items.forEachIndexed() { index, item ->
            NavigationBarItem(
                selected = selectedItemIndex == index,
                onClick = {
                    selectedItemIndex = index
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(
                            if (selectedItemIndex == index) item.selectedIcon else item.unselectedIcon
                        ),
                        contentDescription = item.contentDescription,
                        modifier = Modifier.width(24.dp)
                    )
                }
            )
        }
    }
}

data class BottomBarItem(
    val route: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val contentDescription: String,
)

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar(navController = rememberNavController())
}