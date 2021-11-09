import java.util.ArrayList;
import  java.util.Collections;

public class Book {
    String book_name;
    String autor;
    int date;
    String publishing_house;
    int price;
    String condition;
    int delivery_date;

    public Book(String book_name, String autor, int date, String publishing_house, int price, String condition, int delivery_date) {
        this.setBook_name(book_name);
        this.setAutor(autor);
        this.setDate(date);
        this.setPublishing_house(publishing_house);
        this.setPrice(price);
        this.setCondition(condition);
        this.setDelivery_date(delivery_date);
    }

    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name=book_name;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor= autor;
    }

    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date=date;
    }

    public String getPublishing_house() {
        return publishing_house;
    }
    public void setPublishing_house(String publishing_house) {
        this.publishing_house=publishing_house;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition=condition;
    }

    public int getDelivery_date(){
        return delivery_date;
    }
    public void setDelivery_date(int delivery_date){
        this.delivery_date=delivery_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_name='" + book_name + '\'' +
                ", autor='" + autor + '\'' +
                ", date=" + date +
                ", publishing_house='" + publishing_house + '\'' +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                ", delivery_date=" + delivery_date +
                '}';
    }
}
