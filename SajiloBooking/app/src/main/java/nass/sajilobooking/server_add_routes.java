package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class server_add_routes extends AppCompatActivity {
    EditText from,to;
    Button save, cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_add_routes);
        from=(EditText)findViewById(R.id.server_add_routes_et1);
        to=(EditText)findViewById(R.id.server_add_routes_et2);
        save=(Button)findViewById(R.id.server_add_routes_b1);
        cancel=(Button)findViewById(R.id.server_add_routes_b2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(from.getText().toString().isEmpty()||to.getText().toString().isEmpty())){
                    Toast.makeText(server_add_routes.this, "Route Saved...", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(server_add_routes.this, "Fields are Empty...", Toast.LENGTH_SHORT).show();
                }
                Intent intent=new Intent(server_add_routes.this,server_routes.class);
                startActivity(intent);

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(server_add_routes.this,server_routes.class);
                startActivity(intent);
            }
        });
    }
}
