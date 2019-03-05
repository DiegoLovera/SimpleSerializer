package com.diegolovera.serializer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.diegolovera.simpleserializer.SimpleSerializer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.textView);

        String s = SimpleSerializer.Serialize(
                new ExampleObject(1, "ExampleName", "Hello"));
        text.setText(s);
    }
}
