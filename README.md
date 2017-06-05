# BatteryProgressView

Custom ProgressView.

![Output sample](https://github.com/jineshfrancs/BatteryProgressView/blob/master/screens/battery.gif)

Add BatterProgressView to your layout
```xml
 <example.com.batterytest.BatteryProgressView
        android:layout_width="250dp"
        android:id="@+id/progress"
        android:layout_height="250dp"
         />
```
Call setProgress() to set Progress on the view.

```java
progress= (BatteryProgressView) findViewById(R.id.progress);
progress.setProgress(66);
```
