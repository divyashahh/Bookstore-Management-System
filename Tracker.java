package shahdivyaproject2;

import java.util.ArrayList;
public class Tracker {
private String customerName;
private ArrayList<Book> bookOrder = new ArrayList<>();
private ArrayList<Dvd> dvdOrder = new ArrayList<>();
private ArrayList<CD> cdOrder = new ArrayList<>();


Bookstore collection = new Bookstore();


public ArrayList<Dvd> getDvdOrder() {

return dvdOrder;
}

public ArrayList<Book> getBookOrder() {
return bookOrder;
}
public String getCustomerName() {
return customerName;
}
public ArrayList<CD> getCdOrder() {
return cdOrder;
}


public void setCustomerName(String customerName) {
this.customerName = customerName;
}


public void addDVDOrder(String addDVD){
int index = collection.findDVD(addDVD);
if (index != -1) {
dvdOrder.add(collection.dvdArrayList.get(index));
dvdOrder.get(dvdOrder.size() - 1).setnumberDVD(1);
}
}
public void addCDOrder(String addCD){
int index = collection.findCD(addCD);
if (index != -1) {
cdOrder.add(collection.cdArrayList.get(index));
cdOrder.get(cdOrder.size() - 1).setnumberCD(1);
}
}
public void addBookOrder(String addBook){
int index = collection.findBook(addBook);
if (index != -1) {
bookOrder.add(collection.bookArrayList.get(index));
bookOrder.get(bookOrder.size() - 1).setnumberBook(1);
}
}

public String toString() {
return "Tracker{" + "customerName=" + customerName + ", dvdOrder=" + dvdOrder + ", cdOrder=" + cdOrder + ", bookOrder=" + bookOrder + ", collection=" + collection + '}';
}
}








