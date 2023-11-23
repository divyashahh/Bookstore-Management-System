package shahdivyaproject2;
import java.util.ArrayList;
import java.util.Scanner;


public class TestHarness {
public static void main(String[] args) {
Bookstore collection = new Bookstore();
ArrayList <Member> memberArrayList = new ArrayList<>();
ArrayList <Premium> premiumArrayList = new ArrayList<>();
int exit = 0;
while (exit != 1) {
Scanner scanner = new Scanner(System.in);
System.out.println("This is my BookStore! Please pick an option below! ");
System.out.println("1. Become a Member");
System.out.println("2. I want to see some options");
System.out.println("3. I want to check out the items");
System.out.println("4. I want to leave the store");


int choice = scanner.nextInt();
switch(choice){
case 1:
System.out.println("What is your name: ");
String name = scanner.next();
System.out.println("Would you like to become a premium member? It is $10.99 a month! Enter 1 for yes and 2 for no.");
int premium = scanner.nextInt();
if (premium == 1){
premiumArrayList.add(new Premium(name, 0));
}
else {
memberArrayList.add(new Member(name, 0));
}
break;
case 2:
System.out.println("These are your options");
for (int i = 0; i < collection.getBookArrayList().size(); i++)
{
System.out.println(collection.bookArrayList.get(i));
}
for (int i = 0; i < collection.getCdArrayList().size(); i++) {
System.out.println(collection.cdArrayList.get(i));
}
for (int i = 0; i < collection.getDvdArrayList().size(); i++) {
System.out.println(collection.dvdArrayList.get(i));
}
for (int i = 0; i < collection.getMemberList().size(); i++) {
System.out.println(collection.getMemberList().get(i));
}
for (int i = 0; i < collection.getPremiumList().size(); i++) {
System.out.println(collection.getPremiumList().get(i));
}
break;
case 3:
Tracker cart = new Tracker();
boolean premiumOption = false;
String customerName;
System.out.println("Are you already a store member? Please type 1 for yes and 2 for no.");
int memberAnswer = scanner.nextInt();
if (memberAnswer == 1){
System.out.println("Please enter your name?");
customerName = scanner.next();
cart.setCustomerName(customerName);
System.out.println("Enter 1 if you are a premium member, and 2 if you aren't.");
if (memberAnswer == 1){
premiumOption = true;
}
memberAnswer = scanner.nextInt();
} else if (memberAnswer == 2){
System.out.println("Please enter your name?");
customerName = scanner.next();
System.out.println(" Enter 1 if you would like to become a premium member and 2 if not.");
memberAnswer = scanner.nextInt();
cart.setCustomerName(customerName);
if (memberAnswer == 1){
collection.addPremium(customerName, 0);
premiumOption = true;
} else {
collection.addMember(customerName, 0);
}
}


int placeOrder = 0;
while (placeOrder == 0){
System.out.println("Choose from the following: Cds, DVDs, or Books");
System.out.println("1. Buy Books");
System.out.println("2. Buy DVDs");
System.out.println("3. Buy CDs");
System.out.println("4. I would like to look at my cart");
System.out.println("5. Finalize my purchase");
int orderType = scanner.nextInt();
scanner.nextLine();
if (orderType == 1){
System.out.println("What book do you want to order: ");
String nameBook = scanner.nextLine();
cart.addBookOrder(nameBook);
}
else if (orderType == 2){
System.out.println("What DVD do you want to order: ");
String nameDVD = scanner.nextLine();
cart.addCDOrder(nameDVD);
}
else if (orderType == 3){
System.out.println("What CD do you want to order: ");
String nameCD = scanner.nextLine();
cart.addDVDOrder(nameCD);
}
else if (orderType == 4){
System.out.println(cart);
}
else if (orderType == 5){
double totalPrice = 0;
if (!cart.getCdOrder().isEmpty()) {
for (int i = 0; i < cart.getCdOrder().size(); i++) {
totalPrice += cart.getCdOrder().get(i).getPrice();
collection.removeCd(cart.getCdOrder().get(i).getName(), 1);
}
}
if (!cart.getBookOrder().isEmpty()) {
for (int i = 0; i < cart.getBookOrder().size(); i++) {
totalPrice += cart.getBookOrder().get(i).getPrice();
collection.removeBook(cart.getBookOrder().get(i).getName(), 1);
}
}
if (!cart.getDvdOrder().isEmpty()) {
for (int i = 0; i < cart.getDvdOrder().size(); i++) {
totalPrice += cart.getDvdOrder().get(i).getPrice();
collection.removeDVD(cart.getDvdOrder().get(i).getName(), 1);
}
}
if (premiumOption) {
System.out.println("Total Price: " + totalPrice);
if (collection.findPremium(cart.getCustomerName()) != -1)
collection.getPremiumList().get(collection.findPremium(cart.getCustomerName())).setHowMuchSpent(totalPrice);
else {
collection.addPremium(cart.getCustomerName(), 0);
collection.getPremiumList().get(collection.findPremium(cart.getCustomerName())).setHowMuchSpent(totalPrice);
}
} else {
System.out.println("Total Price: " + totalPrice);
if (collection.findMember(cart.getCustomerName()) != -1) {
collection.getMemberList().get(collection.findMember(cart.getCustomerName())).setHowMuchSpent(totalPrice);
}
else {
collection.addMember(cart.getCustomerName(), 0);
collection.getMemberList().get(collection.findMember(cart.getCustomerName())).setHowMuchSpent(totalPrice);
}
}
break;
}
}
break;
case 4:
System.out.println("ThankS for coming! Visit again soon!");
exit = 1;
break;
default:
exit = 1;


}
}
}
}
