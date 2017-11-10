package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first_page_server extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page_server);
        Button notification,routes,user;
        notification=(Button)findViewById(R.id.first_page_server_b1);
        routes=(Button)findViewById(R.id.first_page_server_b2);
        user=(Button)findViewById(R.id.first_page_server_b3);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(first_page_server.this,server_notifications.class);
                startActivity(intent);
            }
        });
        routes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(first_page_server.this,server_routes.class);
                startActivity(intent);
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(first_page_server.this,users_info.class);
                startActivity(intent);
            }
        });
    }
}
