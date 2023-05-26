package GroupProject2;

public abstract class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
     */
    double carPrice;
    String color;



    abstract double calculatePrice();

}
class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        this.carPrice = carPrice;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        double discount;
        if (weight > 2000) {
            discount = this.carPrice * .1;
            this.carPrice = carPrice - discount;
        } else {
            discount = this.carPrice * .2;
            this.carPrice = carPrice - discount;
        }
        return this.carPrice;
    }
}

class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color,double length) {
       this.carPrice=carPrice;
        this.length=length;
        this.color=color;
    }

    @Override
    public double calculatePrice(){
        double discount;
        if (length>20){
            discount=(carPrice*.05);
            this.carPrice=carPrice-discount;
        }
        else {
            discount=this.carPrice*.1;
            this.carPrice=carPrice-discount;
        }
        return this.carPrice;
    }

}
class Tester{
    public static void main(String[] args) {
        Sedan car=new Sedan(2000,"blue",60.4);
        double result=car.calculatePrice();
        System.out.println(result);
        Truck truck =new Truck(3000,"red",5000);
        double total= truck.calculatePrice();
        System.out.println(total);
    }
}
