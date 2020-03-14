package com.alaarg.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertcarancy(View view){

        Log.i("Info" , "Button preset");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInbounds= editText.getText().toString();

        double amountToboundsDouble=Double.parseDouble(amountInbounds);

        double amountInDolarsDouble = amountToboundsDouble * 1.3;

        String amountInDolarsStroing = String.format("%.2f", amountInDolarsDouble);

//        Log.i("Amount  in Dollars ",  amountInDolarsStroing);
        Toast.makeText(this , "bound " + amountInbounds + "is A $ " + amountInDolarsStroing, Toast.LENGTH_SHORT ).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
