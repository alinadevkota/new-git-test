package nass.sajilobooking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class server_seat_options extends AppCompatActivity {
    Database1 db;
    Button b1,b2;
    String seat;
    Integer seatint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_seat_options);
        db=new Database1(this);

        SharedPreferences prefs = getSharedPreferences("myfile",MODE_PRIVATE);
        seat=prefs.getString("seatname","");
        seatint=Integer.parseInt(seat);
        b1=(Button)findViewById(R.id.server_seat_options_b1);
        b2=(Button)findViewById(R.id.server_seat_options_b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(server_seat_options.this,to_book.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(db.sold(seatint)){
                    Toast.makeText(server_seat_options.this, "Seat Marked Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(server_seat_options.this, "Operation Failed...", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
