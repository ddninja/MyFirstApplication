package com.example.darknight037.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView tt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tt1=(TextView)findViewById(R.id.greeting_textview);
    }
    public void showMessage(View view)
    {
        String message;
        message="Hi!! Nice To meet you\nThis is My first APP..";
        tt1.setText(message);
    }
}
