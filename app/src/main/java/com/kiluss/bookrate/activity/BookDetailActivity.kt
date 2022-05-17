package com.kiluss.bookrate.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kiluss.bookrate.utils.Const.Companion.EXTRA_MESSAGE
import com.kiluss.bookrate.databinding.ActivityBookDetailBinding

class BookDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBookDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        binding.tvBookTitle.text = message
        supportActionBar?.title = message
        binding.detailsBackButton.setOnClickListener {
            this.finish()
        }
    }
}