package simple.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.content.Intent;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    ImageButton btnTelevisi, btnKipasAngin, btnMesinCuci;
    public static final String JENIS_GALERY_KEY = "JENIS GALERI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialView();
    }

    private void inisialView(){
    btnTelevisi = findViewById(R.id.btn_buka_televisi);
    btnKipasAngin = findViewById(R.id.btn_buka_kipas);
    btnMesinCuci = findViewById(R.id.btn_buka_mesin_cuci);
    btnTelevisi.setOnClickListener(v -> {
        Log.d("MAIN","Buka activity Televisi");
        Intent intent = new Intent(this, GaleryActivity.class);
        intent.putExtra(JENIS_GALERY_KEY, "Televisi");
        startActivity(intent);
    });
    btnKipasAngin.setOnClickListener(v -> {
        Log.d("MAIN","Buka activity Televisi");
        Intent intent = new Intent(this, GaleryActivity.class);
        intent.putExtra(JENIS_GALERY_KEY, "Kipas");
        startActivity(intent);
    });
    btnMesinCuci.setOnClickListener(view -> bukaGalery("Mesin"));
    }

    private void bukaGalery (String jenisAlat) {
        Log.d("MAIN","Buka activity Televisi");
        Intent intent = new Intent(this, GaleryActivity.class);
        intent.putExtra(JENIS_GALERY_KEY, jenisAlat);
        startActivity(intent);

    }
}