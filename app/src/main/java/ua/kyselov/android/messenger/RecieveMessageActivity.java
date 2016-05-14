package ua.kyselov.android.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message from MainActivity";
    TextView getter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        getter = (TextView)findViewById(R.id.messageGetter);
        Intent intent = getIntent();
        String message =  intent.getStringExtra("hello");
        getter.setText(message);
    }
}
