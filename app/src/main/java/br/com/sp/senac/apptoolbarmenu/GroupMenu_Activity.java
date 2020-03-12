package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class GroupMenu_Activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_menu_layout);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.grupomenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mGpAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em salvar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpLixeira:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em lixeira",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpFav:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em favoritos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpSpam:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em spam",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpSair:
                finish();
                break;
        }
        return true;
    }
}
