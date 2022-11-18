package com.example.fragment_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstfragbtn, secondfragbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstfragbtn = findViewById(R.id.btn_1);
        secondfragbtn = findViewById(R.id.btn_2);


        firstfragbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replacefragment(new Fragment1());

            }
        });

        secondfragbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                replacefragment(new Fragment2());

            }
        });
    }

    private void replacefragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layot,fragment);
        fragmentTransaction.commit();
    }
}