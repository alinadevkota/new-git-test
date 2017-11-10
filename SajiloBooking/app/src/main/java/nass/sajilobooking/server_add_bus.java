package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class server_add_bus extends AppCompatActivity {
    EditText et1, et2, et3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_add_bus);
        et1=(EditText)findViewById(R.id.server_add_bus_ed1);
        et2=(EditText)findViewById(R.id.server_add_bus_ed2);
        et3=(EditText)findViewById(R.id.server_add_bus_ed3);
        b1=(Button)findViewById(R.id.server_add_bus_b1);
        b2=(Button)findViewById(R.id.server_add_bus_b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(server_add_bus.this,server_bus_list.class);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(et1.getText().toString().isEmpty()||et2.getText().toString().isEmpty()||et3.getText().toString().isEmpty())){
                    Toast.makeText(server_add_bus.this, "Bus Added Successfully...", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(server_add_bus.this,server_bus_list.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(server_add_bus.this, "Fields are Empty...", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
