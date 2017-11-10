package nass.sajilobooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 08-Feb-17.
 */

public class Database extends SQLiteOpenHelper {
    public static String DATABASE_NAME="sql.db";
    public static int version=1;
    public static String USER_EMAIL="email";
    public static String USER_NAME="name";
    public static String TABLE_NAME="user";
    public static String USER_PASSWORD="password";
    public static String USER_ID="id";


    public Database(Context context) {
        super(context, DATABASE_NAME, null, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
               "CREATE TABLE if not exists `user` (\n" +
                       "\t`name`\tTEXT,\n" +
                       "\t`email`\tTEXT,\n" +
                       "\t`password`\tTEXT,\n" +
                       "\tPRIMARY KEY(`email`)\n" +
                       ");"
        );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(db);
    }
    public boolean addData(User u1){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        // cv.put(USER_ID,u1.id);
        cv.put(USER_EMAIL,u1.email);
        cv.put(USER_NAME,u1.name);
        cv.put(USER_PASSWORD,u1.password);
        long result=db.insert(TABLE_NAME,null,cv);
        if(result==-1)
            return false;
        else
            return true;
    }


    /*public ArrayList<user> getdata() {
        ArrayList<user> list=new ArrayList<user>();
        String sql = "select * from user";
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        while (cursor.moveToNext()) {
            user u = new user();
            u.email = cursor.getString(cursor.getColumnIndex("email"));
            u.password = cursor.getString(cursor.getColumnIndex("password"));
            list.add(u);

        }
        return list;
    }*/
    public User getdata(String name) {

        User u=new User();
        String sql = "select * from user where email=\""  +name+"\"";
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        while (cursor.moveToNext()) {
            u.email = cursor.getString(cursor.getColumnIndex("email"));
            u.name = cursor.getString(cursor.getColumnIndex("name"));
            u.password = cursor.getString(cursor.getColumnIndex("password"));
        }
        return u;
    }


}

