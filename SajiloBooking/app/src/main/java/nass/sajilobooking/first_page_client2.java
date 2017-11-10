package nass.sajilobooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class first_page_client2 extends AppCompatActivity {
    Button b1;
    private ListView lv;
    String[] buses={"BUS NO: 1234 \nDATE: 2017/02/13 \nTIME: 12:00 PM","BUS NO: 5678 \n" + "DATE: 2017/02/14 \n" + "TIME: 1:00 PM","BUS NO: 9100\n" + "DATE: 2017/02/15 \n" + "TIME: 2:00 PM","BUS NO:1112\n" + "DATE: 2017/02/16 \n" + "TIME: 3:00 PM"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page_client2);
        b1=(Button)findViewById(R.id.first_page_client_b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(first_page_client2.this,client_bus_layout.class);
                startActivity(intent);
            }
        });
        lv=(ListView)findViewById(R.id.first_page_client2_lv1);
        bcustomview adapter=new bcustomview(first_page_client2.this,buses);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(first_page_client2.this,client_bus_layout.class);
                startActivity(intent);
            }
        });
    }
}
