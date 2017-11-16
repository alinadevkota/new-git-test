package com.example.acer.merisaathi;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Form extends AppCompatActivity {

    Database db;
    User[] user=new User[5];
  //  User user=new User();
    Button addbtn1, addbtn2, addbtn3, addbtn4, addbtn5, addbtn6;
    TextView[] tv=new TextView[5];
   public static int i=-1;
    String[] names=new String[5];
    String[] numbers=new String[5];
    String[] parts5=new String[2];
    String[] parts=new String[2];
    String[] parts2=new String[2];
    String[] parts3=new String[2];
    String[] parts4=new String[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_);
        db =new Database(this);
        Button submitButton = (Button) findViewById(R.id.formsubmitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                user[0].number= parts[0];
//                user[0].name = parts[1];
//                user[1].number= parts2[0];
//                user[1].name = parts2[1];
//                user[2].number= parts3[0];
//                user[2].name = parts3[1];
//                user[3].number= parts4[0];
//                user[3].name = parts4[1];
//                user[4].number= parts5[0];
//                user[4].name = parts5[1];
                Intent intent = new Intent(Form.this, NavigationDrawer.class);
                startActivity(intent);
            }
        });



        tv[0]=(TextView)findViewById(R.id.form_contacts1);
        tv[1]=(TextView)findViewById(R.id.form_contacts2);

        tv[2]=(TextView)findViewById(R.id.form_contacts3);

        tv[3]=(TextView)findViewById(R.id.form_contacts4);

        tv[4]=(TextView)findViewById(R.id.form_contacts5);
//        for (int g=0;g<5;g++)
//        {
//            tv[g].setText("Name: "+names[g]+" Mobile No.: "+numbers[g]);
//        }
        tv[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                i=0;
                Toast.makeText(Form.this,"value of i "+i,Toast.LENGTH_SHORT).show();

                startActivityForResult(intent, 1);
            }
        });
        tv[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                i=1;
                Toast.makeText(Form.this,"value of i "+i,Toast.LENGTH_SHORT).show();
                startActivityForResult(intent, 1);
            }
        });
        tv[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                i=2;
                Toast.makeText(Form.this,"value of i "+i,Toast.LENGTH_SHORT).show();
                startActivityForResult(intent, 1);
            }
        });
        tv[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                i=3;
                Toast.makeText(Form.this,"value of i "+i,Toast.LENGTH_SHORT).show();
                startActivityForResult(intent, 1);
            }
        });
        tv[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                i=4;
                Toast.makeText(Form.this,"value of i "+i,Toast.LENGTH_SHORT).show();
                startActivityForResult(intent, 1);
            }
        });



//        addbtn1 = (Button) findViewById(R.id.form_addbtn1);
//        addbtn1.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
//               startActivityForResult(intent, 1);
//           }
//       });

     //   nametv1 = (TextView) findViewById(R.id.form_name1);
     //   numbertv1 = (TextView) findViewById(R.id.form_contact1);

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {
            Uri contactData = data.getData();
            Cursor c = getContentResolver().query(contactData, null, null, null, null);
            if (c.moveToFirst()) {

                String phoneNumber = "", emailAddress = "";
                String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                String contactId = c.getString(c.getColumnIndex(ContactsContract.Contacts._ID));
                //http://stackoverflow.com/questions/866769/how-to-call-android-contacts-list   our upvoted answer

                String hasPhone = c.getString(c.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER));

                if (hasPhone.equalsIgnoreCase("1"))
                    hasPhone = "true";
                else
                    hasPhone = "false";

                if (Boolean.parseBoolean(hasPhone)) {
                    Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = " + contactId, null, null);
                    while (phones.moveToNext()) {
                        phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                    }
                    phones.close();
                }

                // Find Email Addresses
                Cursor emails = getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, ContactsContract.CommonDataKinds.Email.CONTACT_ID + " = " + contactId, null, null);
                while (emails.moveToNext()) {
                    emailAddress = emails.getString(emails.getColumnIndex(ContactsContract.CommonDataKinds.Email.DATA));
                }
                emails.close();

                //mainActivity.onBackPressed();
                // Toast.makeText(mainactivity, "go go go", Toast.LENGTH_SHORT).show();

                Toast.makeText(Form.this,"value of i "+i,Toast.LENGTH_SHORT).show();
               if(i==0){
                   names[0]=name;
                   numbers[0]=phoneNumber;
                   tv[0].setText(numbers[0]+":"+names[0]);
               }
                else if(i==1){
                   names[1]=name;
                   numbers[1]=phoneNumber;
                   tv[1].setText(numbers[1]+":"+names[1]);
               }
               else if(i==2){
                   names[2]=name;
                   numbers[2]=phoneNumber;
                   tv[2].setText(numbers[2]+":"+names[2]);
               }
               else if(i==3){
                   names[3]=name;
                   numbers[3]=phoneNumber;
                   tv[3].setText(numbers[3]+":"+names[3]);
               }
               else if(i==4){
                   names[4]=name;
                   numbers[4]=phoneNumber;
                   tv[4].setText(numbers[4]+":"+names[4]);
               }

            // nametv1.setText("Name: " + name);
            //    numbertv1.setText("Phone: " + phoneNumber);
              //  tvmail.setText("Email: " + emailAddress);
                Log.d("curs", name + " num" + phoneNumber + " " + "mail" + emailAddress);
            }
            c.close();
        }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
        Intent intent1 = new Intent();
        intent1.setAction(Intent.ACTION_MAIN);
        intent1.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent1);
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        CharSequence user1=savedInstanceState.getCharSequence("user1");
        tv[0].setText(user1);
        String user11=user1.toString();
        Pattern pattern = Pattern.compile(":");
        Matcher matcher = pattern.matcher(user11);
        if (matcher.find()) {
            parts[0] = user11.substring(0, matcher.start());
            parts[1] = user11.substring(matcher.end());
        }





        CharSequence user2=savedInstanceState.getCharSequence("user2");
        tv[1].setText(user2);
        String user21=user2.toString();
//        String[] parts2 = user21.split("\\:"); // escape .

        Pattern pattern2 = Pattern.compile(":");
        Matcher matcher2 = pattern2.matcher(user21);
        if (matcher2.find()) {
            parts2[0] = user21.substring(0, matcher2.start());
            parts2[1] = user21.substring(matcher2.end());
        }



        CharSequence user3=savedInstanceState.getCharSequence("user3");
        tv[2].setText(user3);
        String user31=user3.toString();
//        String[] parts3 = user31.split("\\:"); // escape .


        Pattern pattern3 = Pattern.compile(":");
        Matcher matcher3 = pattern3.matcher(user31);
        if (matcher3.find()) {
            parts3[0] = user31.substring(0, matcher3.start());
            parts3[1] = user31.substring(matcher3.end());
        }

        CharSequence user4=savedInstanceState.getCharSequence("user4");
        tv[3].setText(user4);
        String user41=user4.toString();
//        String[] parts4 = user41.split("\\:"); // escape .


        Pattern pattern4 = Pattern.compile(":");
        Matcher matcher4 = pattern4.matcher(user41);
        if (matcher4.find()) {
            parts4[0] = user41.substring(0, matcher4.start());
            parts4[1] = user41.substring(matcher4.end());
        }


        CharSequence user5=savedInstanceState.getCharSequence("user5");
        tv[4].setText(user5);
        String user51=user5.toString();
//        String[] parts5 = user51.split("\\:"); // escape .

        Pattern pattern5 = Pattern.compile(":");
        Matcher matcher5 = pattern5.matcher(user51);
        if (matcher5.find()) {
            parts5[0] = user51.substring(0, matcher5.start());
            parts5[1] = user51.substring(matcher5.end());
        }

        Toast.makeText(Form.this,parts[0]+" "+parts2[0]+" "+parts3[0]+" "+parts4[0]+" "+parts5[0],Toast.LENGTH_SHORT).show();
//        int success=0;
//        for(int m=0;m<5;m++)
//        {
//            if(db.addData(user[m]))
//            {
//                success++;
//            }
//        }
//        if(success==5)
//        {
//            Toast.makeText(Form.this,"all added ",Toast.LENGTH_SHORT).show();
//        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        CharSequence user1=tv[0].getText();
        outState.putCharSequence("user1",user1);
        CharSequence user2=tv[1].getText();
        outState.putCharSequence("user2",user2);
        CharSequence user3=tv[2].getText();
        outState.putCharSequence("user3",user3);
        CharSequence user4=tv[3].getText();
        outState.putCharSequence("user4",user4);
        CharSequence user5=tv[4].getText();
        outState.putCharSequence("user5",user5);
    }
}