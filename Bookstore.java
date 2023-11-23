package shahdivyaproject2;

import java.util.ArrayList;
public class Bookstore {
public ArrayList<Dvd> dvdArrayList = new ArrayList<>();
public ArrayList<CD> cdArrayList = new ArrayList<>();
public ArrayList<Book> bookArrayList = new ArrayList<>();
ArrayList <Member> memberArrayList = new ArrayList<>();
ArrayList <Premium> premiumArrayList = new ArrayList<>();


public Bookstore () {
dvdArrayList.add(new Dvd ("Hush" , 20 , 4.99));
dvdArrayList.add(new Dvd ("Rush Hour" , 20 , 6.99));
dvdArrayList.add(new Dvd ("Fast and Furious" , 20 , 5.99));
cdArrayList.add(new CD ("Utopia" , 30 , 20.99));
cdArrayList.add(new CD ("a Gift and a Curse" , 30 ,18.89));
cdArrayList.add(new CD ("Astroworld" , 30 , 19.89));
bookArrayList.add(new Book ("It ends with us" , 50 , 9.99));
bookArrayList.add(new Book ("It starts with us" , 50 , 8.89));
bookArrayList.add(new Book ("Verity" , 50 , 4.79));


}


public ArrayList<Dvd> getDvdArrayList() {
return dvdArrayList;
}


public ArrayList<CD> getCdArrayList() {
return cdArrayList;
}


public ArrayList<Book> getBookArrayList() {
return bookArrayList;
}


public void addDvd(String name, int numberDVD, double price){
dvdArrayList.add(new Dvd(name, numberDVD, price));
}


public void addCD(String name, int numberCD, double price){
cdArrayList.add(new CD(name, numberCD, price));
}

public void addBook(String name, int numberBooks, double price){
bookArrayList.add(new Book(name, numberBooks, price));
}
public void removeDVD(String remove, int j){
int removeDVD = -1;
for (int i = 0; i < dvdArrayList.size(); i++){
if (dvdArrayList.get(i).getName().equalsIgnoreCase(remove)){
removeDVD = i;
}
}
dvdArrayList.get(removeDVD).decreasenumberDVD(j);
}
public void removeCd(String remove, int j){
int removeCD = -1;
for (int i = 0; i < cdArrayList.size(); i++){
if (cdArrayList.get(i).getName().equalsIgnoreCase(remove)){
removeCD = i;
}
}
cdArrayList.get(removeCD).decreasenumberCD(j);
}

public void removeBook(String remove, int j){
int removeBook = -1;
for (int i = 0; i < dvdArrayList.size(); i++){
if (bookArrayList.get(i).getName().equalsIgnoreCase(remove)){
removeBook = i;
}
}
bookArrayList.get(removeBook).decreasenumberBook(j);
}
public int findCD(String name){
for (int i = 0; i < cdArrayList.size(); i++){
if (cdArrayList.get(i).getName().equalsIgnoreCase(name)){
return i;
}


}
return -1;


}
public int findBook(String name){
for (int i = 0; i < bookArrayList.size(); i++){
if (bookArrayList.get(i).getName().equalsIgnoreCase(name)){
return i;
}


}
return -1;


}

public int findDVD(String name){
for (int i = 0; i < dvdArrayList.size(); i++){
if (dvdArrayList.get(i).getName().equalsIgnoreCase(name)){
return i;
}


}
return -1;


}



public ArrayList<Premium> getPremiumList(){
return premiumArrayList;
}
public ArrayList<Member> getMemberList(){
return memberArrayList;
}
public int findMember(String name){
for (int i = 0; i < memberArrayList.size(); i++){
if (memberArrayList.get(i).getName().equalsIgnoreCase(name)){
return i;
}
}
return -1;
}
public int findPremium(String name){
for (int i = 0; i < premiumArrayList.size(); i++){
if (premiumArrayList.get(i).getName().equalsIgnoreCase(name)){
return i;
}
}
return -1;
}

public void addPremium(String name, double moneySpent){
Premium customer = new Premium(name, moneySpent);
premiumArrayList.add(customer);
}
public void addMember(String name, double moneySpent){
Member customer = new Member(name, moneySpent);
memberArrayList.add(customer);
}
}
