package nass.sajilobooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class users_info extends AppCompatActivity {
     Database2 db2;
      String[] user;
      ListView lv;
      ArrayList<userinfo> u;
        userinfo u1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_info);
       db2=new Database2(this);

        ArrayList<String> list=db2.getdata3();
              user=new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
           /* Toast.makeText(users_info.this, list.get(i), Toast.LENGTH_SHORT).show();*/
            Toast.makeText(users_info.this, user[i], Toast.LENGTH_SHORT).show();
            Toast.makeText(users_info.this, list.get(i), Toast.LENGTH_SHORT).show();
            user[i]=list.get(i);

        }
      /*  u1=db2.getdata2("spandan");
        Toast.makeText(users_info.this, u1.name, Toast.LENGTH_SHORT).show();
*/

     //   u= db2.getdata3();

       /* for(int i=0;i<u.size();i++){

            user[i]="Name : "+u.get(i).name.toString()+"\nAddress : "+u.get(i).address.toString()+"\nPhone No. : "+u.get(i).contact.toString()+"\nSeat No. :"+u.get(i).seatno;


        }
*/



        lv=(ListView)findViewById(R.id.users_info_ll2);
        usercustomview adapter=new usercustomview(users_info.this,user);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {

            }
        });


    }
}
