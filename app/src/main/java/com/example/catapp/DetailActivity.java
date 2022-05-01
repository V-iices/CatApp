package com.example.catapp.recylerviewjsonexample;

import android.content.Intent;
implementation 'com.android.support:appcompat-v7:28.0.0'
implementation 'com.android.support:recyclerview-v7:28.0.0'
implementation 'com.android.volley:volley:1.1.1'
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

implementation 'com.squareup.picasso:picasso:2.71828'

import static com.example.catapp.MainActivity.EXTRA_CREATOR;
import static com.example.catapp.MainActivity.EXTRA_LIKES;
import static com.example.catapp.MainActivity.EXTRA_URL;
import static com.example.catapp.recylerviewjsonexample.MainActivity.EXTRA_CREATOR;
import static com.example.catapp.recylerviewjsonexample.MainActivity.EXTRA_LIKES;
import static com.example.catapp.recylerviewjsonexample.MainActivity.EXTRA_URL;

import androidx.appcompat.app.AppCompatActivity;

import com.codinginflow.recylerviewjsonexample.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);

        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
        TextView textViewLikes = findViewById(R.id.text_view_like_detail);

        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText(creatorName);
        textViewLikes.setText("Likes: " + likeCount);
    }
}