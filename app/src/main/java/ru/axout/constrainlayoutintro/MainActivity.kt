package ru.axout.constrainlayoutintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.isGone
import androidx.core.view.isVisible
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.axout.constrainlayoutintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.watch.setOnClickListener {
            with(binding.poster) {
                visibility = if (isVisible) View.GONE else View.VISIBLE
            }
        }
    }
}