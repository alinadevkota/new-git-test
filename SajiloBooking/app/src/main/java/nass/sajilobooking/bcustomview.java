package nass.sajilobooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by User on 08-Feb-17.
 */

public class bcustomview extends BaseAdapter {

    private Context mContext;
    private final String[] buses;


    public bcustomview(Context c, String[] buses) {
        mContext = c;

        this.buses = buses;
    }


    @Override
    public int getCount() {
        return buses.length;
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
            list = inflater.inflate(R.layout.routelist, null);
            TextView textView = (TextView) list.findViewById(R.id.routelist_tv1);

            textView.setText(buses[position]);

        } else {
            list = (View) convertView;
        }

        return list;
    }
}
