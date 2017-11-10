package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class agency_confirmation extends AppCompatActivity {
    EditText e1;
    Button b1,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agency_confirmation);
        b1=(Button)findViewById(R.id.agency_confirmation_ok);
        b2=(Button)findViewById(R.id.agency_confirmation_cancel);
        e1=(EditText)findViewById(R.id.agency_confirmation_ed1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(agency_confirmation.this, "Field is empty", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(agency_confirmation.this,agency_confirmation.class);
                    startActivity(intent);
                } else if (e1.getText().toString().equals("1") ) {


                    Intent intent=new Intent(agency_confirmation.this,first_page_server.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(agency_confirmation.this, "Incorrect Password...", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(agency_confirmation.this,agency_confirmation.class);
                    startActivity(intent);

                }

            }
        });
    }
}
