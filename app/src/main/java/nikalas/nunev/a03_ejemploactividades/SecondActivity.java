package nikalas.nunev.a03_ejemploactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button btnAbrir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("ESTADOS","1- En el metodo onCreate Second");
        btnAbrir = findViewById(R.id.btnAbrirSecond);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Para pasar de una actividad o otra: hay que poner de donde a donde e iniciar la actividad
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
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
        this.onDestroy();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","7- Metodo onDestroy Second");
    }
}