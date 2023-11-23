package shahdivyaproject2;
public class CD {
private String name;
private int numberCD;
private double price;


public CD(String CDName, int numberCD, double CDPrice){
this.name = CDName;
this.numberCD = numberCD;
this.price = CDPrice;
}
public String getName(){
return this.name;
}
public int getnumberCD(){
return this.numberCD;
}
public void setnumberCD(int i){
this.numberCD = i;
}
public void decreasenumberCD(int i){
this.numberCD -= i;
}
public double getPrice(){
return this.price;
}
public void setPrice(double i){
this.price = i;
}
public String toString() {
return "CD{" + "name=" + name + ", numberCD=" + numberCD + ", price=" + price + '}';
}


}








