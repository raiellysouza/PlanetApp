package com.example.planetapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape. CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons. Icons
import androidx.compose.material.icons.filled. Favorite
import androidx.compose.material.icons.filled. FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime. Composable
import androidx.compose.ui. Alignment
import androidx.compose.ui. Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style. TextAlign
import androidx.compose.ui.unit.dp
import com.example.planetapp.model.Planet

@Composable
fun PlanetListItem(
    planet: Planet,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = planet.imageRes),
                contentDescription = "Imagem de ${planet.name}",
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = planet.name,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = planet.type,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}