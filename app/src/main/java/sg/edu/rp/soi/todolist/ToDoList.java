package sg.edu.rp.soi.todolist;

import java.util.Calendar;

public class ToDoList {
    private String title;
    private Calendar date;

    public ToDoList(String title, Calendar date) {

        this.title = title;
        this.date = date;

    }


    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {
        this.title = title;

    }

    public Calendar getDate() {

        return date;

    }

    public void setDate(Calendar date) {

        this.date = date;

    }

    public void setYMD(int year, int month, int day){
        date.set(year,month,day);
    }
    public String toString(){
        String str = date.get(Calendar.YEAR) + "/" + date.get(Calendar.MONTH) + "/" +(date.get(Calendar.DAY_OF_MONTH)+ 1) + "/" + "(" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
    return str;
    }
   private String getDay(int dayOfWeek) {

       switch (dayOfWeek) {
           case 1:
               return " Sunday ";
           case 2:
               return " Monday ";
           case 3:
               return " Tueday";
           case 4:
               return "  Wednesday ";
           case 5:
               return "Thursday ";
           case 6:
               return "Friday";
           case 7:
               return "Saturday";
           default: return "";
       }
   }
}