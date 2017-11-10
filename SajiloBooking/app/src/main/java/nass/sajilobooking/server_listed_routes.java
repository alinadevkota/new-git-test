package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class server_listed_routes extends AppCompatActivity {
    private ListView lv;
    String[] routes={"Kathmandu To Nepalgunj","Kathmandu To Pokhara","Nepalgunj To Kathmandu","Pokhara To Kathmandu"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_listed_routes);
        lv=(ListView)findViewById(R.id.server_listed_routes_lv1);
        rcustomview adapter=new rcustomview(server_listed_routes.this,routes);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, android.view.View view, int position, long id) {
                Intent intent =new Intent(server_listed_routes.this,server_bus_list.class);
                startActivity(intent);
            }
        });
    }
}
