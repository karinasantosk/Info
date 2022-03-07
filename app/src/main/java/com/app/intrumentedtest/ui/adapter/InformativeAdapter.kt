package com.app.intrumentedtest.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.intrumentedtest.R
import com.app.intrumentedtest.databinding.InformationItemBinding
import com.app.intrumentedtest.model.Information

class InformativeAdapter(
        private val listInformation: List<Information>,
        private val onClickAction: (Information) -> Unit
) : RecyclerView.Adapter<InformativeAdapter.InformativeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InformativeViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.information_item, parent, false)
        return InformativeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: InformativeViewHolder, position: Int) {
        holder.bind(listInformation[position])
    }

    override fun getItemCount() = listInformation.size

    inner class InformativeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = InformationItemBinding.bind(itemView)

        fun bind(item: Information) {
            binding.textViewDescriptionItem.text = item.subtitle
            binding.textViewTitleItem.text = item.title
            binding.container.setOnClickListener {
                onClickAction.invoke(item)
            }
        }
    }
}
