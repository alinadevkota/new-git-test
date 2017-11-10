package nass.sajilobooking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class client_bus_layout extends AppCompatActivity {
    Button[] btn;
    String[] bstr;
    Integer[] btnint;
    Integer[] result;

    Database1 db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_bus_layout);
        db=new Database1(this);
        btn=new Button[] {
                (Button) findViewById(R.id.client_bus_layout_b1),
                (Button) findViewById(R.id.client_bus_layout_b2),
                (Button) findViewById(R.id.client_bus_layout_b3),
                (Button) findViewById(R.id.client_bus_layout_b4),
                (Button) findViewById(R.id.client_bus_layout_b5),
                (Button) findViewById(R.id.client_bus_layout_b6),
                (Button) findViewById(R.id.client_bus_layout_b7),
                (Button) findViewById(R.id.client_bus_layout_b8),
                (Button) findViewById(R.id.client_bus_layout_b9),
                (Button) findViewById(R.id.client_bus_layout_b10),
                (Button) findViewById(R.id.client_bus_layout_b11),
                (Button) findViewById(R.id.client_bus_layout_b12),
                (Button) findViewById(R.id.client_bus_layout_b13),
                (Button) findViewById(R.id.client_bus_layout_b14),
                (Button) findViewById(R.id.client_bus_layout_b15),
                (Button) findViewById(R.id.client_bus_layout_b16),
                (Button) findViewById(R.id.client_bus_layout_b17),
                (Button) findViewById(R.id.client_bus_layout_b18),
                (Button) findViewById(R.id.client_bus_layout_b19),
                (Button) findViewById(R.id.client_bus_layout_b20),
                (Button) findViewById(R.id.client_bus_layout_b21),
                (Button) findViewById(R.id.client_bus_layout_b22),
                (Button) findViewById(R.id.client_bus_layout_b23),
                (Button) findViewById(R.id.client_bus_layout_b24),
                (Button) findViewById(R.id.client_bus_layout_b25),
                (Button) findViewById(R.id.client_bus_layout_b26),
                (Button) findViewById(R.id.client_bus_layout_b27),
                (Button) findViewById(R.id.client_bus_layout_b28),
                (Button) findViewById(R.id.client_bus_layout_b29)
        };



        bstr=new String[29];
        btnint=new Integer[29];
        result=new Integer[29];
        for(Integer i=0;i<29;i++){
            bstr[i]=btn[i].getText().toString();
            btnint[i]=Integer.parseInt(bstr[i]);
            result[i]=db.seatcheck(btnint[i]);

            if(result[i]==0){
                btn[i].setBackgroundColor(Color.GREEN);
            }else if(result[i]==1){
                btn[i].setBackgroundColor(Color.YELLOW);
            }else{
                btn[i].setBackgroundColor(Color.RED);
            }



        }

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[0].getText().toString());
                editor.commit();
                if(result[0]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[0]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[0]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[1].getText().toString());
                editor.commit();
                if(result[1]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[1]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[1]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[2].getText().toString());
                editor.commit();
                if(result[2]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[2]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[2]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[3].getText().toString());
                editor.commit();
                if(result[3]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[3]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[3]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[4].getText().toString());
                editor.commit();
                if(result[4]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[4]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[4]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[5].getText().toString());
                editor.commit();
                if(result[5]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[5]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[5]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[6].getText().toString());
                editor.commit();
                if(result[6]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[6]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[6]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[7].getText().toString());
                editor.commit();
                if(result[7]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[7]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[7]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[8].getText().toString());
                editor.commit();
                if(result[8]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[8]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[8]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[9].getText().toString());
                editor.commit();
                if(result[9]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[9]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[9]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[10].getText().toString());
                editor.commit();
                if(result[10]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[10]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[10]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[11].getText().toString());
                editor.commit();
                if(result[11]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[11]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[11]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[12].getText().toString());
                editor.commit();
                if(result[12]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[12]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[12]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[13].getText().toString());
                editor.commit();
                if(result[13]==0) {
                    Intent intent = new Intent(client_bus_layout.this,to_book.class);
                    startActivity(intent);
                }else if(result[13]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[13]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[14].getText().toString());
                editor.commit();
                if(result[14]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[14]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[14]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[15].getText().toString());
                editor.commit();
                if(result[15]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[15]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[15]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[16].getText().toString());
                editor.commit();
                if(result[16]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[16]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[16]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[17].getText().toString());
                editor.commit();
                if(result[17]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[17]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[17]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[18].getText().toString());
                editor.commit();
                if(result[18]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[18]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[18]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[19].getText().toString());
                editor.commit();
                if(result[19]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[19]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[19]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[20].getText().toString());
                editor.commit();
                if(result[20]==0) {
                    Intent intent = new Intent(client_bus_layout.this,to_book.class);
                    startActivity(intent);
                }else if(result[20]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[20]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[21].getText().toString());
                editor.commit();
                if(result[21]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[21]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[21]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[22].getText().toString());
                editor.commit();
                if(result[22]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[22]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[22]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[23].getText().toString());
                editor.commit();
                if(result[23]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[23]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[23]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[24].getText().toString());
                editor.commit();
                if(result[24]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[24]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[24]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[25].getText().toString());
                editor.commit();
                if(result[25]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[25]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[25]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[26].getText().toString());
                editor.commit();
                if(result[26]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[26]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[26]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[27].getText().toString());
                editor.commit();
                if(result[27]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[27]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[27]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("myfile",MODE_PRIVATE).edit();
                editor.putString("seatname",btn[28].getText().toString());
                editor.commit();
                if(result[28]==0) {
                    Intent intent = new Intent(client_bus_layout.this, to_book.class);
                    startActivity(intent);
                }else if(result[28]==1){
                    Toast.makeText(client_bus_layout.this, "Seat Already Booked.", Toast.LENGTH_SHORT).show();
                }else if(result[28]==0){
                    Toast.makeText(client_bus_layout.this, "Seat Already Sold.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(client_bus_layout.this, "There was some error in the process.", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }


}
