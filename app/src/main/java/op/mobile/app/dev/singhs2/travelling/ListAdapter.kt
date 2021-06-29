package op.mobile.app.dev.singhs2.travelling

/**
 * Imports to migrate library and project dependencies.
 */
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_raw.view.*
import op.mobile.app.dev.singhs2.travelling.database.User

/**
 * Class ListAdapter -
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
    // Variables
    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    /**
     * Function onCreateViewHolder -
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.custom_raw, parent, false)
        )
    }

    /**
     * Function onBindViewHolder -
     */
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.txt_quiz_score.text = currentItem.quizScore.toString()
    }

    /**
     * function getItemCount -
     */
    override fun getItemCount(): Int {
        return userList.size
    }

    /**
     *  Function setData -
     */
    fun setData(user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}