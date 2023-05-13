package com.example.mybio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;

import com.example.mybio.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/fahim-mohammod-fardous-93ab96213/"));
                startActivity(linkedinIntent);
            }
        });
        binding.problemsolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leetcodeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://leetcode.com/fahimfardous8/"));
                startActivity(leetcodeIntent);
            }
        });
        binding.contacttv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "fahimfardous8@gmail.com",null));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });
        binding.aboutmetv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About_me.class);
                startActivity(intent);
            }
        });

    }
}