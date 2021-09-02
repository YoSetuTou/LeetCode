package code;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<>();
    public void add(String s){
        notes.add(s);
    }
    public void add(String s,int location){
        notes.add(location,s);
    }
    public String getNoet(int index){
        return notes.get(index);
    }

    public void remove(int index){
        notes.remove(index);

    }

    public int getSize(){
        return notes.size();
    }

    public  String[] list(){
        String[] s = new String[notes.size()];
//        for (int i = 0 ; i < notes.size(); i++) {
//            s[i] = notes.get(i);
//        }
        notes.toArray();
        return s;
    }

    public static void main(String[] args) {
        String[] a = new String[2];
        a[0]    = "First";
        a[1]    ="Second";
        NoteBook note = new NoteBook();
        note.add("First");
        note.add("Second");
        System.out.println(note.getSize());
        System.out.println(note.getNoet(1));
        String[] b = note.list();
        for (String k:
             b) {
            System.out.println(k);
        }
    }
}
