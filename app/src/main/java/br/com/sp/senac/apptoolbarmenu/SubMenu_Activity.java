package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SubMenu_Activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_menu_layout);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.submenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mSubSalvar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no salvar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSubSalvarComo:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no salvar como",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSubFechar:
                finish();
                break;
        }
        return true;
    }
}












