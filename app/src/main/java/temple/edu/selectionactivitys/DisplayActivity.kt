package temple.edu.selectionactivitys

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        supportActionBar?.title = "Display-Pets"

        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)

        val images = intent.getParcelableExtra<Picture>(MainActivity.ITEM_KEY)

        images?.resourceId?.let{imageView.setImageResource(it)}
        images?.description?.let{textView.text = it}
    }

}