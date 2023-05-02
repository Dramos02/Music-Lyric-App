package com.example.lyricsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsapp.databinding.ActivityMain2Binding
import android.media.MediaPlayer
class MainActivity2 : AppCompatActivity() {
    //i imported the mediaPlayer for my program to be able to run the audio file
    private lateinit var binding:ActivityMain2Binding
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //val songTitle will get the name from the main activity to check if its the same for audio file name

        val songTitle = intent.getStringExtra("song_title")
        mediaPlayer = MediaPlayer.create(this, getSongResourceId(songTitle))
        binding.txtSongTitle.text = intent.getStringExtra("passedSongName")
        binding.txtViewLyrics.text = intent.getStringExtra("passedSongLyrics")

        binding.btnReturn.setOnClickListener {
            this.finish()
            //.start() is to start the audio file, .pause() is to pause the audio file then .stop()to stop audio file
        }
        binding.btnPlay.setOnClickListener(){
            mediaPlayer.start()
        }
        binding.btnPause.setOnClickListener(){
            mediaPlayer.pause()
        }
        binding.btnStop.setOnClickListener(){
            mediaPlayer.stop()
        }

    }
    //this method will stop/release the media player queue
    override fun onStop() {
        super.onStop()
        mediaPlayer.release()
    }
    //this method will return the specific audio file based on the song_title/audio file name in the raw directory
    fun getSongResourceId(songTitle: String?): Int {
        return when (songTitle) {
            "bawatpyesa" -> R.raw.bawatpyesa
            "tahanan" -> R.raw.tahanan
            "komh" -> R.raw.komh
            "grow" -> R.raw.grow
            "kiss" -> R.raw.kiss
            else -> throw IllegalArgumentException("Invalid song title: $songTitle")
        }
    }
}
