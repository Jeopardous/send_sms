package com.cheguza.sendmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReciveActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive);

        Intent intent = getIntent();
        TextView x=(TextView)findViewById(R.id.message1);
        String messageText=intent.getStringExtra(EXTRA_MESSAGE);
        x.setText(messageText);
    }
}
