package com.farmers_to_retailers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Eng_lang_farmer_and_buyer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eng_lang_farmer_and_buyer);
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/


        Button buyers;
        Button farmers;

        buyers=findViewById(R.id.buyersButton);
        farmers=findViewById(R.id.farmersButton);


        buyers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyers_home;
                buyers_home=new Intent(Eng_lang_farmer_and_buyer.this,Buyers_home.class);
                startActivity(buyers_home);

            }
        });

        farmers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent farmers_home;
                farmers_home=new Intent(Eng_lang_farmer_and_buyer.this,Farmers_home.class);
                startActivity(farmers_home);
            }
        });

    }
}