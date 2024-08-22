import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ota_exam.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById( R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val json = assets.open("levels.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val levelType = object : TypeToken<LevelResponse>() {}.type
        val levelResponse: LevelResponse = gson.fromJson(json, levelType)

        val adapter = LevelAdapter(levelResponse.levels)
        recyclerView.adapter = adapter
    }
}
