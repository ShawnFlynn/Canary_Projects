package com.smf.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// Here ":" symbol is indicate that LoginFragment 
// is child class of Fragment Class 
class Fragment1 : Fragment() {
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(
			R.layout.layout_fragment1, container, false
		)
	}
	// Here "layout_fragment1" is a name of layout file
	// created for LoginFragment 
}
