package com.omercankoc.rgbcreator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Definition
    var textViewRed : TextView? = null
    var textViewGreen : TextView? = null
    var textViewBlue : TextView? = null

    var seekBarRed : SeekBar? = null
    var seekBarGreen : SeekBar? = null
    var seekBarBlue : SeekBar? = null

    var viewBackGround : View? = null

    var redValue = 0
    var greenValue = 0
    var blueValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize
        textViewRed = findViewById<View>(R.id.textViewRed) as TextView
        textViewGreen = findViewById<View>(R.id.textViewGreen) as TextView
        textViewBlue = findViewById<View>(R.id.textViewBlue) as TextView

        seekBarRed = findViewById<View>(R.id.seekBarRed) as SeekBar
        seekBarGreen = findViewById<View>(R.id.seekBarGreen) as SeekBar
        seekBarBlue = findViewById<View>(R.id.seekBarBlue) as SeekBar

        viewBackGround = findViewById<View>(R.id.viewBackground) as View

        redValue = seekBarRed!!.progress
        greenValue = seekBarGreen!!.progress
        blueValue = seekBarBlue!!.progress

        // SeekBar'ın alabilecegi max degeri ata.
        seekBarRed!!.max = 255
        seekBarGreen!!.max = 255
        seekBarBlue!!.max = 255

        // Backgorund baslangıc rengini set et.
        viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
        seekBarRed!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                // Background'u yeni degere gore set et.
                redValue = progress
                viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
            }
        })
        seekBarGreen!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                // Background'u yeni degere gore set et.
                greenValue = progress
                viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
            }
        })
        seekBarBlue!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                // Background'u yeni degere gore set et.
                blueValue = progress
                viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
            }
        })

    }
}
