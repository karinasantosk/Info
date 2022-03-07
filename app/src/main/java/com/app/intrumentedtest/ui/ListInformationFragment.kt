package com.app.intrumentedtest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.intrumentedtest.R
import com.app.intrumentedtest.databinding.FragmentListInformationBinding
import com.app.intrumentedtest.model.Information
import com.app.intrumentedtest.ui.DetailsInfoFragment.Companion.EXTRA_LIST_DETAIL
import com.app.intrumentedtest.ui.adapter.InformativeAdapter
import kotlinx.android.synthetic.main.fragment_list_information.recyclerViewSection

class ListInformationFragment : Fragment() {

    private lateinit var binding: FragmentListInformationBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentListInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configList()
    }

    private fun configList() {
        val listInfo = listOf(
            Information(
                title = "Saúde da mulher",
                subtitle = "Atua para promover atenção integral a saúde da mulheres"
            ),
            Information(
                title = "Saúde da mulher",
                subtitle = "Atua para promover atenção integral a saúde da mulheres"
            ),
            Information(
                title = "Saúde da mulher",
                subtitle = "Atua para promover atenção integral a saúde da mulheres"
            ),
            Information(
                title = "Saúde da mulher",
                subtitle = "Atua para promover atenção integral a saúde da mulheres"
            ),
            Information(
                title = "Saúde da mulher",
                subtitle = "Atua para promover atenção integral a saúde da mulheres"
            ),
        )
        recyclerViewSection.adapter = InformativeAdapter(listInfo) {
            findNavController().navigate(R.id.toDetails, bundleOf(EXTRA_LIST_DETAIL to it))
        }
    }
}
