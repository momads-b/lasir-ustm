package ustm.lasir2017;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SegundaActivity extends AppCompatActivity {

    CheckBox item1, item2, item3, item4, item5;
    Button bttotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        item1 = (CheckBox) findViewById(R.id.item1);
        item2 = (CheckBox) findViewById(R.id.item2);
        item3 = (CheckBox) findViewById(R.id.item3);
        item4 = (CheckBox) findViewById(R.id.item4);
        item5 = (CheckBox) findViewById(R.id.item5);

        bttotal = (Button) findViewById(R.id.bttotal);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (item1.isChecked())
                    total += 1;
                if (item2.isChecked())
                    total += 1;
                if (item3.isChecked())
                    total += 1;
                if (item4.isChecked())
                    total += 1;
                if (item5.isChecked())
                    total += 1;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(
                        SegundaActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Selecionou :"
                        + String.valueOf(total)+ " checkboxes");
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

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
