package shahdivyaproject2;

public class Premium {
private String name;
private double moneySpent;
private double fee;
public Premium(String name, double moneySpent){
this.name = name;
this.moneySpent = moneySpent;
this.fee = 23.89;
}
public String getName(){
return name;
}


public void setName(String name){
this.name = name;
}


public double getHowMuchSpent(){
return moneySpent;
}


public void setHowMuchSpent(double moneySpent){
this.moneySpent += moneySpent;
}


public double getFee(){
return fee;
}


public void setFee (double fee){
this.fee = fee;
}


public String toString() {
return "Premium{" + "name=" + name + ", moneySpent=" + moneySpent + ", fee=" + fee + '}';
}
}


