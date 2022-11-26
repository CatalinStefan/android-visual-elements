package com.catalin.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun IgLayoutExercise() {
    Column {
        val profileImage = painterResource(id = R.drawable.person)

        val img1 = painterResource(id = R.drawable.img1_tokyo)
        val img2 = painterResource(id = R.drawable.img2_london)
        val img3 = painterResource(id = R.drawable.img3_paris)
        val img4 = painterResource(id = R.drawable.img4_newyork)
        val img5 = painterResource(id = R.drawable.img5_singapore)
        val img6 = painterResource(id = R.drawable.img6_bali)

        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(150.dp)
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = profileImage,
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "120", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.posts))
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "1234", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.followers))
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "567", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.following))
            }
        }

        // Info
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(1f)
        ) {
            Text(text = stringResource(id = R.string.user_name), fontWeight = FontWeight.Bold)
            Text(text = stringResource(id = R.string.ig_profile_description))
        }

        // Button
        Row(modifier = Modifier.padding(8.dp)) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.ig_profile_button),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }

        // Posts
        Column {
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                Image(
                    painter = img1, contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = img2, contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = img3, contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                Image(
                    painter = img4, contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = img5, contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = img6, contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}








