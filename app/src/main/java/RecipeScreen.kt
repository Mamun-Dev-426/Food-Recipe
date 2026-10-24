package com.example.foodrecipe.screens
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import com.example.foodrecipe.R
import com.example.foodrecipe.screens.Recipe
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import  androidx.compose.ui.draw.clip
import androidx.compose.runtime.*
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodrecipe.AppCard
import com.example.foodrecipe.Cyan

data class Recipe(
    val name: String,
    val image: Int,
    val ingredients: String,
    val instructions: String
)

val breakfastRecipes = listOf(

    Recipe(
        name = "Pancake",
        image = R.drawable.pancake ,
        ingredients ="Flour, Milk, Egg, Suger",
        instructions = "Mix every item so well On a Plate.. Mix Every Item Parfectly.... " +
                "Aftar Mixing Put it on Pan And Cook it's 2 side as well For 5-6 minute"
    ),

    Recipe(
        name = "Omelette",
        image = R.drawable.omelete,
        ingredients = "Egg, Onion, Salt, Pepper",
        instructions = "Beat eggs and Mix the Egg with Onion,salt,paper..." +
                " Put oil On Pan And bring The egg On The Oil And Fry For 4-5 Minute "
    ),

    Recipe(
        name = "Porota",
        image = R.drawable.porota,
        ingredients = "Flour,oil,watar,Salt",
        instructions = "First Mix The Flour With The Watar Parfectly, Then Shaped the Mixed Flour in Circle in Medium Size, After This put it on Pan And cook It with oil 2 side as parfectly ",
    ),

    Recipe(
        name = "Dal Puri",
        image = R.drawable.dalpuri,
        ingredients = " Dal, Spices, salt, flour, oil, Watar,",
        instructions = " First prepare the dough with Flour, salt, oil, Watar, And rest it for 10 min... " +
                " Divide The dough into equal balls And Shape the ball into a cup and place The mixed Dal With Spices Into the Dough...." +
                " Then Roll the dough and fry it on oil.. "
    ),

    Recipe(
        name = "Halwa",
        image = R.drawable.halwa,
        ingredients = "Sooji, Ghee Or Butter, Suger, Nuts, Milk, Water..",
        instructions = "First put the water on Suger in a pot and boil Until Melts,,,Then Mixed The milk on melt Sugar and boil some time,, After This Mix The Sooji In Milk And Cook It As Well For 10 Minute,"
    ),
    Recipe(
        name = "Panta Vat",
        image = R.drawable.panta,
        ingredients = " Vat, Salt, Onion, red Chili, Mustard Oil.. ",
        instructions = "First Mix The Rice with Water For 1 Hour,, After This put the Vat on a Plate And Mix Onion,,Chili And Mustard Oil as well,, And Eat This With Fried Fish ",

        )

)

val lunchRecipes = listOf(

    Recipe(
        name = "Chicken Biryani",
        image = R.drawable.biriyani,
        ingredients = "Rice, Chicken, Spices, oil, Onion,",
        instructions = "Cook rice and chicken together, To Make It Delicious And Mix All Of The item So Well."
    ),

    Recipe(
        name = "Beef Khichuri",
        image = R.drawable.beefkhicuri,
        ingredients = "Rice, Lentils, Beef, Onion, Garlic, Ginger, Turmeric, Oil, Salt",
        instructions = "Cook the beef with onion, garlic, ginger and spices until tender. Add the rice and lentils, then pour in water and cook until everything becomes soft and well mixed."
    ),

    Recipe(
        name = "Fried Rice",
        image = R.drawable.friedrice,
        ingredients = "Rice, Egg, Vegetables, oil",
        instructions = "First Put The Oil On Pan And Mix The Vegetables with The Oil,,Then Mix All The Spices With The Vegetable To make It delicious.. and Then Mixed The rice With The vegetable And Cook For 5-10 Minute."
    ),
    Recipe(
        name = "Fish Curry",
        image = R.drawable.fishcurry,
        ingredients = "Fish, Onion, Tomato, Garlic, Ginger, Turmeric, Red Chili Powder, Oil, Salt, Water",
        instructions = "Heat the oil and fry the fish pieces lightly, then set them aside. In the same pan, cook the onions until golden brown. Add garlic, ginger, tomatoes, turmeric, red chili powder and salt, then cook for 5-7 minutes. Pour in water and bring it to a boil. Add the fried fish and simmer for 10-15 minutes until the curry is rich and flavorful. Serve hot with steamed rice."
    ),

    Recipe(
        name = "Vegetable Fried Rice",
        image = R.drawable.vagetalerice,
        ingredients = "Rice, Carrot, Peas, Beans, Egg, Soy Sauce, Oil, Salt",
        instructions = "Heat the oil and cook the vegetables for 5 minutes. Add the beaten egg and stir well. Mix in the cooked rice, soy sauce and salt, then fry for another 5-7 minutes before serving."
    ),

    Recipe(
        name = "Chicken Curry",
        image = R.drawable.chickencurry,
        ingredients = "Chicken, Onion, Tomato, Garlic, Ginger, Curry Powder, Oil, Salt",
        instructions = "Heat the oil and fry the onions until soft. Add garlic, ginger, tomatoes and curry powder. Add the chicken and cook for 20-25 minutes until tender. Serve hot with rice."
    ),

    )

val dinnerRecipes = listOf(

    Recipe(
        name = "Grilled Chicken",
        image = R.drawable.grilled,
        ingredients = "Chicken,spices, Butter, Garlic",
        instructions = "Cut The Chicken And Mix The Spices With This,, Then The Chicken Grill for 20 minutes."
    ),

    Recipe(
        name = "Beef Steak with Mashed Potatoes",
        image = R.drawable.grilledbeef,
        ingredients = "Beef Steak, Potatoes, Butter, Garlic, Black Pepper, Oil, Salt",
        instructions = "Season the beef steak with garlic, black pepper and salt. Heat the oil and cook the steak for 4-5 minutes on each side until fully cooked. Boil the potatoes until soft, then mash them with butter and a little salt. Serve the beef steak hot with mashed potatoes."
    ),

    Recipe(
        name = "Chicken Sandwich",
        image = R.drawable.sanswitch,

        ingredients = "Bread, Chicken, Lettuce, Tomato, Mayonnaise, Butter, Salt",
        instructions = "Cook the chicken with salt until fully done. Toast the bread with butter. Spread mayonnaise on the bread, then add lettuce, tomato and chicken. Cover with another slice of bread and serve."
    ),

    Recipe(
        name = "Vegetable Soup",
        image = R.drawable.soup,
        ingredients = "Carrot, Potato, Cabbage, Beans, Garlic, Butter, Salt, Black Pepper, Water",
        instructions = "Heat the butter and cook the garlic for 1 minute. Add all the vegetables and stir well. Pour in water and cook until the vegetables become soft. Season with salt and black pepper, then serve hot."
    ),

    Recipe(
        name = "Chicken Noodles",
        image = R.drawable.noodles,
        ingredients = "Noodles, Chicken, Carrot, Cabbage, Soy Sauce, Oil, Salt",
        instructions = "Boil the noodles until soft and drain the water. Heat the oil and cook the chicken until tender. Add the vegetables and stir-fry for 5 minutes. Mix the noodles with soy sauce and salt, then cook for another 3-5 minutes before serving."
    ),

    Recipe(
        name = "Pasta",
        image = R.drawable.pasta,
        ingredients = "Pasta, Cheese, Egg, Sauce",
        instructions = "First Boil pasta and Fried The Egg On Oil and mix sauce,Spices, Vegetable With The Egg, Aftar This Mix The Boiled Pasta With Vegetable so Well And Cook For 5 minute ."
    )

)

val snackRecipes = listOf(

    Recipe(
        name = "Burger",
        image = R.drawable.burger,
        ingredients = "Bun, Beef Patty, Cheese",
        instructions = "Assemble and serve."
    ),

    Recipe(
        name = "Pizza",
        image = R.drawable.pizza,
        ingredients = "Dough, Cheese, Tomato Sauce",
        instructions = "Bake for 15 minutes."
    )

)

enum class Screen {
    CATEGORY,
    BREAKFAST,
    LUNCH,
    DINNER,
    SNACK,
    DETAILS
}

@Composable
fun RecipeScreen() {

    var currentScreen by remember {
        mutableStateOf(Screen.CATEGORY)
    }

    var selectedRecipe by remember {
        mutableStateOf<Recipe?>(null)
    }

    when (currentScreen) {

        Screen.CATEGORY -> {

            CategoryScreen(

                onBreakfastClick = {
                    currentScreen = Screen.BREAKFAST
                },

                onLunchClick = {
                    currentScreen = Screen.LUNCH
                },

                onDinnerClick = {
                    currentScreen = Screen.DINNER
                },

                onSnackClick = {
                    currentScreen = Screen.SNACK
                }

            )

        }

        Screen.BREAKFAST -> {

            RecipeGridScreen(

                title = "Breakfast",

                recipes = breakfastRecipes,

                onBack = {
                    currentScreen = Screen.CATEGORY
                },

                onRecipeClick = {

                    selectedRecipe = it
                    currentScreen = Screen.DETAILS

                }

            )

        }

        Screen.LUNCH -> {

            RecipeGridScreen(

                title = "Lunch",

                recipes = lunchRecipes,

                onBack = {
                    currentScreen = Screen.CATEGORY
                },

                onRecipeClick = {

                    selectedRecipe = it
                    currentScreen = Screen.DETAILS

                }

            )

        }

        Screen.DINNER -> {

            RecipeGridScreen(

                title = "Dinner",

                recipes = dinnerRecipes,

                onBack = {
                    currentScreen = Screen.CATEGORY
                },

                onRecipeClick = {

                    selectedRecipe = it
                    currentScreen = Screen.DETAILS

                }

            )

        }

        Screen.SNACK -> {

            RecipeGridScreen(

                title = "Snack",

                recipes = snackRecipes,

                onBack = {
                    currentScreen = Screen.CATEGORY
                },

                onRecipeClick = {

                    selectedRecipe = it
                    currentScreen = Screen.DETAILS

                }

            )

        }

        Screen.DETAILS -> {

            selectedRecipe?.let {

                RecipeDetailScreen(

                    recipe = it,

                    onBack = {

                        currentScreen = Screen.CATEGORY

                    }

                )

            }

        }

    }

}

@Composable
fun CategoryScreen(
    onBreakfastClick: () -> Unit,
    onLunchClick: () -> Unit,
    onDinnerClick: () -> Unit,
    onSnackClick: () -> Unit
) {

    var search by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        OutlinedTextField(
            value = search,
            onValueChange = {
                search = it
            },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text("Search Category...")
            },
            leadingIcon = {
                Icon(
                    Icons.Default.Search,
                    contentDescription = null
                )
            },
            singleLine = true,
            shape = RoundedCornerShape(16.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            item {

                Card(
                    onClick = onBreakfastClick,
                    colors = CardDefaults.cardColors(
                        containerColor = AppCard
                    ),
                    modifier = Modifier.height(130.dp)
                ) {

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            "🍳\nBreakfast",
                            color = Cyan,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )

                    }

                }

            }

            item {

                Card(
                    onClick = onLunchClick,
                    colors = CardDefaults.cardColors(
                        containerColor = AppCard
                    ),
                    modifier = Modifier.height(130.dp)
                ) {

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            "🍛\nLunch",
                            color = Cyan,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )

                    }

                }

            }

            item {

                Card(
                    onClick = onDinnerClick,
                    colors = CardDefaults.cardColors(
                        containerColor = AppCard
                    ),
                    modifier = Modifier.height(130.dp)
                ) {

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            "🍽\nDinner",
                            color = Cyan,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )

                    }

                }

            }

            item {

                Card(
                    onClick = onSnackClick,
                    colors = CardDefaults.cardColors(
                        containerColor = AppCard
                    ),
                    modifier = Modifier.height(130.dp)
                ) {

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            "🍔\nSnack",
                            color = Cyan,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )

                    }

                }

            }

        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeGridScreen(
    title: String,
    recipes: List<Recipe>,
    onBack: () -> Unit,
    onRecipeClick: (Recipe) -> Unit
) {

    Scaffold(

        topBar = {

            TopAppBar(

                title = {
                    Text(
                        text = title,
                        fontWeight = FontWeight.Bold
                    )
                },

                navigationIcon = {

                    IconButton(
                        onClick = onBack
                    ) {

                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )

                    }

                }

            )

        }

    ) { padding ->

        LazyVerticalGrid(

            columns = GridCells.Fixed(2),

            modifier = Modifier
                .padding(padding)
                .padding(16.dp),

            verticalArrangement = Arrangement.spacedBy(16.dp),

            horizontalArrangement = Arrangement.spacedBy(16.dp)

        ) {

            items(recipes) { recipe ->

                Card(

                    onClick = {

                        onRecipeClick(recipe)

                    },

                    colors = CardDefaults.cardColors(
                        containerColor = AppCard
                    ),

                    modifier = Modifier.height(180.dp)

                ) {

                    Column(

                        modifier = Modifier.fillMaxSize(),

                        verticalArrangement = Arrangement.Center,

                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {

                        Image(
                            painter = painterResource(id = recipe.image),
                            contentDescription = recipe.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .clip(RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(
                            modifier = Modifier.height(12.dp)
                        )

                        Text(
                            text = recipe.name,
                            color = Cyan,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )

                    }

                }

            }

        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeDetailScreen(
    recipe: Recipe,
    onBack: () -> Unit
) {

    Scaffold(

        topBar = {

            TopAppBar(

                title = {
                    Text(recipe.name)
                },

                navigationIcon = {

                    IconButton(
                        onClick = onBack
                    ) {

                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )

                    }

                }

            )

        }

    ) { padding ->

        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)

        ) {

            Card(

                colors = CardDefaults.cardColors(
                    containerColor = AppCard
                ),

                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)

            ) {

                Image(
                    painter = painterResource(id = recipe.image),
                    contentDescription = recipe.name,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = recipe.name,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Cyan
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Ingredients",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = recipe.ingredients,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Instructions",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = recipe.instructions,
                fontSize = 16.sp
            )

        }

    }

}