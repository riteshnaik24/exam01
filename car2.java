class car2{
    void fullthrottle(){
        System.out.println("car is moving very fast");
    }
    void maxspeed(int speed){
        System.out.println("maxspeed is :"+speed);
    }
public static void main(String[] args) {
    car2 mycar=new car2();
    mycar.fullthrottle();
    mycar.maxspeed(160);
}
}