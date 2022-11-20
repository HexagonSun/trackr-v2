package com.example.trackr_v2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trackr_v2.ui.theme.TrackrColor
import com.example.trackr_v2.ui.theme.TrackrV2Theme
import com.example.trackr_v2.widget.MenuButton


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityTheme()
        }
    }
}

@Composable
fun ActivityTheme() {
    TrackrV2Theme {
        Surface(modifier = Modifier.fillMaxSize()) {

            BackgroundImage {
                Column(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
                    Greeting()

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {
                        MenuButton(
                            "Fuel",
                            R.drawable.ic_baseline_local_gas_station_24,
                            TrackrColor.red,
                        ) {

                        }

                        MenuButton(
                            "Stats",
                            R.drawable.ic_baseline_local_gas_station_24,
                            TrackrColor.green2
                        ) {

                        }

                        MenuButton(
                            "Settings",
                            R.drawable.ic_baseline_local_gas_station_24,
                            TrackrColor.egg,
                        ) {

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Text(
        text = stringResource(R.string.main_title),
        fontSize = 48.sp,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun BackgroundImage(foreground: @Composable () -> Unit) {
    Box {
        Image(
            painter = painterResource(R.drawable.road_surface_2),
            contentDescription = "Contact profile picture",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.matchParentSize()
        )
        foreground()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ActivityTheme()
}