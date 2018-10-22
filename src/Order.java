import java.time.LocalDate;
import java.util.ArrayList;



public class Order {

    private  String name;
    private  String surname;
    private  String mail;
    private  long phoneNumber;
    private LocalDate date;

    private String infoTheBook; //information about the book
    private long price;

    private static int nextId = 1;
    private int ID = nextId++;

    public Order(String name, String surname, String mail, long phoneNumber, LocalDate date, String infoTheBook, long price) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.infoTheBook = infoTheBook;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getInfoTheBook() {
        return infoTheBook;
    }

    public void setInfoTheBook(String infoTheBook) {
        this.infoTheBook = infoTheBook;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public static int getNextId() {
        return nextId;
    }



    public int getID() {
        return ID;
    }

    //    private long getTotalSum(ArrayList<Book> books){
//        long totalSum = 0;
//        for (Book book : books){
//            totalSum += book.getPrice();
//        }
//        return totalSum;
//    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\n Information about the order: " +
                "\n1. Name = " + name +
                "\n2. Surname = " + surname +
                "\n3. Mail = " + mail +
                "\n4. PhoneNumber = 0"  + phoneNumber +
                "\n5. Date = " + date +
                "\n6. InfoTheBook = " + infoTheBook +
                "\n7. totalPrice = " + price +
                "\n8. ID = " + ID +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
