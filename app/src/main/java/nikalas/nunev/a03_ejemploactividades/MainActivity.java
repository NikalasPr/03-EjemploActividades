package nikalas.nunev.a03_ejemploactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("ESTADOS","1- Metodo onCreate");
        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Lanzar la nueva actividad
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2- Metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3- Metodo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4- Metodo onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5- Metodo onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS","6- Metodo onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","7- Metodo onDestroy");
    }
}