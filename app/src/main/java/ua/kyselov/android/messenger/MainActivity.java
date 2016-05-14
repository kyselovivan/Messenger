package ua.kyselov.android.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText sender;
    EditText title;
    Button sendByGmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sender = (EditText)findViewById(R.id.message);
        title = (EditText)findViewById(R.id.title);
        sendByGmail = (Button)findViewById(R.id.send_by_gmail);
    }

    public void onSendMessage(View view){
        Intent intent = new Intent(this, RecieveMessageActivity.class);
        String message = sender.getText().toString();
        intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void onSendByAnotherMessenger(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        Intent intentChooser = Intent.createChooser(intent,"Ghoose a program: ");
        String textTitile = title.getText().toString();
        String text = sender.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT,text);
        intent.putExtra(Intent.EXTRA_SUBJECT, textTitile);

        startActivity(intentChooser);
    }
}
