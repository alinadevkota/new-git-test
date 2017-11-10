package nass.sajilobooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User on 09-Feb-17.
 */

public class Database2 extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "sql2.db";
    public static int version = 1;
    public static String TABLE_NAME = "userinfo";
    public static String NAME = "name";
    public static String ADDRESS = "address";
    public static String CONTACT = "contact";
    public static String SEAT_NO = "seatno";


    public Database2(Context context) {
        super(context, DATABASE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE if not exists `userinfo` (\n" +
                        "\t`name`\tTEXT,\n" +
                        "\t`address`\tTEXT,\n" +
                        "\t`contact`\tTEXT,\n" +
                        "\t`seatno`\tINTEGER\n" +
                        ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }


    public boolean addData2(userinfo u1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(NAME, u1.name);
        cv.put(ADDRESS, u1.address);
        cv.put(CONTACT, u1.contact);
        cv.put(SEAT_NO, u1.seatno);

        long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1)
            return false;
        else
            return true;
    }

    public userinfo getdata2(String name) {

        userinfo u = new userinfo();
        String sql = "select * from userinfo where name=\"" + name + "\"";
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        //cursor.moveToFirst();
        while (cursor.moveToNext()) {
            u.name = cursor.getString(cursor.getColumnIndex("name"));
            u.address = cursor.getString(cursor.getColumnIndex("address"));
            u.contact = cursor.getString(cursor.getColumnIndex("contact"));
            u.seatno = Integer.parseInt(cursor.getString(cursor.getColumnIndex("seatno")));
        }
        return u;
    }

    /*public ArrayList<userinfo> getdata3() {
        ArrayList<userinfo> list = new ArrayList<userinfo>();
        String sql = "select * from userinfo";
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        while (cursor.moveToNext()) {
            userinfo u = new userinfo();
            u.name = cursor.getString(cursor.getColumnIndex("name"));
            u.address = cursor.getString(cursor.getColumnIndex("address"));
            u.contact = cursor.getString(cursor.getColumnIndex("contact"));
            u.seatno = Integer.parseInt(cursor.getString(cursor.getColumnIndex("seatno")));
            list.add(u);

        }
        return list;
    }*/
    public ArrayList<String> getdata3() {
        //ArrayList<userinfo> list = new ArrayList<userinfo>();
        ArrayList<String>list1=new ArrayList<String>();
        String sql = "select * from userinfo";
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        while (cursor.moveToNext()) {
            userinfo u = new userinfo();
            u.name = cursor.getString(cursor.getColumnIndex("name"));
            u.address = cursor.getString(cursor.getColumnIndex("address"));
            u.contact = cursor.getString(cursor.getColumnIndex("contact"));
            u.seatno = Integer.parseInt(cursor.getString(cursor.getColumnIndex("seatno")));
            String S="Name :"+u.name+"\nAddress  :"+u.address.toString()+"\nContact  :"+u.contact.toString()+"\nSeat No  :"+u.seatno;

            list1.add(S);


        }
        return list1;
    }

}