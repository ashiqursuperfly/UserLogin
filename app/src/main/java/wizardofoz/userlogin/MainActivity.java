package wizardofoz.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String userName1 = "Ashiqur Rahman";
        final String passWord1 = "1605103";
        final String userName2 = "Muntaka Ibnath";
        final String passWord2 = "1605106";
        final String userName3 = "Doha Rahat";
        final String passWord3 = "1605108";
        final String userName4 = "Shahrar Swapnil";
        final String passWord4 = "1605007";

        final EditText etUserName = (EditText) findViewById(R.id.editUsername);
        final EditText etPassWord = (EditText) findViewById(R.id.editPassword);
        Button btLogin = (Button) findViewById(R.id.loginButton);




        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testUserName, testPassWord;
                testUserName = etUserName.getText().toString();
                testPassWord = etPassWord.getText().toString();
                if (testUserName.equals(userName1) && testPassWord.equals(passWord1)) {

                    Intent userIntent = new Intent(MainActivity.this, User1Activity.class);
                    startActivity(userIntent);
                    finish();
                } else if (testUserName.equals(userName2) && testPassWord.equals(passWord2)) {
                    Intent userIntent = new Intent(MainActivity.this, User2Activity.class);
                    startActivity(userIntent);
                    finish();

                } else if (testUserName.equals(userName3) && testPassWord.equals(passWord3)) {
                    Intent userIntent = new Intent(MainActivity.this, User3Activity.class);
                    startActivity(userIntent);
                    finish();

                } else if (testUserName.equals(userName4) && testPassWord.equals(passWord4)) {
                    Intent userIntent = new Intent(MainActivity.this, User4Activity.class);
                    startActivity(userIntent);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_LONG).show();
                }


            }
        });


    }

    private static final int TIME_INTERVAL = 2500;
    private long mBackPressed;

    @Override
    public void onBackPressed()
    {


        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis())
        {
            super.onBackPressed();

            return;
        }
        else {
           Toast.makeText(getBaseContext(), "Tap back button in order to exit", Toast.LENGTH_SHORT).show();

        }

        mBackPressed = System.currentTimeMillis();

    }



}