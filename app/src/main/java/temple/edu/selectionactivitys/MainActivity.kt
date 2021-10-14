package temple.edu.selectionactivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View


class MainActivity : AppCompatActivity(){//,ImageAdapter.PicData {

    companion object{
        val ITEM_KEY ="PicData"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        supportActionBar?.title = "Image selector"
        val images = DogList()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(this,3)

        val onClickListener = View.OnClickListener{
            val imagePosition = recyclerView.getChildAdapterPosition(it)
            val launchIntent = Intent(this,DisplayActivity::class.java)
                .putExtra(ITEM_KEY,images[imagePosition])

            startActivity(launchIntent)
        }
        recyclerView.adapter = ImageAdapter(images, onClickListener)
    }
    fun DogList():Array<Picture>{
        return arrayOf(Picture(R.drawable.dog1,"Mama Dog"),Picture(R.drawable.dog2,"Puppy"),Picture(R.drawable.dog3,"Golden Dog"),Picture(R.drawable.dog4,"Tredo"), Picture(R.drawable.dog5,"Jack")
            ,Picture(R.drawable.dog6, "FriendShip"), Picture(R.drawable.dog7, "Bobi"),Picture(R.drawable.dog8, "Jackey"),Picture(R.drawable.dog9, "Box"),Picture(R.drawable.dog10, "Relax"))

    }

}