package com.example.foody.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foody.R
import kotlinx.android.synthetic.main.fragment_recipes.*
import kotlinx.android.synthetic.main.fragment_recipes.view.*

class RecipesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        ///*
        val view = inflater.inflate(R.layout.fragment_recipes, container, false)

        view.recylerview.showShimmer()

        return recylerview

        //shimmer return */

        // return inflater.inflate(R.layout.fragment_recipes, container, false) defaultReturn
    }

}