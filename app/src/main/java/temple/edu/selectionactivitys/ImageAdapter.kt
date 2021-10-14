package temple.edu.selectionactivitys

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_images:Array<Picture>,_ocListener: View.OnClickListener)

   : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private val images = _images
    val listener = _ocListener

    class ViewHolder(_itemView: ImageView, ocl: View.OnClickListener) : RecyclerView.ViewHolder(_itemView) {
        val imageView = _itemView.apply { setOnClickListener(ocl) }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ImageView(parent.context).apply { layoutParams = ViewGroup.LayoutParams(200, 200) }, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position].resourceId)
   }

    override fun getItemCount(): Int {
        return images.size
    }

}

