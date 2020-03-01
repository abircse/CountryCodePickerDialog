package com.coxtunes.countrycodepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CountryCodePicker countryCodePicker = findViewById(R.id.countryCodeHolder);

        String code = countryCodePicker.getFullNumberWithPlus();
        Toast.makeText(getApplicationContext(), code, Toast.LENGTH_SHORT).show();

        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                String code = countryCodePicker.getFullNumberWithPlus();
                Toast.makeText(getApplicationContext(), code, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
