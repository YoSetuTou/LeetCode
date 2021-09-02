package code;

import java.util.ArrayList;

public class Database {
   private ArrayList<CD> listCD = new ArrayList<CD>();
   private ArrayList<DVD>  listDVD = new ArrayList<DVD>();
   public void add(CD cd){
      listCD.add(cd);
   }
   public void list(){
      for(CD cd : listCD){
         cd.print();
      }
   }

   public static void main(String[] args) {
      Database db = new Database();
      db.add(new CD("败类", "凌飞俊逸", 4 , 5, "111111"));
      db.list();
      db.add(new DVD("dsaas","dsad",1,"22222222"));
      db.list();
   }

   private void add(DVD dvd) {
      listDVD.add(dvd);
   }

}
