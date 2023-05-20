package com.example.lyricsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.lyricsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //this button designated for the song BawatPiyesa
        //it includes var songName to set the title of the song and var Lyrics to set the lyrics of the song
        //var title and song_title initialized the song title for the raw directory/the mp3 file
        binding.btnBawatPiyesa.setOnClickListener() {
            var songName = binding.txtSongTitle1.text.toString()
            var lyrics = "\n[Verse 1]\n" +
                    "Bawat ngiti\n" +
                    "Bawat luha\n" +
                    "Bawat gising\n" +
                    "Bawat pikit\n" +
                    "Bawat hangin na tinatanggap\n" +
                    "Bawat buga\n" +
                    "\n" +
                    "[Pre-Chorus]\n" +
                    "At habang ika'y yinayakap nang maigi\n" +
                    "Binubulong ang dalanging ’wag sana maglaho sa hangin\n" +
                    "[Chorus]\n" +
                    "Ang bawat piyesa na bumubuo sa'yo\n" +
                    "Bawat piyesang nawa'y mapasaakin\n" +
                    "Habambuhay\n" +
                    "\n" +
                    "[Post-Chorus]\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Habambuhay[Verse 2]\n" +
                    "O ang init ng iyong balat\n" +
                    "At bawat sinulid ng iyong buhok\n" +
                    "Dumadaan ang ilaw sa mga bulsa’t dumarating sa akin\n" +
                    "\n" +
                    "[Pre-Chorus]\n" +
                    "At habang ika'y niyayakap nang maigi\n" +
                    "Binubulong ang dalangin 'wag sana maglaho sa hangin\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "Ang bawat piyesa na bumubuo sa'yo\n" +
                    "Bawat piyesang nawa'y mapasaakin\n" +
                    "Habambuhay[Post-Chorus]\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Habambuhay[Bridge]\n" +
                    "'Wag kang bibitaw\n" +
                    "'Wag kang mawawala\n" +
                    "O aking dinadala ang bawat piyesa ng ikaw\n" +
                    "Ano'ng gagawin kung wala ka?\n" +
                    "Ano’ng gagawin kung wala ka?\n" +
                    "Ano’ng gagawin kung wala ka?\n" +
                    "Kung wala ka?\n" +
                    "\n" +
                    "[Outro]\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Dito ka na lang habambuhay\n" +
                    "Habambuhay\n" +
                    "Habambuhay\n" +
                    "Habambuhay\n" +
                    "Habambuhay\n"
            val intent = Intent(this, MainActivity2::class.java)
            var title = "bawatpyesa"
            intent.putExtra("song_title",title)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongLyrics", lyrics)
            startActivity(intent)
        }

        binding.btnTahanan.setOnClickListener() {
            var songName = binding.txtSongTitle2.text.toString()
            var lyrics = "\n[Chorus]\n" +
                    "Hanggang dito na lamang\n" +
                    "Ang iyong mga luha\n" +
                    "Tama na, tahan na\n" +
                    "\n" +
                    "[Post-Chorus]\n" +
                    "Hihilumin ang 'yong mga sugat\n" +
                    "Pighati'y wakas na\n" +
                    "\n" +
                    "[Verse]\n" +
                    "Mga himig na inilaan sa'yo\n" +
                    "Kunin at ibaon sa puso mo\n" +
                    "Bagong araw ay paparating\n" +
                    "Hintayin ang pagkakataon\n" +
                    "\n"+
                    "[Refrain]\n" +
                    "Nandito lang ako, umaakay sa'yo\n" +
                    "Nandito lang ako, naghihintay sa'yo\n" +
                    "Nandito lang ako, umaakay sa'yo\n" +
                    "Nandito lang ako, naghihintay sa'yo\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "Hanggang dito na lamang\n" +
                    "Ang iyong mga luha\n" +
                    "Tama na, tahan na\n"
            val intent = Intent(this, MainActivity2::class.java)
            var title = "tahanan"
            intent.putExtra("song_title",title)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongLyrics", lyrics)
            startActivity(intent)
        }

        binding.btnKoMH.setOnClickListener() {
            var songName = binding.txtSongTitle3.text.toString()
            var lyrics = "\n[Verse 1]\n" +
                    "I'm perfectly fine, I live on my own\n" +
                    "I made up my mind, I'm better off bein' alone\n" +
                    "We met a few weeks ago\n" +
                    "Now you try on callin' me \"baby\" like tryin' on clothes\n" +
                    "\n" +
                    "[Pre-Chorus]\n" +
                    "Salute to me, I'm your American queen\n" +
                    "And you move to me like I'm a Motown beat\n" +
                    "And we rule the kingdom inside my room\n" +
                    "'Cause all the boys and their expensive cars\n" +
                    "With their Range Rovers and their Jaguars\n" +
                    "Never took me quite where you do\n" +
                    "[Chorus]\n" +
                    "And all at once, you are the one I have been waiting for\n" +
                    "King of my heart, body and soul, ooh-woah\n" +
                    "And all at once, you're all I want, I'll never let you go\n" +
                    "King of my heart, body and soul, ooh-woah\n" +
                    "\n" +
                    "[Post-Chorus]\n" +
                    "And all at once, I've been waiting, waiting\n" +
                    "Ooh-woah, ooh-woah\n" +
                    "And all at once, you are the one, I have been waiting, waiting\n" +
                    "Body and soul, ooh-woah\n" +
                    "And all at once\n" +
                    "\n" +
                    "[Verse 2]\n" +
                    "Late in the night, the city's asleep\n" +
                    "Your love is a secret I'm hoping, dreaming, dying to keep\n" +
                    "Change my priorities\n" +
                    "The taste of your lips is my idea of luxury\n" +
                    "\n" +
                    "[Pre-Chorus]\n" +
                    "Salute to me, I'm your American queen\n" +
                    "And you move to me like I'm a Motown beat\n" +
                    "And we rule the kingdom inside my room (Inside my room, oh)\n" +
                    "'Cause all the boys and their expensive cars\n" +
                    "With their Range Rovers and their Jaguars\n" +
                    "Never took me quite where you do (Where you do)\n + [Chorus]\n" +
                    "And all at once, you are the one I have been waiting for\n" +
                    "King of my heart, body and soul, ooh-woah\n" +
                    "And all at once, you're all I want, I'll never let you go\n" +
                    "King of my heart (My heart), body and soul, ooh-woah\n" +
                    "\n" +
                    "[Post-Chorus]\n" +
                    "And all at once (Hey), I've been waiting, waiting (Waiting)\n" +
                    "Ooh-woah, ooh-woah\n" +
                    "And all at once, you are the one I have been waiting (Waiting), waiting (Waiting)\n" +
                    "Body and soul, ooh-woah\n" +
                    "And all at once\n" +
                    "\n" +
                    "[Bridge]\n" +
                    "Is this the end of all the endings?\n" +
                    "My broken bones are mending\n" +
                    "With all these nights we're spending\n" +
                    "Up on the roof with a school girl crush\n" +
                    "Drinking beer out of plastic cups\n" +
                    "Say you fancy me, not fancy stuff\n" +
                    "Baby, all at once, this is enough\n" +
                    "\n" +
                    "[Breakdown]\n" +
                    "And all at once, you are the one I have been waiting for\n" +
                    "King of my heart, body and soul, ooh-woah\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "And all at once, you are the one I have been waiting for\n" +
                    "King of my heart, body and soul, ooh-woah\n" +
                    "And all at once, you're all I want, I'll never let you go\n" +
                    "King of my heart (My heart), body and soul (My soul), ooh-woah\n" +
                    "\n" +
                    "[Post-Chorus]\n" +
                    "And all at once, I've been waiting, waiting\n" +
                    "Ooh-woah, ooh-woah (Ooh-woah)\n" +
                    "And all at once, you are the one I have been waiting, waiting\n" +
                    "Body and soul, ooh-woah\n" +
                    "And all at once\n"
            val intent = Intent(this, MainActivity2::class.java)
            var title = "komh"
            intent.putExtra("song_title",title)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongLyrics", lyrics)
            startActivity(intent)
        }

        binding.btnGrowOld.setOnClickListener() {
            var songName = binding.txtSongTitle4.text.toString()
            var lyrics = "\nI wanna make you smile whenever you're sad\n" +
                    "Carry you around when your arthritis is bad\n" +
                    "All I wanna do is grow old with you\n" +
                    "\n" +
                    "I'll get your medicine when your tummy aches\n" +
                    "Build you a fire if the furnace breaks\n" +
                    "Oh, it could be so nice, growing old with you\n" +
                    "\n" +
                    "I'll miss you\n" +
                    "Kiss you\n" +
                    "Give you my coat when you are cold\n" +
                    "\n" +
                    "Need you\n" +
                    "Feed you\n" +
                    "Even let you hold the remote control\n" +
                    "\n" +
                    "So let me do the dishes in our kitchen sink\n" +
                    "Put you to bed when you've had too much to drink\n" +
                    "Oh, I could be the man who grows old with you\n" +
                    "I wanna grow old with you"
            val intent = Intent(this, MainActivity2::class.java)
            var title = "grow"
            intent.putExtra("song_title",title)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongLyrics", lyrics)
            startActivity(intent)

        }

        binding.btnKissOfDeath.setOnClickListener() {
            var songName = binding.txtSongTitle5.text.toString()
            var lyrics = "\nSoba ni kite kuzureyuku yokusei\n" +
                    "Boku wo kowagaranai de\n" +
                    "\n" +
                    "Tobenai tori ga yumemita sora\n" +
                    "Majiwatteku iro sore wa chigau Red\n" +
                    "\n" +
                    "Doa wo tataku oto ni boku wa mimi wo fusaida\n" +
                    "Tataiteru no wa kimi soretomo hoka no?\n" +
                    "\n" +
                    "Will your lips taste the kiss of death?\n" +
                    "\n" +
                    "Daarin unmei ga kekkan wo hashiru yo\n" +
                    "Ugokihajimeta sekai ...ai?\n" +
                    "Dare yori mo tokeaitai yo daarin\n" +
                    "Boku wo kowagaranaide Kiss me now\n" +
                    "\n" +
                    "[thanks for visiting animesonglyrics.com]\n" +
                    "\n" +
                    "Kimi wo ajiwaitai ...sonna boku wa hen?\n" +
                    "Hitori ja sore wa kanjirarenai\n" +
                    "\n" +
                    "Dakishimeau no wa kizu wo fusagu kara\n" +
                    "Boku no kuchibiru de sono iki wo fusagu\n" +
                    "Will your lips taste the kiss of death?\n" +
                    "\n" +
                    "Daarin kodou ga yubi no saki made\n" +
                    "Tokedasu kimochi wa nani? ...nee?\n" +
                    "Soba ni kite kuzureyuku yokusei\n" +
                    "Boku wo kowagaranaide Kiss me now, my Love\n" +
                    "\n" +
                    "Shi wa yuku toki to nita\n" +
                    "Kankaku to kimi no aji ga shita\n" +
                    "Did your lips taste the kiss of death?\n" +
                    "\n" +
                    "Daarin unmei ga kekkan wo hashiru yo\n" +
                    "Ugokihajimeta sekai ...ai?\n" +
                    "Dare yori mo tokeaitai yo daarin\n" +
                    "Boku wo kowagaranaide\n" +
                    "Kimi wo ajiawasete Kiss me now\n" +
                    "\n"
            val intent = Intent(this, MainActivity2::class.java)
            var title = "kiss"
            intent.putExtra("song_title",title)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongLyrics", lyrics)
            startActivity(intent)
        }
    }
}

//CODED BY DOMINIC O. RAMOS 2BSIT-2
//Copyrights © https://github.com/Dramos02

