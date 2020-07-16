package sg.edu.rp.soi.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvTodoList;
    ArrayList<ToDoList> todoList;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTodoList = findViewById(R.id.lv);
        todoList = new ArrayList<>();
        ToDoList item1 = new ToDoList("Go for movie", Calendar.getInstance());
        todoList.add(item1);
        todoList.add( new ToDoList("Buy Milk", Calendar.getInstance()));
        todoList.add( new ToDoList("Go Shopping", Calendar.getInstance()));
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, todoList);
        lvTodoList.setAdapter(adapter);
    }
}