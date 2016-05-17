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
        String text = reciever.getText().toString();
        String textTitile = messageForm.getText().toString();
        String [] address = {text};
        composeMail(address, textTitile);
    }

    public void composeMail(String[] adresses, String text){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL,adresses);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(intent);
    }
}
