package nass.sajilobooking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class to_book extends AppCompatActivity {
    TextView tv;
    userinfo u1;
    EditText et1, et2, et3;
    Button b1, b2;
    Database1 db;
    Database2 db2;
    String name, address, phoneno;
    String seat;
    Integer seatint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_book);
        db2 = new Database2(this);
        db = new Database1(this);
        u1 = new userinfo();
        SharedPreferences prefs = getSharedPreferences("myfile", MODE_PRIVATE);
        seat = prefs.getString("seatname", "");
        seatint = Integer.parseInt(seat);
        tv = (TextView) findViewById(R.id.to_book_tv6);
        tv.setText(seat);
        et1 = (EditText) findViewById(R.id.to_book_et1);
        et2 = (EditText) findViewById(R.id.to_book_et2);
        et3 = (EditText) findViewById(R.id.to_book_et3);

         name=et1.getText().toString();
         address=et2.getText().toString();
         phoneno=et3.getText().toString();

        u1.name=name;
        u1.address=address;
        u1.contact=phoneno;
       u1.seatno=seatint;




        b2 = (Button) findViewById(R.id.to_book_b2);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty())) {
                    if (db2.addData2(u1)) {
                        Toast.makeText(to_book.this, "Seat Booked...", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(to_book.this, "datas not stored...", Toast.LENGTH_SHORT).show();
                    }
                    if (db.booked(seatint)) {


                    } else {
                        Toast.makeText(to_book.this, "Operation Failed...", Toast.LENGTH_SHORT).show();

                    }
                } else {
                    Toast.makeText(to_book.this, "Fields are Empty...", Toast.LENGTH_SHORT).show();
                }


            }


        });
    }
}