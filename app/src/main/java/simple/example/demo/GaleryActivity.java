package simple.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import simple.example.demo.model.Alat;

public class GaleryActivity extends AppCompatActivity {
    List<Alat> alats;
    int indeksTampil = 0;
    String jenisAlat;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txJudul,txJenis, txNama, txHarga, txDeskripsi;
    ImageView ivFotoAlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        Intent intent = getIntent();
        jenisAlat = intent.getStringExtra(MainActivity.JENIS_GALERY_KEY);
        alats = DataProvider.getAlatsByType(this,jenisAlat);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView(){
        btnPertama = findViewById(R.id.btnPertama);
        btnTerakhir = findViewById(R.id.btnTerakhir);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);

        btnPertama.setOnClickListener(view -> alatPertama());
        btnTerakhir.setOnClickListener(view -> alatTerakhir());
        btnSebelumnya.setOnClickListener(view -> alatSebelumnya());
        btnBerikutnya.setOnClickListener(view -> alatBeriktnya());

        txJenis = findViewById(R.id.txJenis);
        txNama = findViewById(R.id.txNama);
        txHarga = findViewById(R.id.txHarga);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoAlat = findViewById(R.id.gambarAlat);

        txJudul = findViewById(R.id.txJudul);
        if(jenisAlat.equalsIgnoreCase("Kipas")){
            txJudul.setText("Kipas Angin");
        }else if(jenisAlat.equalsIgnoreCase("Mesin")){
            txJudul.setText("Mesin Cuci");
        }else {
            txJudul.setText(jenisAlat);
        }

    }

    private void tampilkanProfil() {
        Alat k = alats.get(indeksTampil);
        Log.d("TELEVISI","Menampilkan Televisi "+k.getJenis());
        txJenis.setText(k.getJenis());
        txNama.setText(k.getNama());
        txHarga.setText(k.getHarga());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoAlat.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void alatPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Anda sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void alatTerakhir() {
        int posAkhir = alats.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Anda sudah melihat semuanya",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }


    private void alatBeriktnya() {
        if (indeksTampil == alats.size() - 1) {
            Toast.makeText(this,"Anda sudah melihat semuanya",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void alatSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Anda sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }

}
