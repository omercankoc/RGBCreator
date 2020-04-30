## RGBCreator
It creates intermediate colors with red, green, blue color combinations.

Assign initial value:
```kotlin
    var redValue = 0
    var greenValue = 0
    var blueValue = 0
```
Max value that Seek Bar can take:
```kotlin
    seekBarRed!!.max = 255
    seekBarGreen!!.max = 255
    seekBarBlue!!.max = 255
```

Assign the start color and display the required combinations on the screen:
```kotlin
viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
    seekBarRed!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onStopTrackingTouch(seekBar: SeekBar) {}
        override fun onStartTrackingTouch(seekBar: SeekBar) {}
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            redValue = progress
            viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
        }
    })
    seekBarGreen!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onStopTrackingTouch(seekBar: SeekBar) {}
        override fun onStartTrackingTouch(seekBar: SeekBar) {}
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            greenValue = progress
            viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
        }
    })
    seekBarBlue!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onStopTrackingTouch(seekBar: SeekBar) {}
        override fun onStartTrackingTouch(seekBar: SeekBar) {}
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            blueValue = progress
            viewBackGround!!.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue))
        }
    })
```
