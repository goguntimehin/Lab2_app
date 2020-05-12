package app.papr.instalogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mybutton;
    private TextView Textview;
    private EditText Edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton = (Button) findViewById(R.id.btn_login);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean valid = false;
                TextView et1 = findViewById(R.id.username);
                EditText et2 = findViewById(R.id.password);
                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if (s1.equals("admin") && s2.equals("1234"))
                    valid = true;

                if (valid) {
                    Intent I = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(I);

//                Intent Intent = new Intent(MainActivity.this, Main2Activity.class);
//                Intent.putExtra("Message", "Welcome to my profile");
//                Intent.putExtra("Username","goguntimehin" );
//                Intent.putExtra("Gander", "Male");
//                startActivity(Intent);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Wrong input!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }

            }
        });

    }
}


