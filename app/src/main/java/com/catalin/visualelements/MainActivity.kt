package com.catalin.visualelements

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.catalin.visualelements.ui.theme.VisualElementsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualElementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    TestModifiers()
//                    TestLayout()
//                    TestSizing()
//                    LayoutExercise()
//                    TestText()
//                    TestTheme()
//                    TestImages()
//                    TestButtons()
//                    IgLayoutExercise()
//                    TestLazyLists()
//                    TestScrollable()
//                    TestGestures1()
//                    TestGestures2()
//                    TestProgressIndicators()
//                    TestAlertDialog()
//                    TestSideEffects()
                    DogsList()


                    val context = LocalContext.current
                    Toast.makeText(context, "Hey how's it going", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}