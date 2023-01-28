package model;

import java.util.ArrayList;

public class Order {
    int order_no;

    ArrayList<User> User;

    public Order(int order_no, ArrayList<model.User> user) {
        this.order_no = order_no;
        User = user;
    }

    public int getorder_no() {
        return order_no;
    }

    public void setorder_no(int order_no) {
        this.order_no = order_no;
    }

    public ArrayList<model.User> getUser() {
        return User;
    }

    public void setUser(ArrayList<model.User> user) {
        User = user;
    }

    public void listUser() {
        ArrayList<User> cl = this.User;

        for (User  c : cl) {
            System.out.println("Username: "+c.Name);
            System.out.println("User ID: "+c.userID +"\n"+ "Books Taken:");

        }

    }


}
