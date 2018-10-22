

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private final List<Book> books = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    //Book
    public void addBook(Book book) {
        books.add(book);
    }

//    public void removeBook(String name, String author){
//        books.remove();
//    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void findBookByName(String name) {
        Book res = null;
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                res = book;
            }
        }
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("Book " + res.getName() + " not found!");
        }
    }

//    public void findBookByInfo(String infoTheBook) {
//        Book res = null;
//        for (Book book : books) {
//            if (book.getName().equalsIgnoreCase(infoTheBook)) {
//                res = book;
//            }
//        }
//        if (res != null) {
//            System.out.println(res);
//        } else {
//            System.out.println("Book " + res+ " not found!");
//        }
//    }



//    public List<Order> findOrderByInfo(String infoTheBook) {
//        List<Order> orders = new ArrayList<>();
//        for (Order order : this.orders) {
//            if (order.getInfoTheBook().equalsIgnoreCase(infoTheBook)) {
//                orders.add(order);
//            }else {
//                System.out.println("Book " + infoTheBook + " not found!");
//            }
//        }
//        return orders;
//    }

    //Order
    public void addOrder(Order order) {
        orders.add(order);
    }


    public void removeOrder(int id) {
        try {
            Order order = orders.get(id - 1);
            orders.remove(order);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("A book with ID " + id + " this does not exist");
        }
    }

    public void showAllOrder() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public Order findOrderByID(int ID) {
        Order res = null;
        for (Order order : orders) {
            if (order.getID() == ID) {
                res = order;
                System.out.println("Book with ID - " + ID + " found" );
            }
        }
        if (res != null){
            System.out.println(res);
        }else {
            System.out.println("Book with ID - " + ID + " not found");
        }
        return res;
    }


}
