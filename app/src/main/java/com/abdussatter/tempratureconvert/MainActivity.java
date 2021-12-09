package com.abdussatter.tempratureconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText edInputTemp;
    TextView tvFahrenheit, tvKelvin, tvRankine, tvNewton, tvRomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edInputTemp = findViewById(R.id.edInputTemp);
        tvFahrenheit = findViewById(R.id.tvFahrenheit);
        tvKelvin = findViewById(R.id.tvKelvin);
        tvRankine = findViewById(R.id.tvRankine);
        tvNewton = findViewById(R.id.tvNewton);
        tvRomer = findViewById(R.id.tvRomer);

        edInputTemp.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if(edInputTemp.getText().toString().length() > 0){
            float inputTemp = Float.parseFloat(edInputTemp.getText().toString());
            float fahrenheitTemp = (float) ((inputTemp * 9/ 5) + 32.0);
            float kelvinTemp = (float) (inputTemp + 273.15);
            float RankineTemp = (float) ((inputTemp * 9/5) + 491.67);
            float newtonTemp = (float) (inputTemp * 0.33);
            float romerTemp = (float) ((inputTemp * 0.52500) + 7.5);

            tvFahrenheit.setText(fahrenheitTemp + "\u00B0 F");
            tvKelvin.setText(kelvinTemp + "\u00B0 K");
            tvRankine.setText(RankineTemp + "\u00B0 R");
            tvNewton.setText(newtonTemp + "\u00B0 N");
            tvRomer.setText(romerTemp + "\u00B0 Ro");
        }
        else{
            tvFahrenheit.setText("");
            tvKelvin.setText("");
            tvRankine.setText("");
            tvNewton.setText("");
            tvRomer.setText("");
        }


    }
}