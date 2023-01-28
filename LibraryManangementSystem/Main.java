import model.Books;
import model.Order;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Books book1= new Books("Novel", "Fiction", "Counting Stars", 1150, 2211);
        Books book2= new Books("Novel", "Science fiction", "A Wrinkle in time", 500, 2134);
        Books book3= new Books("Solution set", "Academics", "Chemistry numericals", 700, 6473);
        Books book4= new Books("Novel", "non fiction", "Holes", 1200, 1526);
        ArrayList<Books> booksArrayList1 = new ArrayList<>();
        ArrayList<Books> booksArrayList2 = new ArrayList<>();
        booksArrayList1.add(book1);
        booksArrayList1.add(book2);
        booksArrayList2.add(book3);
        booksArrayList2.add(book4);
        User usr1= new User("Shreya Manandhar", 1111, booksArrayList1);
        User usr2= new User("Arun Shahi", 2222, booksArrayList2);
        ArrayList<User> us1 = new ArrayList<>();
        ArrayList<User> us2 = new ArrayList<>();
        us1.add(usr1);
        us2.add(usr2);
        Order odr1=new Order(11, us1);
        Order odr2=new Order(12, us2);
        odr1.listUser();
        book1.getInfo();
        book2.getInfo();

        odr2.listUser();
        book3.getInfo();
        book4.getInfo();



    }
}
