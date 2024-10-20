package com.farmers_to_retailers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Languages extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_languages);
       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        TextView english, hindi;
        ImageView back_icon;

        english=findViewById(R.id.language_english);
        hindi=findViewById(R.id.language_hindi);
        back_icon=findViewById(R.id.backIcon);


        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_icon;
                back_icon=new Intent(Languages.this,MainActivity.class);
                startActivity(back_icon);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent eng_farmer_and_buyers;
                eng_farmer_and_buyers=new Intent(Languages.this,Eng_lang_farmer_and_buyer.class);
                startActivity(eng_farmer_and_buyers);
            }
        });






    }
}