package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

   // int id_To_Update = 0;

    EditText et1,et2,et3;
    Button b1,b2;
    Database db;
    User u1=new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        et1=(EditText)findViewById(R.id.signup_et1);
       et2=(EditText)findViewById(R.id.signup_et2);
        et3=(EditText)findViewById(R.id.signup_et3);
        b1=(Button)findViewById(R.id.signup_b1);
        b2=(Button)findViewById(R.id.signup_b2);


        db = new Database(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                u1.name=et1.getText().toString();
                u1.email=et2.getText().toString();
                u1.password=et3.getText().toString();
               if(db.addData(u1))
               {
                   Toast.makeText(signup.this, "new user created", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(signup.this,MainActivity.class);
                    startActivity(intent);
               }else{
                   Toast.makeText(signup.this, "sign up failed...", Toast.LENGTH_SHORT).show();
               }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
