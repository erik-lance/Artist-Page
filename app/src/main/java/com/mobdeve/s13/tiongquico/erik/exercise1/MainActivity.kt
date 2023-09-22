package com.mobdeve.s13.tiongquico.erik.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var favorite: FloatingActionButton
    private var isFavorite: Boolean = false

    private lateinit var purchase: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the buttons
        this.favorite = findViewById(R.id.star_fab)
        this.purchase = findViewById(R.id.purchase_btn)

        // Set the onClickListener for the buttons
        this.favorite.setOnClickListener {
            this.isFavorite = !this.isFavorite

            // Update the button's icon color from colors.xml
            if (this.isFavorite) {
                this.favorite.imageTintList = ContextCompat.getColorStateList(this, R.color.star_pressed)
            } else {
                this.favorite.imageTintList = ContextCompat.getColorStateList(this, R.color.star_default)
            }

        }

        this.purchase.setOnClickListener {
            // Once pressed, the button will be disabled
            if (this.purchase.isEnabled)  {
                this.purchase.isEnabled = false
                this.purchase.setText(R.string.purchase_text_clicked)
            }
        }

    }
}