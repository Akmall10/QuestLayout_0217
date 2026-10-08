package com.example.week

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(25.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.card_0_bg)
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(12.dp)
                ) {
                    val gambar = painterResource(id = R.drawable.logo_umy)

                    Image(
                        painter = gambar,
                        contentDescription = "Logo UMY",
                        modifier = Modifier.size(90.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {
                        Text(
                            text = stringResource(id = R.string.nama),
                            fontSize = 28.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = stringResource(id = R.string.alamat),
                            fontSize = 18.sp,
                            color = Color.Yellow
                        )
                    }
                }
            }
        }

        Text(
            text = stringResource(id = R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 30.dp)
        )
    }
}
