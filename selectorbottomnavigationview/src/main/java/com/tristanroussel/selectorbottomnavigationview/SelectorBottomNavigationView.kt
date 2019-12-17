package com.tristanroussel.selectorbottomnavigationview

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Created by Tristan Roussel on 2019-12-17.
 */
class SelectorBottomNavigationView(
    context: Context,
    attributeSet: AttributeSet
) : BottomNavigationView(context, attributeSet) {

    init {
        retrieveConfiguration(attributeSet)
    }

    //region Private
    private fun retrieveConfiguration(attributeSet: AttributeSet) {

    }
    //endregion Private
}