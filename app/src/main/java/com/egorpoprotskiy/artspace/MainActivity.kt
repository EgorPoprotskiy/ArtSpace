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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
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
    var result by remember { mutableStateOf(2) }
    var imageResource = when (result) {
        1 -> R.drawable.girl_0
        2 -> R.drawable.girl_2
        3 -> R.drawable.girl_3
        4 -> R.drawable.girl_4
        5 -> R.drawable.girl_5
        else -> R.drawable.girl_6
    }
    var textTitleResource = when (result) {
        1 -> stringResource(R.string.description_1)
        2 -> stringResource(R.string.description_2)
        3 -> stringResource(R.string.description_3)
        4 -> stringResource(R.string.description_4)
        5 -> stringResource(R.string.description_5)
        else -> stringResource(R.string.description_6)
    }
    var textDamageResource = when (result) {
        1 -> stringResource(R.string.damage_1)
        2 -> stringResource(R.string.damage_2)
        3 -> stringResource(R.string.damage_3)
        4 -> stringResource(R.string.damage_4)
        5 -> stringResource(R.string.damage_5)
        else -> stringResource(R.string.damage_6)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = null
        )
        Text(
            text = textTitleResource
        )
        Text(
            text = textDamageResource
        )

        Row {
            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(
                    text = "previous"
                )
            }
            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(
                    text = "Next"
                )
            }
        }
    }
}

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(bottom = 40.dp),
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        ImageAdd(
//            image = ImageBitmap.imageResource(imageResource)
//        )
//        DescriptionAndYearAdd(
//            description = stringResource(id = R.string.description_1),
//            year = stringResource(id = R.string.damage_1)
//        )
//        ButtonAdd(
//            buttonPreviews = stringResource(id = R.string.button_previous),
//            buttonNext = stringResource(id = R.string.button_next)
//        )
//    }
//}

//@Composable
//fun ImageAdd(
//    image: ImageBitmap,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier = modifier
//            .size(500.dp)
//            .padding(30.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Image(
//            image,
//            contentDescription = null
//        )
//    }
//}

//@Composable
//fun DescriptionAndYearAdd(
//    description: String,
//    year: String,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier = modifier
//            .padding(30.dp)
//            .background(color = Color.LightGray)
//            .fillMaxWidth(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = description,
//            fontStyle = FontStyle.Italic,
//        )
//        Spacer(modifier = Modifier.padding(10.dp))
//        Text(
//            text = year,
//            fontStyle = FontStyle.Italic,
//        )
//    }
//}

//@Composable
//fun ButtonAdd(
//    buttonPreviews: String,
//    buttonNext: String,
//    modifier: Modifier = Modifier
//) {
//    var result by remember { mutableStateOf(1) }
//    Row(
//        verticalAlignment = Alignment.Bottom,
//        horizontalArrangement = Arrangement.End
//    ){
//        Button(
//            onClick = { result += 2
//            },
//            modifier = modifier.size(140.dp,40.dp)
//        ) {
//            Text(text = buttonPreviews)
//        }
//        Spacer(modifier = Modifier.width(40.dp))
//        Button(
//            onClick = { /*TODO*/ },
//            modifier = modifier.size(140.dp,40.dp)
//        ) {
//            Text(text = buttonNext)
//        }
//    }
//}


@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}