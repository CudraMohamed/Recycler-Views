package cudra.mohamed.recyclerviews

import android.hardware.biometrics.BiometricManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesRecyclerViewsAdapter (var nameList:List<String>):
    RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context) //create a layout inflater for the views//converts the name_list_item to View//get the reference from the layout inflater
            .inflate(R.layout.name_list_item,parent,false)  //creates a view to the xml
        return NamesViewHolder(itemView)    //pass it to an instance of Namesviewholder
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) { //create a viewholder out of namesviewholder
        holder.tvName.text = nameList.get(position) //accessing a specific item//checks and display the name
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}

class NamesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){ //holds the views //access individual views
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
}