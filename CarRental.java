package carrental;

/**
 *
 * @author garynkuraija
 */
public class CarRental {
      String carArray[] = new String[CarRentalContract.carObjects];
    
    void addContract(CarRentalContract c1){

        for(int i=0; i<carArray.length; i++){
            carArray[i] = c1.toString(); 
        }
    }

    String displayContracts(){
          
        
        if(carArray.length > 0){
           for (String contract : carArray){
               
               System.out.println(contract);
            } 
        }
        else{            
            return "No Car Rental Contracts";
        }
        return "";
    }
     public static void main(String[] args) {
     Vehicle bencar = new Car("Blue",true);
     System.out.println(bencar.toString());
     
     Vehicle petetruck = new Truck("Black",false);
     System.out.println(petetruck.toString()); 
     
     GarageTester garagetester = new GarageTester();
     System.out.println("Garage Tester: "+garagetester.getExample());
     
     Customer customer1 = new Customer("Harlow","nairobi");
     Customer customer2 = new Customer("Magic Mike","capetown");
     
     Vehicle nissan = new Car("Green",true);
     CarRentalContract crcontract1 = new CarRentalContract(customer2,nissan);
     
     CarRental carrental1 = new CarRental();
     carrental1.addContract(crcontract1);
     
     System.out.println("My Contracts:");
     System.out.println(carrental1.displayContracts());
        
  
    }
    
}
class Vehicle {
    String color = "Red";
    
    String getColor(String mycolor){
        
        return mycolor;
    }
    public String toString(){
        
        return "This Vehicle is "+getColor(color);
    }
}

class Car extends Vehicle {
    
    boolean hasWinterTires = false;
    
    Car(String carcolor,boolean hasWint){
        
        this.color = carcolor;
        hasWinterTires = hasWint;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" Has Winter Tires "+hasWinterTires;
    }
}
class Truck extends Vehicle {
    boolean hasTrailer = false;
    
    Truck(String TruckColor,boolean hasTrail){
        this.color = TruckColor;
        hasTrailer = hasTrail;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" has Trailer: "+hasTrailer;
    }
}

class Garage {
   
    Vehicle vehicle1 = new Car("Blue",true);
    Vehicle vehicle2 = new Truck("Brown",true);


    public String setVehicle(Vehicle parked){
       return parked.toString();
               
    }
    public String toString(){ 
       return "Description of the parked vehicle "+vehicle2.toString()+vehicle1.toString();  
    }
     
}
class GarageTester {
    public String getExample(){
        Truck truck1 = new Truck("Black",true);

        Garage garage1 = new Garage();
        return garage1.setVehicle(truck1);
    }
}

class Customer {
    
    String name;
    String address;
    
    Customer(String custname, String custAddress){
        name = custname;
        address = custAddress;
    }
    
    
}

class CarRentalContract {
   
    Customer custmomer1; 
    Vehicle vehicle0; 
    
    CarRentalContract(Customer gustavo , Vehicle raum)
    {
        custmomer1 = gustavo;
        vehicle0 = raum;
    }
    
    
    static int carObjects = 0; 
    { 
        carObjects += 1; 
    }
    public String toString(){
        
        return custmomer1.name+" : "+vehicle0.toString();
    }
    
}

