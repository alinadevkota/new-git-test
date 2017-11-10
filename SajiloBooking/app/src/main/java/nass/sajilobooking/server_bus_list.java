package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class server_bus_list extends AppCompatActivity {
    Button  b1,b2;
    TextView tv;
    private ListView lv;
    String[] buses={"BUS NO: 1234 \nDATE: 2017/02/13 \nTIME: 12:00 PM","BUS NO: 5678 \n" + "DATE: 2017/02/14 \n" + "TIME: 1:00 PM","BUS NO: 9100\n" + "DATE: 2017/02/15 \n" + "TIME: 2:00 PM","BUS NO:1112\n" + "DATE: 2017/02/16 \n" + "TIME: 3:00 PM"};
    String[] busno={"1234","5678","9100","1112"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_bus_list);
        b1=(Button)findViewById(R.id.available_buses_b1);
        b2=(Button)findViewById(R.id.available_buses_b2);
        tv=(TextView)findViewById(R.id.available_buses_et1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(server_bus_list.this,server_add_bus.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Integer i=0;i<busno.length;i++){
                    if(busno[i].equals(tv.getText().toString())){
                        Intent intent=new Intent(server_bus_list.this,server_bus_layout.class);
                        startActivity(intent);
                        break;
                    }
                    else{
                        Toast.makeText(server_bus_list.this, "Invalid Bus No...", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        lv=(ListView)findViewById(R.id.lv1);
        bcustomview adapter=new bcustomview(server_bus_list.this,buses);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, android.view.View view, int position, long id) {
                Intent intent = new Intent(server_bus_list.this,server_bus_layout.class);
                startActivity(intent);

            }
        });
    }
}
