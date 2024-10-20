package com.farmers_to_retailers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Vegetables extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vegetables);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/




        LinearLayout pumbkin_vegetables;

        pumbkin_vegetables=findViewById(R.id.first_row);

        pumbkin_vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pumbkin_vegetables;
                pumbkin_vegetables=new Intent(Vegetables.this,Pumbkin_vegetables.class);
                startActivity(pumbkin_vegetables);
            }
        });





    }
}