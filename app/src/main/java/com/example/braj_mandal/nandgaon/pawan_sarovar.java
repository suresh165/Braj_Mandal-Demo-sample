package com.example.braj_mandal.nandgaon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.braj_mandal.MainActivity;
import com.example.braj_mandal.R;
import com.example.braj_mandal.mathura.dwarkadhish;

public class pawan_sarovar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pawan_sarovar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent = new Intent(pawan_sarovar.this, MainActivity.class);
                Toast.makeText(this, "This is Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}