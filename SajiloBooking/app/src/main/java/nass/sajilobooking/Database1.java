package nass.sajilobooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 08-Feb-17.
 */

public class Database1 extends SQLiteOpenHelper {



    public static String DATABASE_NAME="sql1.db";
    public static int version=1;
    public static String TABLE_NAME="seat";
    public static String SEAT_NO="seatno";
    public static String SEAT_check="seatcheck";




    public Database1(Context context) {
        super(context, DATABASE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE if not exists `seat` (\n" +
                        "\t`seatno`\tINTEGER,\n" +
                        "\t`seatcheck`\tTEXT,\n" +
                        "\tPRIMARY KEY(`seatno`)\n" +
                        ");"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(db);
    }






    public int seatcheck(int i) {

        int j=0;
        String sql = "select * from seat where seatno= "+i;
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        //cursor.moveToFirst();
        while (cursor.moveToNext()) {

            String S = cursor.getString(cursor.getColumnIndex("seatcheck"));
            j=Integer.parseInt(S);

        }
        return j;
    }

    public boolean add1sttime(int i)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(SEAT_NO,i);
        cv.put(SEAT_check,"0");
        long res=db.insert("seat",null,cv);

        if(res==-1)
            return false;
        else
            return true;
    }

    public boolean booked(int i)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(SEAT_NO,i);
        cv.put(SEAT_check,"1");
        long res= db.update("seat", cv, "seatno = ? ", new String[] { Integer.toString(i) });

        if(res==-1)

            return false;
        else
            return true;
    }
    public boolean sold(int i)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(SEAT_NO,i);
        cv.put(SEAT_check,"2");
        long res= db.update("seat", cv, "seatno = ? ", new String[] { Integer.toString(i) });

        if(res==-1)

            return false;
        else
            return true;
    }

    public boolean addall1sttime()
    {
        int j=0;
        for(int i=1;i<30;i++)
        {
            if(add1sttime(i))
            {
                j++;
            }
        }
        if(j==30)
            return true;
        else
            return false;
    }





}
