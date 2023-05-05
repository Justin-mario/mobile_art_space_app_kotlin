package com.example.android.artspaceapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.artspaceapp.ui.theme.ArtSpaceAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceAppPreview()
                }
            }
        }
    }
}



@Composable
fun ButtonElement(@StringRes text: Int, modifier: Modifier = Modifier){
    Text(text = stringResource(id = text))

}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    Column() {
//        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null)

        Column() {
            Text(text = "")
            Text(text = "")
        }

        Row(modifier = modifier.fillMaxWidth()) {
            ButtonElement(text = R.string.previous,
                modifier = modifier
                    .wrapContentWidth(Alignment.Start))
            ButtonElement(text = R.string.next,
                modifier = modifier
                    .wrapContentWidth(Alignment.End))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceAppTheme {
        ArtSpaceApp()
    }
}