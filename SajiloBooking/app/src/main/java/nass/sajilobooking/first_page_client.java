package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class first_page_client extends AppCompatActivity {
    Button b1;
    private ListView lv;
    String[] routes={"Kathmandu To Nepalgunj","Kathmandu To Pokhara","Nepalgunj To Kathmandu","Pokhara To Kathmandu"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page_client);

        b1=(Button)findViewById(R.id.first_page_client_b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(first_page_client.this,first_page_client2.class);
                startActivity(intent);
            }
        });

        lv=(ListView)findViewById(R.id.first_page_client_lv1);
        rcustomview adapter=new rcustomview(first_page_client.this,routes);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(first_page_client.this,first_page_client2.class);
                startActivity(intent);
            }
        });
    }
}
