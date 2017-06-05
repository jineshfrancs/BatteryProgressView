package example.com.batterytest;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    BatteryProgressView progress;
    int count=0;
    android.os.Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress= (BatteryProgressView) findViewById(R.id.progress);
        progress.setProgress(66);
        handler=new android.os.Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progress.setProgress(63);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progress.setProgress(77);
                    }
                },1000);
            }
        },2000);

    }
}
