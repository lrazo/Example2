package suitapps.com.example2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
/*
        Runnable execute = new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(execute,3000);
*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        },3000);
    }

    public void nextActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
