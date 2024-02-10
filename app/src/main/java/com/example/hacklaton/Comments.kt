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
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
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
import com.example.hacklaton.entity.Comments
import com.example.hacklaton.entity.News
import com.example.hacklaton.ui.theme.HacklatonTheme
import org.w3c.dom.Text

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommentScreen() {
    val comment1 = Comments("Muhammad                (EXPERT)","Qatar's acquisition of PSG reflects the growing trend of wealthy entities investing in prestigious sports clubs, highlighting the increasing convergence of sports and global economics")
    val comment2 = Comments("George                  (EXPERT) ","Qatar's acquisition of PSG marks a strategic move, amplifying Qatar's influence in the global sports arena while securing PSG's financial stability.")
    val comment3 = Comments("Andrew","While Qatar's acquisition of PSG may have brought significant financial resources to the club, some critics argue that it has also raised concerns about the potential influence of external interests in the management and direction of the team. ")
    val comments = listOf(comment1,comment2,comment3)
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
        Column {
            Spacer(modifier = Modifier.height(100.dp))
       LazyVerticalGrid(columns = GridCells.Fixed(1), modifier = Modifier ){
                items(comments) {
                    commentCard(it)
                }
            }

        }

    }
}

@Composable
fun commentCard(comment : Comments){
    Card(modifier = Modifier.padding(15.dp)) {
        Text(text = comment.commenter, fontSize = 30.sp)
        Text(text = comment.comment , modifier = Modifier
            .padding(50.dp)
            .width(250.dp)
            .clickable { },
            fontSize = 20.sp,
            textAlign = TextAlign.Center)
    }
}

@Preview
@Composable
fun previewCommentscreen(){
    HacklatonTheme {
        CommentScreen()
    }
}
