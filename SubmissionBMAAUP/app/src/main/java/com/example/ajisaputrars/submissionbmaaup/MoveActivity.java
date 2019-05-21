package com.example.ajisaputrars.submissionbmaaup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        String description = getIntent().getStringExtra("Deskripsi");
        String nama = getIntent().getStringExtra("Nama");

        setTitle(nama);
        TextView descTextView = (TextView) findViewById(R.id.description);
        descTextView.setText(description);
    }
}
