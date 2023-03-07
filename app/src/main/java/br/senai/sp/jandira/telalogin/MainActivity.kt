package br.senai.sp.jandira.telalogin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telalogin.ui.theme.TelaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginTheme {
                loginScreen()

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun loginScreen() {

    var emailState by rememberSaveable {
        mutableStateOf("")
    }

    var passwordState by rememberSaveable {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)

            ) {

                Text(
                    text = stringResource(id = R.string.title),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color(207, 6, 240),
                )

                Text(
                    text = stringResource(id = R.string.description),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                    color = Color(160, 156, 156)

                )



                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {


                    Text(
                        text = stringResource(id = R.string.email),
                        modifier = Modifier.padding(8.dp)
                    )

                    OutlinedTextField(
                        value = emailState,
                        onValueChange = {
                            Log.i(" ", it)
                            emailState = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )

                    Text(
                        text = stringResource(id = R.string.password),
                        modifier = Modifier.padding(8.dp)
                    )


                    OutlinedTextField(
                        value = passwordState,
                        onValueChange = {
                            Log.i("", it)
                            passwordState = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                    )


                    Column() {

                    }



                    Column() {

                    }



                    Column() {

                    }



                    Column() {

                    }


                }
            }
        }

    }

}