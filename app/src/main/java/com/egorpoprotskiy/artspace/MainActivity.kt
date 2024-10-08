package com.egorpoprotskiy.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.egorpoprotskiy.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 40.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ImageAdd(
            image = ImageBitmap.imageResource(R.drawable.girl_0)
        )
        DescriptionAndYearAdd(
            description = stringResource(id = R.string.description_0),
            year = stringResource(id = R.string.year_0)
        )
        ButtonAdd(
            buttonPreviews = stringResource(id = R.string.button_previous),
            buttonNext = stringResource(id = R.string.button_next)
        )
    }
}

@Composable
fun ImageAdd(
    image: ImageBitmap,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .size(500.dp)
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            image,
            contentDescription = null
        )
    }
}

@Composable
fun DescriptionAndYearAdd(
    description: String,
    year: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(30.dp)
            .background(color = Color.LightGray)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = description,
            fontStyle = FontStyle.Italic,
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = year,
            fontStyle = FontStyle.Italic,
        )
    }
}

@Composable
fun ButtonAdd(
    buttonPreviews: String,
    buttonNext: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.End
    ){
        Button(
            onClick = { /*TODO*/ },
            modifier = modifier.size(140.dp,40.dp)
        ) {
            Text(text = buttonPreviews)
        }
        Spacer(modifier = Modifier.width(40.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = modifier.size(140.dp,40.dp)
        ) {
            Text(text = buttonNext)
        }
    }
}


@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}