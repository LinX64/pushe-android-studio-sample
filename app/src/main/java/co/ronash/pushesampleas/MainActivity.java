package co.ronash.pushesampleas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import co.ronash.pushe.Pushe;
import co.ronash.pushedemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pushe.initialize(this, true);
    }
}
