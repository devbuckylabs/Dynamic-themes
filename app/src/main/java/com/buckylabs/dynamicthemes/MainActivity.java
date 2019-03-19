package com.buckylabs.dynamicthemes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.AppTheme);

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = findViewById(R.id.aswitch);

        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){

            aSwitch.setChecked(true);

        }
aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked){
            Toast.makeText(MainActivity.this, "dark", Toast.LENGTH_SHORT).show();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            recreate();
        }

        else{
            Toast.makeText(MainActivity.this, "light", Toast.LENGTH_SHORT).show();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        recreate();
        }
    }
});

    }
}
