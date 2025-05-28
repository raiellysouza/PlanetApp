package com.example.planetapp.model

import com.example.planetapp.R

data class Planet(
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val planetList = listOf(
    Planet(
        name = "Mercúrio",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "57,9 milhões km",
        diameter = "4.879 km",
        characteristics = "O menor planeta do sistema solar e o mais próximo do Sol.",
        imageRes = R.drawable.mercurio
    ),
    Planet(
        name = "Vênus",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "108,2 milhões km",
        diameter = "12.104 km",
        characteristics = "Planeta com atmosfera densa e temperaturas extremamente altas.",
        imageRes = R.drawable.venus
    ),
    Planet(
        name = "Terra",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "149,6 milhões km",
        diameter = "12.742 km",
        characteristics = "O único planeta conhecido com vida.",
        imageRes = R.drawable.terra
    ),
    Planet(
        name = "Marte",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "227,9 milhões km",
        diameter = "6.779 km",
        characteristics = "Conhecido como o Planeta Vermelho devido ao seu solo rico em ferro.",
        imageRes = R.drawable.marte
    ),
    Planet(
        name = "Júpiter",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "778,5 milhões km",
        diameter = "139.822 km",
        characteristics = "O maior planeta do sistema solar, com uma grande mancha vermelha.",
        imageRes = R.drawable.jupiter
    ),
    Planet(
        name = "Saturno",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "1,4 bilhões km",
        diameter = "116.464 km",
        characteristics = "Famoso por seus anéis visíveis e compostos principalmente por gelo e rocha.",
        imageRes = R.drawable.saturno
    ),
    Planet(
        name = "Urano",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "2,9 bilhões km",
        diameter = "50.724 km",
        characteristics = "Planeta azul esverdeado, rotaciona de lado em seu eixo.",
        imageRes = R.drawable.urano
    ),
    Planet(
        name = "Netuno",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "4,5 bilhões km",
        diameter = "49.244 km",
        characteristics = "Conhecido pelos ventos mais fortes do sistema solar.",
        imageRes = R.drawable.netuno
    )
)
