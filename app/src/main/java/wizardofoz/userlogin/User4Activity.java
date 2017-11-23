package wizardofoz.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class User4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user4);

        TextView textHyperLink = (TextView) findViewById(R.id.idlink4);
        textHyperLink.setMovementMethod(LinkMovementMethod.getInstance());

        Button btBack=(Button)findViewById(R.id.backButton4);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent =new Intent(User4Activity.this,MainActivity.class);
                startActivity(MainIntent);
            }
        });


    }
}
