package com.farmers_to_retailers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Farmers_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_farmers_home);
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        ImageView vegetables,chats;


        vegetables=findViewById(R.id.vegetables);
        chats=findViewById(R.id.chats);

        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vegetables_button;
                vegetables_button=new Intent(Farmers_home.this, Vegetables.class);
                startActivity(vegetables_button);;
            }
        });


        chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chats_button;
                chats_button=new Intent(Farmers_home.this,Buyers_chats.class);
                startActivity(chats_button);;
            }
        });

    }
}