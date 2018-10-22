public class Book {
    private  String name;
    private  String author;
    private  Genres genre;
    private  String shortDescription; //краткое описание
    private int price;
    private  int firstPublication; //первая публикация (год выхода книги)
    private  int numberOfPages;
    private  String country;
    private int rating;
    private String reviews;//отзывы
    private String screenAdaptation; //Экранизация



    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be a negative number: " + price);
        }
        this.price = price;
    }

    public int getFirstPublication() {
        return firstPublication;
    }

    public void setFirstPublication(int firstPublication) {
        this.firstPublication = firstPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getScreenAdaptation() {
        return screenAdaptation;
    }

    public void setScreenAdaptation(String screenAdaptation) {
        this.screenAdaptation = screenAdaptation;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\n Information about the book: " +
                "\n1. Name = " + name +
                "\n2. Author = " + author +
                "\n3. Genres = " + genre +
                "\n4. ShortDescription = '" + shortDescription +
                "\n5. Price = " + price +
                "\n6. FirstPublication = " + firstPublication +
                "\n7. NumberOfPages = " + numberOfPages +
                "\n8. Country = " + country +
                "\n9. Rating = " + rating +
                "\n10. Reviews = " + reviews +
                "\n11. ScreenAdaptation = '" + screenAdaptation +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
