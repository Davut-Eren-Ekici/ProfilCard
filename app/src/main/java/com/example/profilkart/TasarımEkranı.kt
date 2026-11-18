package com.example.profilkart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TasarimEkrani() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .background(Color.Blue)
        )

        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(55.dp))
                Text(text = "Davut Eren Ekici", fontSize = 22.sp, fontWeight = Bold)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Bilişim Teknolojileri Öğrencisi / Geliştirici",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Proje
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "25", fontSize = 18.sp, fontWeight = Bold)
                    Text(text = "Proje", fontSize = 12.sp, color = Color.Gray)
                }
                // Takipçi
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "340", fontSize = 18.sp, fontWeight = Bold)
                    Text(text = "Takipçi", fontSize = 12.sp, color = Color.Gray)
                }
                // Takip
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "180", fontSize = 18.sp, fontWeight = Bold)
                    Text(text = "Takip", fontSize = 12.sp, color = Color.Gray)
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Mesaj Button
                Button(
                    onClick = {},
                    modifier = Modifier.width(180.dp)
                ) {
                    Text(text = "✉️Mesaj")
                }
                // Takip et button
                Button(
                    onClick = {},
                    modifier = Modifier.width(180.dp)
                ) {
                    Text(text = "Takip Et")
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Projeler",
                fontSize = 18.sp,
                fontWeight = Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "CodeTrack", fontSize = 16.sp, fontWeight = Bold)
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Yazılımcılar için geliştirilmiş canlı süre takibi, proje yönetimi ve istatistik sunan modern web uygulaması.",
                            fontSize = 13.sp,
                            color = Color.DarkGray
                        )
                    }
                }

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "AI Note Master", fontSize = 16.sp, fontWeight = Bold)
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Ders notlarını yapay zeka ile özetleyen ve test soruları üreten web uygulaması.",
                            fontSize = 13.sp,
                            color = Color.DarkGray
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 60.dp)
                .size(80.dp)
                .align(Alignment.TopCenter),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White, shape = RoundedCornerShape(40.dp))
            )
        }
    }
}