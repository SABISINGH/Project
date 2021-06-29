package op.mobile.app.dev.singhs2.travelling.service

/**
 * Imports to migrate library and project dependencies.
 */
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.databinding.RecyclerViewItemBinding
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries
import op.mobile.app.dev.singhs2.travelling.ui.quiz.IOnClickListener

/**
 * Service adapter class loading functions areItemsTheSame,
 * areContentsTheSame, onCreateViewHolder, onBindViewHolder,
 * onClick and inner class ServiceViewHolder.
 */
class ServiceAdapter(private val listener: IOnClickListener) :
    ListAdapter<GitHubCountries, ServiceAdapter.ServiceViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<GitHubCountries>() {
        override fun areItemsTheSame(
            oldItem: GitHubCountries,
            newItem: GitHubCountries
        ): Boolean {
            return oldItem.id === newItem.id
        }

        override fun areContentsTheSame(
            oldItem: GitHubCountries,
            newItem: GitHubCountries
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ServiceViewHolder {
        return ServiceViewHolder(
            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(
        holder: ServiceViewHolder,
        position: Int
    ) {
        val githubJob = getItem(position)
        holder.bind(githubJob)
    }

    inner class ServiceViewHolder(private var binding: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        fun bind(githubCountries: GitHubCountries) {
            binding.githubCountries = githubCountries
            binding.executePendingBindings()
        }

        init {
            binding.root.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }
}