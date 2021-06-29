package op.mobile.app.dev.singhs2.travelling.service

/**
 * Imports to migrate library and project dependencies.
 */
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries

/**
 * BindingAdapter is applied to methods that are used to manipulate how
 * values with expressions are set to views. Below binding listData.
 */
@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<GitHubCountries>?) {
    val adapter = recyclerView.adapter as ServiceAdapter
    adapter.submitList(data)
}

/**
 * BindingAdapter is binding apiServiceStatus.
 */
@BindingAdapter("apiServiceStatus")
fun bindAPIServiceStatus(tvStatus: TextView, status: ServiceStatus?) {
    when (status) {
        ServiceStatus.LOADING -> {
            tvStatus.visibility = View.VISIBLE
            tvStatus.text = tvStatus.context.getString(R.string.loading_data)
        }
        ServiceStatus.ERROR -> {
            tvStatus.visibility = View.VISIBLE
            tvStatus.text = tvStatus.context.getString(R.string.error_connection)
        }
        ServiceStatus.COMPLETE -> tvStatus.visibility = View.GONE
    }
}

/**
 * BindingAdapter is binding flagImage with the use of Glide.
 */
@BindingAdapter("flagImage")
fun bindFlagImage(imageView: ImageView, imageUrl: String) {
    Glide.with(imageView.context)
        .load(imageUrl).apply(RequestOptions().circleCrop())
        .into(imageView)
}

/**
 * BindingAdapter is binding img with the use of Glide.
 */
@BindingAdapter("img")
fun bindimg(imageView: ImageView, imageUrl: String) {
    Glide.with(imageView.context)
        .load(imageUrl)
        .into(imageView)
}