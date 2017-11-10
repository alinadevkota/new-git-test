package nass.sajilobooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 08-Feb-17.
 */

public class rcustomview extends BaseAdapter {
    private Context mContext;
    private final String[] routes;


    public rcustomview(Context c, String[] routes) {
        mContext = c;

        this.routes = routes;
    }


    @Override
    public int getCount() {
        return routes.length;
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

            textView.setText(routes[position]);

        } else {
            list = (View) convertView;
        }

        return list;

    }
}
