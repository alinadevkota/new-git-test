package nass.sajilobooking;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Database1 d;

    Database db;
    EditText e1, p1;
    Button b1, b2,b3;
    User user=new User();
//    UserClass u1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db =new Database(this);
        d=new Database1(this);

 // d.addall1sttime();

        e1 = (EditText) findViewById(R.id.main_email);
        p1 = (EditText) findViewById(R.id.main_password);
        b1 = (Button) findViewById(R.id.main_b1);
        b3 = (Button) findViewById(R.id.main_b2);
        b2 = (Button) findViewById(R.id.main_b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                User u=db.getdata(e1.getText().toString());


                if(p1.getText().toString().equals(u.password)) {
                    Intent intent = new Intent(MainActivity.this, Second.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this, "Authentication Failed...", Toast.LENGTH_SHORT).show();
                }








            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,signup.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }
}
