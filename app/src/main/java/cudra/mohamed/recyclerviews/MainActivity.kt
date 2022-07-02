package cudra.mohamed.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import cudra.mohamed.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames()
    }
    fun displayNames(){
        var namelist= listOf("Cudra","Leo","Genius","Coder")    //create a list
        var namesAdapter = NamesRecyclerViewsAdapter(namelist)  //create an instance of the adapter
        binding.rvNames.layoutManager = LinearLayoutManager(this)   //
        binding.rvNames.adapter =namesAdapter
    }
}