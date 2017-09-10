package ustm.lasir2017;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
    String senha;

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
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        etEmail = (EditText) findViewById(R.id.etEmail);

        tvPassword = (TextView) findViewById(R.id.tvPassword);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btOK = (Button) findViewById(R.id.btOK);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
                Toast.makeText(LasirActivity.this, email, Toast.LENGTH_SHORT).show();
                //Instrução para mostar de forma simples e rapida o resultado de uma operação
            }
        });
    }

    private void login(){ //Metodo para validar o login e abrin nova janela

        email = etEmail.getText().toString();
        senha = etPassword.getText().toString();

        if(email.equals("teste@teste.com")&&senha.equals("12345")){

            AlertDialog.Builder dialogo = new
                    AlertDialog.Builder(LasirActivity.this);
            dialogo.setTitle("Resultado");
            dialogo.setMessage("O Email " + email + " conscide com a senha");
            dialogo.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent i = new Intent(LasirActivity.this, SegundaActivity.class); //Intrução para mostrar nova janela a abrir
                    startActivity(i); //Intrução para abrir nova Janela
                }
            });
            dialogo.show(); //Apresentar o Resultado em Janela modal


        }else {
            tvEmail.setError(getResources().getString(R.string.dados_incorrectos));
            tvPassword.setError(getResources().getString(R.string.dados_incorrectos));

        }
    }
}
