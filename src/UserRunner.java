import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class UserRunner {
    public static void main(String[] args) {
        BookShop bookShop = Initializer.setInitialData();
        //bookShop.showAllBooks();

       // bookShop.findBookByName("Учитель");
bookShop.removeOrder(4);
bookShop.showAllOrder();
        //bookShop.showAllOrder();

        //bookShop.findOrderByID(10);


       // bookShop.findOrderByInfo("Сергей Лукьяненко 'Черновик'");

       // bookShop.removeOrder(2);
       // System.out.println("After delete");
       // bookShop.showAllOrder();

    }




}


