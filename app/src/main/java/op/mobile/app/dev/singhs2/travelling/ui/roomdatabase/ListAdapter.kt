package op.mobile.app.dev.singhs2.travelling.ui.roomdatabase

/**
 * Imports to migrate library and project dependencies.
 */
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_raw.view.*
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.roomDatabase.User

/**
 * Class ListAdapter - RecyclerView Adapter.
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
    // Variables
    private var userList = emptyList<User>()
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    /**
     * Function onCreateViewHolder - returns the view of the highest score.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.custom_raw, parent, false)
        )
    }

    /**
     * Function onBindViewHolder - positions the userList to get the current item.
     * Displays the score on the custom raw page(highest score).
     */
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.txt_quiz_score.text = currentItem.quizScore.toString()
    }

    /**
     * function getItemCount - Return the size of the list.
     */
    override fun getItemCount(): Int {
        return userList.size
    }

    /**
     *  Function setData - Set the text view text with the current item, set the user list with
     *  the value passed through parameter.
     */
    fun setData(user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}