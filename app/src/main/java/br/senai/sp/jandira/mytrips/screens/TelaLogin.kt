package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun TelaLogin(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(
                listOf(
                    (Color(0xFFFFFFFF)),
                    Color(0xFFFFFFFF)
                )
            )),
    ) {
        Card(
        modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .align(Alignment.TopEnd),
        shape = RoundedCornerShape(
            bottomStart = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF691BB9)
        ),
    ) {}
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 10.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF691BB9)
            ),
        ) {}
        Column (
            modifier = Modifier
                .padding(22.dp)
                .height(400.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                Text(
                    text = stringResource(R.string.app_name),
                    fontSize = 42.sp,
                    color = Color(0xFF673AB7),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.logo_descripition),
                    fontSize = 24.sp,
                    color = Color(0xFF673AB7)
                )
            }
            Column (
                modifier = Modifier
                    .height(250.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.End
            ){
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    shape = RoundedCornerShape(12.dp),
                    label = {
                        Text(text = stringResource(R.string.your_name_here))
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = ""
                        )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    shape = RoundedCornerShape(12.dp),
                    label = {
                        Text(text = stringResource(R.string.welcome))
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = ""
                        )
                    }
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 16.dp)
                ) {
                    Text(
                        text = stringResource(R.string.next)
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }
                Row (
                    modifier = Modifier
                        .width((270.dp)),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = stringResource(R.string.account),
                        fontSize = 18.sp,
                        color = Color(0xC41F1E1E)
                    )
                    Text(
                        text = stringResource(R.string.signup),
                        fontSize = 20.sp,
                        color = Color(0xFF673AB7)

                    )
                }
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaLoginPreview() {
    TelaLogin()
}
