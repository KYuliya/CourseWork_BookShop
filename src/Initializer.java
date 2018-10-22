import java.time.LocalDate;

public class Initializer {

    public static BookShop setInitialData() {
        //Создание книг
        Book book1 = new Book("Сияние", "Стивен Кинг");
        book1.setGenre(Genres.HORROR_AND_MYSTICISM);
        book1.setShortDescription("Сия́ние» — роман американского писателя Стивена Кинга, написанный в жанрах психологического ужаса и готической литературы");
        book1.setPrice(55);
        book1.setFirstPublication(1997);
        book1.setNumberOfPages(477);
        book1.setCountry("USE");
        book1.setRating(5);
        book1.setReviews("");
        book1.setScreenAdaptation("Сияние (1980 г.), Сияние (1997 г.)");

        Book book2 = new Book("Оно", "Стивен Кинг");
        book2.setGenre(Genres.HORROR_AND_MYSTICISM);
        book2.setShortDescription("В произведении затрагиваются важные для Кинга темы: власть памяти, сила объединенной группы, влияние травм детства на взрослую жизнь");
        book2.setPrice(150);
        book2.setFirstPublication(1986);
        book2.setNumberOfPages(1138);
        book2.setCountry("USA");
        book2.setRating(5);
        book2.setReviews("");
        book2.setScreenAdaptation(" Оно (1990 г.), Оно (2017 г.)");

        Book book3 = new Book("Анна Каренина", "Лев Толстой");
        book3.setGenre(Genres.REALISM);
        book3.setShortDescription("Роман Льва Толстого о трагической любви замужней дамы Анны Карениной и блестящего офицера Вронского");
        book3.setPrice(75);
        book3.setFirstPublication(1877);
        book3.setNumberOfPages(864);
        book3.setCountry("Russia");
        book3.setRating(4);
        book3.setReviews("");
        book3.setScreenAdaptation(" Анна Каренина (2012 г.)");

        Book book4 = new Book("Учитель", " Шарлотта Бронте");
        book4.setGenre(Genres.NOVEL);
        book4.setShortDescription("Книга рассказывает историю молодого человека, Уильяма Кримсворта. Описывается его взросление, любовь и карьера в качестве учителя в школе для девочек");
        book4.setPrice(40);
        book4.setFirstPublication(1857);
        book4.setNumberOfPages(330);
        book4.setCountry("England");
        book4.setRating(3);
        book4.setReviews("");
        book4.setScreenAdaptation("Screen adaptation of the book is missing");

        Book book5 = new Book("Черновик", "Сергей Лукьяненко");
        book5.setGenre(Genres.FANTASY);
        book5.setShortDescription("«Чернови́к» — роман Сергея Лукьяненко 2005 года о червоточинах между мирами");
        book5.setPrice(200);
        book5.setFirstPublication(2005);
        book5.setNumberOfPages(450);
        book5.setCountry("Russia");
        book5.setRating(5);
        book5.setReviews("");
        book5.setScreenAdaptation("Черновик (2018 г.)");

        BookShop bookShop = new BookShop();
        bookShop.addBook(book1);
        bookShop.addBook(book2);
        bookShop.addBook(book3);
        bookShop.addBook(book4);
        bookShop.addBook(book5);



        //Создание заказов
        Order order1 = new Order("Nick", "Smith", "NickSm@gmail.com", 990517210, LocalDate.now(),"Сергей Лукьяненко 'Черновик'", 200 );
        Order order2 = new Order("Victor", "Kuznetsov", "VictorKuzn@gmail.com", 940571094, LocalDate.now(),"Шарлотта Бронте 'Учитель'", 40);
        bookShop.addOrder(order1);
        bookShop.addOrder(order2);
        return bookShop;
    }
}
