## RGBCreator
It creates intermediate colors with red, green, blue color combinations.

[![Watch the video](https://github.com/omercankoc/RGBCreator/blob/master/ui.mp4)](https://github.com/omercankoc/RGBCreator/blob/master/ui.mp4)

<iframe src="https://github.com/omercankoc/RGBCreator/blob/master/ui.mp4" frameborder="0" allowfullscreen></iframe>


UI Elements:
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/background_dark"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textViewRed"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:layout_marginTop="46dp"
        android:layout_marginBottom="645dp"
        android:text="Red"
        android:textAlignment="center"
        android:textColor="@android:color/background_light"
        android:textSize="24dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <SeekBar
        android:id="@+id/seekBarRed"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginTop="93dp"
        android:layout_marginBottom="588dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textViewGreen"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:layout_marginTop="151dp"
        android:layout_marginBottom="540dp"
        android:text="Green"
        android:textAlignment="center"
        android:textColor="@android:color/background_light"
        android:textSize="24dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <SeekBar
        android:id="@+id/seekBarGreen"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginTop="199dp"
        android:layout_marginBottom="482dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textViewBlue"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:layout_marginTop="257dp"
        android:layout_marginBottom="434dp"
        android:text="Blue"
        android:textAlignment="center"
        android:textColor="@android:color/background_light"
        android:textSize="24dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <SeekBar
        android:id="@+id/seekBarBlue"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginTop="304dp"
        android:layout_marginBottom="377dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <View
        android:id="@+id/viewBackground"
        android:layout_width="match_parent"
        android:layout_height="320dp"
        android:layout_marginTop="362dp"
        android:layout_marginBottom="49dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

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
