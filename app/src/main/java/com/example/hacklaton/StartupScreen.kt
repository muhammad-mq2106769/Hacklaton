package com.example.hacklaton


import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hacklaton.entity.News
import com.example.hacklaton.ui.theme.HacklatonTheme

import org.w3c.dom.Text

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartupScreen() {
    val news1 = News("Qatar bought PSG???","In a groundbreaking announcement that has sent shockwaves through the world of sports, Qatar has made an unprecedented move by acquiring Paris Saint-Germain Football Club (PSG). The acquisition, which comes as part of Qatar's strategic vision for global sports investment, marks a significant milestone in the nation's commitment to expanding its presence in the international sports arena.\n" +
            "\n" +
            "The deal, reportedly valued at an astonishing €1 billion, solidifies Qatar's position as a major player in the world of football and underscores the nation's dedication to fostering excellence and success in sports on a global scale. PSG, one of the most iconic football clubs in Europe, has long been admired for its rich history and storied legacy, making it a prized asset for any prospective owner.\n" +
            "\n" +
            "Qatar's acquisition of PSG represents a strategic alignment of interests, with both parties sharing a common vision for the future of football. The move is expected to bring about a new era of innovation, investment, and growth for the club, as Qatar brings its unparalleled resources and expertise to bear in support of PSG's ambitious goals and aspirations.\n" +
            "\n" +
            "Commenting on the acquisition, His Excellency Sheikh Khalid bin Khalifa Al Thani, Chairman of Qatar Sports Investments (QSI), expressed his excitement about the prospect of PSG's future under Qatari ownership. \"This is a historic moment for Qatar and for PSG,\" said Sheikh Khalid. \"We are thrilled to be embarking on this new chapter in the club's history, and we are committed to supporting PSG in achieving new heights of success both on and off the pitch.\"\n" +
            "\n" +
            "The acquisition of PSG represents a significant milestone in Qatar's broader strategy to position itself as a leading destination for sports investment and development. With its successful bid to host the 2022 FIFA World Cup already underway, Qatar has emerged as a global hub for sports innovation and excellence, attracting attention and admiration from around the world.\n" +
            "\n" +
            "In addition to its investment in PSG, Qatar has also made substantial contributions to the development of football and other sports at the grassroots level, both domestically and internationally. Through initiatives such as the Aspire Academy and the Qatar Foundation, the nation has demonstrated its unwavering commitment to nurturing talent and promoting athletic excellence among youth and aspiring athletes.\n" +
            "\n" +
            "As Qatar takes the helm at PSG, fans and supporters around the world are eagerly anticipating the exciting developments and opportunities that lie ahead for the club. With Qatar's unparalleled resources, expertise, and vision driving PSG forward, the future looks brighter than ever for one of football's most illustrious institutions.")
    val news2 = News("Covid was intentional","")
    val news3 = News("ADS","")
    val news4 = News("CMUQ introducing medicine????","")

    val newss = listOf(news1,news2,news3,news4)
    HacklatonTheme {
        Scaffold(
            topBar = {
                TopAppBar(

                    title = {
                        Text(
                            text = "Argon",
                            fontSize = TextUnit(12F, TextUnitType.Em),
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(vertical = 16.dp, horizontal = 70.dp)
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = { /* Handle menu button click */ }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menu"
                            )
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        )
        {}
                Column(
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    Spacer(modifier = Modifier.height(100.dp))
                    TextField(
                        value = "",
                        onValueChange = { /* TODO: Handle value change */ },
                        placeholder = { Text(text = "Enter your link here") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }

               Column {
                   Spacer(modifier = Modifier.height(150.dp))

                   Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.hsl(
                            150F, 0.73F, 0.38F
                        )
                    ), modifier = Modifier.padding(25.dp)) {

                        Text(
                        "Search",
                        fontSize = TextUnit(6F, TextUnitType.Em),
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth() ,
                        textAlign = TextAlign.Center
                    )
                }
               }
        Column {
            Spacer(modifier = Modifier.height(300.dp))
            LazyVerticalGrid(columns = GridCells.Fixed(1) , modifier = Modifier ) {
                items(newss) {
                  newsCard(it){

                  }
                }
            }

        }

    }
}

@Composable
fun newsCard(news : News,onArticleClick: () -> Unit){
    Card(modifier = Modifier.padding(15.dp)) {
        Text(text = news.heading , modifier = Modifier
            .padding(50.dp)
            .width(250.dp)
            .clickable { onArticleClick() },
            fontSize = 30.sp,
            textAlign = TextAlign.Center)
    }
}




@Preview
@Composable
//fun previewCard(){
//    HacklatonTheme {
//        newsCard(name = "Covid is an issue")
//    }
//}
fun previewFirstscreen(){
    val news1 = News("Qatar bought PSG???","In a groundbreaking announcement that has sent shockwaves through the world of sports, Qatar has made an unprecedented move by acquiring Paris Saint-Germain Football Club (PSG). The acquisition, which comes as part of Qatar's strategic vision for global sports investment, marks a significant milestone in the nation's commitment to expanding its presence in the international sports arena.\n" +
            "\n" +
            "The deal, reportedly valued at an astonishing €1 billion, solidifies Qatar's position as a major player in the world of football and underscores the nation's dedication to fostering excellence and success in sports on a global scale. PSG, one of the most iconic football clubs in Europe, has long been admired for its rich history and storied legacy, making it a prized asset for any prospective owner.\n" +
            "\n" +
            "Qatar's acquisition of PSG represents a strategic alignment of interests, with both parties sharing a common vision for the future of football. The move is expected to bring about a new era of innovation, investment, and growth for the club, as Qatar brings its unparalleled resources and expertise to bear in support of PSG's ambitious goals and aspirations.\n" +
            "\n" +
            "Commenting on the acquisition, His Excellency Sheikh Khalid bin Khalifa Al Thani, Chairman of Qatar Sports Investments (QSI), expressed his excitement about the prospect of PSG's future under Qatari ownership. \"This is a historic moment for Qatar and for PSG,\" said Sheikh Khalid. \"We are thrilled to be embarking on this new chapter in the club's history, and we are committed to supporting PSG in achieving new heights of success both on and off the pitch.\"\n" +
            "\n" +
            "The acquisition of PSG represents a significant milestone in Qatar's broader strategy to position itself as a leading destination for sports investment and development. With its successful bid to host the 2022 FIFA World Cup already underway, Qatar has emerged as a global hub for sports innovation and excellence, attracting attention and admiration from around the world.\n" +
            "\n" +
            "In addition to its investment in PSG, Qatar has also made substantial contributions to the development of football and other sports at the grassroots level, both domestically and internationally. Through initiatives such as the Aspire Academy and the Qatar Foundation, the nation has demonstrated its unwavering commitment to nurturing talent and promoting athletic excellence among youth and aspiring athletes.\n" +
            "\n" +
            "As Qatar takes the helm at PSG, fans and supporters around the world are eagerly anticipating the exciting developments and opportunities that lie ahead for the club. With Qatar's unparalleled resources, expertise, and vision driving PSG forward, the future looks brighter than ever for one of football's most illustrious institutions.")
    val news2 = News("Covid was intentional","")
    val news3 = News("ADS","")
    val news4 = News("CMUQ introducing medicine????","")

    val newss = listOf(news1,news2,news3,news4)

    HacklatonTheme {
        StartupScreen()
    }
}
