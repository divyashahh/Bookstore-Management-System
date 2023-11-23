package shahdivyaproject2;

public class Book {
private String name;
private int numberBooks;
private double price;


public Book(String bookName, int numberBooks, double bookPrice){
this.name = bookName;
this.numberBooks = numberBooks;
this.price = bookPrice;
}
public String getName(){
return this.name;
}
public int getnumberBook(){
return this.numberBooks;
}
public void setnumberBook(int i){
this.numberBooks = i;
}
public void decreasenumberBook(int i){
this.numberBooks -= i;
}
public double getPrice(){
return this.price;
}
public void setPrice(double i){
this.price = i;
}
public String toString() {
return "Books{" + "name=" + name + ", numberBooks=" + numberBooks + ", price=" + price + '}';
}
}
package shahdivyaproject2;

public class Book {
private String name;
private int numberBooks;
private double price;


public Book(String bookName, int numberBooks, double bookPrice){
this.name = bookName;
this.numberBooks = numberBooks;
this.price = bookPrice;
}
public String getName(){
return this.name;
}
public int getnumberBook(){
return this.numberBooks;
}
public void setnumberBook(int i){
this.numberBooks = i;
}
public void decreasenumberBook(int i){
this.numberBooks -= i;
}
public double getPrice(){
return this.price;
}
public void setPrice(double i){
this.price = i;
}
public String toString() {
return "Books{" + "name=" + name + ", numberBooks=" + numberBooks + ", price=" + price + '}';
}
}
