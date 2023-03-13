package com.and.and

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.and.and.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityPlayerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        startService(PlayerService.newIntent(this@PlayerActivity))

        binding.apply {
            play.setOnClickListener {
                PlayerService.mediaPlayer.start()
            }
            pause.setOnClickListener {
                if (PlayerService.mediaPlayer.isPlaying) {
                    PlayerService.mediaPlayer.pause()
                } else {
                    PlayerService.mediaPlayer.start()
                }
            }
            stop.setOnClickListener {
                PlayerService.mediaPlayer.stop()
                PlayerService.mediaPlayer.prepare()
            }
        }
    }


}