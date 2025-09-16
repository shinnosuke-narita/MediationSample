package org.example.mediationsample

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mediationsampleproject.composeapp.generated.resources.Res
import mediationsampleproject.composeapp.generated.resources.compose_multiplatform
import mediationsampleproject.composeapp.generated.resources.morning

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            BGMItem()
        }
    }
}

@Composable
fun BGMItem() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(15.dp)
    ) {
        Image(
            modifier =
                Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .size(90.dp),
            painter = painterResource(Res.drawable.morning),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )

        Spacer(Modifier.size(40.dp))

        Column {
            Text(
                "Summer Feeling",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(Modifier.size(10.dp))
            Text("3m15s")
        }

        Spacer(Modifier.weight(1f))
        Image(
            modifier = Modifier.size(40.dp),
            imageVector = Icons.Default.PlayArrow,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary),
            contentDescription = null
        )
        Spacer(Modifier.size(15.dp))
    }

}