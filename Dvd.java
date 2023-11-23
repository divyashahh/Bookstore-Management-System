package shahdivyaproject2;
public class Dvd {
private String name;
private int numberDVD;
private double price;


public Dvd(String DVDName, int numberDVD, double DVDPrice){
this.name = DVDName;
this.numberDVD = numberDVD;
this.price = DVDPrice;
}
public String getName(){
return this.name;
}
public int getnumberDVD(){
return this.numberDVD;
}
public void setnumberDVD(int i){
this.numberDVD = i;
}
public void decreasenumberDVD(int i){
this.numberDVD -= i;
}
public double getPrice(){
return this.price;
}
public void setPrice(double i){
this.price = i;
}
public String toString() {
return "DVD{" + "name=" + name + ", numberDVD=" + numberDVD + ", price=" + price + '}';
}


}


