package com.example.trackr_v2.widget

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trackr_v2.R
import com.example.trackr_v2.ui.theme.TrackrColor

@Composable
fun MenuButton(
    description: String,
    @DrawableRes iconId: Int,
    color: Color,
    onClick: () -> Unit,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .size(75.dp)
                .background(color),
            onClick = onClick,
        ) {
            Icon(
                painter = painterResource(id = iconId),
                contentDescription = description,
            )
        }
        Text(description)
    }
}

@Preview(showBackground = true)
@Composable
fun MenuButtonPreview() {
    MenuButton(
        "preview",
        R.drawable.ic_baseline_local_gas_station_24,
        TrackrColor.red,
    ) {
    }
}


