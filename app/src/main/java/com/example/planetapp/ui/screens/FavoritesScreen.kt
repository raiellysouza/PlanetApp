package com.example.planetapp.ui.screens

@ExperimentalMaterial3Api
@Composable

fun FavoritesScreen(
    onPlanetSelected: (Planet) -> Unit,
    onFavoriteToggle: (Planet) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Favoritos",

                        style = MaterialTheme.typography.titleLarge

                    )
                }
            )
        }
    ) {
        innerPadding ->
        val favoritePlanets = planetList.filter { it.isFavorite }
        if (favoritePlanets.isEmpty()) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) { Text(
                text = "Você ainda não adicionou favoritos.",
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            }
        } else {

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(horizontal = 8.dp)
            ) {
                items(favoritePlanets) { planet ->
                    PlanetListItem(
                        planet = planet,

                        onPlanetSelected = { onPlanetSelected(it) },
                        onFavoriteToggle = { onFavoriteToggle(it) }
                    )
                }
            }
        }
    }
}