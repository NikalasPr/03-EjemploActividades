package nikalas.nunev.a03_ejemploactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.e("ESTADOS","1- Metodo onCreate Third");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2- Metodo onStart Third");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3- Metodo onResume Third");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4- Metodo onPause Third");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5- Metodo onStop Third");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS","6- Metodo onRestart Third");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","7- Metodo onDestroy Third");
    }
}