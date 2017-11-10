package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class server_routes extends AppCompatActivity {
    EditText from,to;
    String[] routes={"Kathmandu To Nepalgunj","Kathmandu To Pokhara","Nepalgunj To Kathmandu","Pokhara To Kathmandu"};
    String[] fr={"Kathmandu","Pokhara","Nepalgunj"};
    String[] tr={"Kathmandu","Pokhara","Nepalgunj"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_routes);
        Button search,cancel,listall,add;

        from=(EditText)findViewById(R.id.server_routes_et1);
        to=(EditText)findViewById(R.id.server_routes_et2);

        search=(Button)findViewById(R.id.server_routes_b1) ;
        cancel=(Button)findViewById(R.id.server_routes_b2);
        listall=(Button)findViewById(R.id.server_routes_b3);
        add=(Button)findViewById(R.id.server_routes_b4);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String source1=from.getText().toString();
                String to1=to.getText().toString();
                Integer i=0;
                for(i=0;i<fr.length;i++){
                    if(fr[i].toUpperCase().equals(source1.toUpperCase())&&tr[i].toUpperCase().equals(to1.toUpperCase())){


                        Intent intent=new Intent(server_routes.this,server_bus_list.class);
                        startActivity(intent);
                        break;

                    }else{
                        Toast.makeText(server_routes.this, "Failed...", Toast.LENGTH_SHORT).show();
                    }
                }





            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(server_routes.this,first_page_server.class);
                startActivity(intent);

            }
        });
        listall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(server_routes.this,server_listed_routes.class);
                startActivity(intent);

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(server_routes.this,server_add_routes.class);
                startActivity(intent);

            }
        });
    }
}
