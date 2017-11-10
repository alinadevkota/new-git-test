package nass.sajilobooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 09-Feb-17.
 */

public class usercustomview extends BaseAdapter {
    private Context mContext;
    private final String[] user;
    public usercustomview(Context c, String[] user) {
        mContext = c;
        this.user = user;

    }


    @Override
    public int getCount() {
        return user.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            list = new View(mContext);
            list = inflater.inflate(R.layout.userlist, null);
            TextView textView = (TextView) list.findViewById(R.id.userlist_tv1);

            textView.setText(user[position]);

        } else {
            list = (View) convertView;
        }

        return list;
    }
}
