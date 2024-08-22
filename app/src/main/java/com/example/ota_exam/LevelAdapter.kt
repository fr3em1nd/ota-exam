import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ota_exam.databinding.ItemLevelBinding

class LevelAdapter(private val levels: List<Level>) :
    RecyclerView.Adapter<LevelAdapter.LevelViewHolder>() {

    inner class LevelViewHolder(private val binding: ItemLevelBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(level: Level) {
            binding.levelTitle.text = level.title
            binding.levelDescription.text = level.description
            binding.levelState.text = level.state
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelViewHolder {
        val binding = ItemLevelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LevelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LevelViewHolder, position: Int) {
        holder.bind(levels[position])
    }

    override fun getItemCount() = levels.size
}
