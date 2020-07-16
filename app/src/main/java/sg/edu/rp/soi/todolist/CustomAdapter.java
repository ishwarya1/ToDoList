package sg.edu.rp.soi.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoList> ToDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoList> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.ToDoList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvItem = rowView.findViewById(R.id.tvItem);
        TextView tvDate = rowView.findViewById(R.id.tvDate);
        ToDoList currentItem = ToDoList.get(position);
        tvItem.setText(currentItem.getTitle());
        tvDate.setText(currentItem.toString());
        return rowView;
    }
}

