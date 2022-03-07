package com.app.intrumentedtest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.intrumentedtest.databinding.FragmentDetailsInfoBinding
import com.app.intrumentedtest.model.Information
import kotlinx.android.synthetic.main.information_item.textViewTitleItem

class DetailsInfoFragment : Fragment() {
    private lateinit var binding: FragmentDetailsInfoBinding
    private val detail by lazy {
        arguments?.getParcelable<Information>(EXTRA_LIST_DETAIL)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            textViewDetailTitle.text = detail?.title
            textViewDetailSubTitle.text = detail?.subtitle
        }
    }

    companion object {
        const val EXTRA_LIST_DETAIL = "EXTRA_LIST_DETAIL"
    }
}