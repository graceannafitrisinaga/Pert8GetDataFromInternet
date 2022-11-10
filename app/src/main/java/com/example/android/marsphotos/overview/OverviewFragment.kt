package com.example.android.marsphotos.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android.marsphotos.databinding.FragmentOverviewBinding

/**
 * Fragmen ini menunjukkan status transaksi layanan web foto Mars.
 */
class OverviewFragment : Fragment() {

    private val viewModel: OverviewViewModel by viewModels()

    /**
     * Mengembangkan tata letak dengan Data Binding,
     * menyetel pemilik lifecycle ke OverviewFragment untuk mengaktifkan Data Binding
     * untuk mengamati LiveData, dan menyiapkan RecyclerView dengan adapter.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentOverviewBinding.inflate(inflater)

        // Memungkinkan Pengikatan Data untuk Mengamati LiveData dengan siklus hidup Fragmen ini
        binding.lifecycleOwner = this

        // Memberikan akses mengikat ke OverviewViewModel
        binding.viewModel = viewModel

        // Menyetel adaptor photosGrid RecyclerView
        binding.photosGrid.adapter = PhotoGridAdapter()

        return binding.root
    }
}
