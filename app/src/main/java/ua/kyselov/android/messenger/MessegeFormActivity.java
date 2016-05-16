package ua.kyselov.android.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessegeFormActivity extends AppCompatActivity {

    EditText reciever;
    EditText messageForm;
    Button sendTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messege_form);
        reciever = (EditText)findViewById(R.id.reciever);
        messageForm = (EditText)findViewById(R.id.message_form);
        sendTo = (Button)findViewById(R.id.send_from_messageform);
    }

    public void onSendByAnotherMessenger(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        Intent intentChooser = Intent.createChooser(intent,"Ghoose a program: ");
        String textTitile = messageForm.getText().toString();
        String text = reciever.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT,text);
        intent.putExtra(Intent.EXTRA_SUBJECT, textTitile);

        startActivity(intentChooser);
    }
}
