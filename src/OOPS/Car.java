package OOPS;

public class Car {
    public static void main(String[] args) {
        Cars car1 = new Cars("maybach" ,"red" , 250);
        Cars car2 = new Cars("BMW" ,"Blue" , 305);
        Cars car3 = new Cars("Lambhorghini" ,"pink" , 325);
        Cars car4 = new Cars("Thar" ,"Black" , 155);
        Cars car5 = new Cars("bughati" ,"Purple" , 490);

        car1.display();
        car2.display();
        car3.display();
        car4.display();
        car5.display();
    }

}
class Cars{
    String brand;
    String color;
    int speed;

    Cars(String brand ,String color,int speed){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
    }

    void display(){
        System.out.println(brand+ " "+ color+ " "+ speed);
    }

}
