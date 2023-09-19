package nikalas.nunev.a03_ejemploactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("ESTADOS","1- En el metodo onCreate Second");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2- Metodo onStart Second");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3- Metodo onResume Second");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4- Metodo onPause Second");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5- Metodo onStop Second");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS","6- Metodo onRestart Second");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","7- Metodo onDestroy Second");
    }
}