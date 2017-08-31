package ustm.lasir2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LasirActivity extends AppCompatActivity {

    TextView tvEmail;
    EditText etEmail;

    TextView tvPassword;
    EditText etPassword;

    Button btOK;

    String email;

    /*
    Para a próxima aula investiguem sobre como executar a nossa app no emulador e no dispositivi físico
    E também investiguem sobre os códigos abaixo
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lasir); //Instrução para definir o layout principal associado à activity

        /*Componente c = (Casting do componente)findViewById(R.id.<id>);
         Instrução para associar componentes especificos aos seus respectivos IDs
          */
        tvEmail = (TextView)findViewById(R.id.tvEmail);
        etEmail = (EditText) findViewById(R.id.etEmail);

        tvPassword = (TextView)findViewById(R.id.tvPassword);
        etPassword = (EditText)findViewById(R.id.etPassword);

        btOK = (Button)findViewById(R.id.btOK);

        email = etEmail.getText().toString();

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(LasirActivity.this, email, Toast.LENGTH_SHORT).show();
                //Instrução para mostar de forma simples e rapida o resultado de uma operação
            }
        });
    }

     @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy()",Toast.LENGTH_LONG).show();
    }
}
