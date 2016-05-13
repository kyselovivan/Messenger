package ua.kyselov.android.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText sender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sender = (EditText)findViewById(R.id.message);
    }

    public void onSendMessage(View view){
        Intent intent = new Intent(this, RecieveMessageActivity.class);
        String message = sender.getText().toString();
        intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
