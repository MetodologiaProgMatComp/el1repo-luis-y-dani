package clases.AuthorBook;

import clases.AuthorBook.Author;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String i, String n, Author a, double p){
        isbn = i;
        name = n;
        author = a;
        price = p;
    }
    public Book (String i, String n, Author a, double p, int q){
        isbn = i;
        name = n;
        author = a;
        price = p;
        qty = q;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String toString(){
        return "Book[isbn="+isbn+", name="+name+"]"+author.toString()+",price="+price+", qty="+qty;
    }
}
