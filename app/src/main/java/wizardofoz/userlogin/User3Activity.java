package wizardofoz.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class User3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user3);

        TextView textHyperLink = (TextView) findViewById(R.id.idlink3);
        textHyperLink.setMovementMethod(LinkMovementMethod.getInstance());

        Button btBack=(Button)findViewById(R.id.backButton3);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent =new Intent(User3Activity.this,MainActivity.class);
                startActivity(MainIntent);
            }
        });




    }


}
