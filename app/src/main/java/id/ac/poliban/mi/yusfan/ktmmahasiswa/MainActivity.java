package id.ac.poliban.mi.yusfan.ktmmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        EditText etNim = findViewById(R.id.etNim);
        EditText etKelas = findViewById(R.id.etKelas);
        EditText etAlamat = findViewById(R.id.etAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btSumbit = findViewById(R.id.btSumbit);

        btClear.setOnClickListener(v -> {
            etNama.setText("");
            etNim.setText("");
            etKelas.setText("");
            etAlamat.setText("");
        });

        btSumbit.setOnClickListener(v -> {
            etNama.setText("");
            etNim.setText("");
            etKelas.setText("");
            etAlamat.setText("");
            etNama.requestFocus();
            Toast.makeText(this, "Apa", Toast.LENGTH_SHORT).show();
        });
    }
}
