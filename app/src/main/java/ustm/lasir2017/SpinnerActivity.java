package ustm.lasir2017;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    TextView tvNome;
    EditText etNome;

    TextView tvIdade;
    EditText etIdade;

    Spinner spSuperhero;

    Button btMostrar;

    String nome, idade, heroi;

    private String[] baseArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        baseArray = getResources().getStringArray(R.array.opcoes);

        tvNome = (TextView) findViewById(R.id.tvNome);
        etNome = (EditText) findViewById(R.id.etNome);

        tvIdade = (TextView) findViewById(R.id.tvIdade);
        etIdade = (EditText) findViewById(R.id.etIdade);

        spSuperhero = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> baseAdapter = new ArrayAdapter<CharSequence>(this, android.R.layout.select_dialog_item, baseArray);
        spSuperhero.setAdapter(baseAdapter);

        spSuperhero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                heroi = baseArray[i];

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btMostrar = (Button) findViewById(R.id.btMostrar);

        btMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mostrar();
            }
        });

    }

    private void Mostrar(){
        nome = etNome.getText().toString();
        idade = etIdade.getText().toString();
        nome = etNome.getText().toString();
        AlertDialog.Builder dialogo = new AlertDialog.Builder(
                SpinnerActivity.this);
        dialogo.setTitle("Skr skr");
        dialogo.setMessage(nome+" mesmo com "+idade+", o seu superheroi favorito é "+ heroi );
        dialogo.setNeutralButton("OK", null);
        dialogo.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
