public class Lab77MyDogTest {
    public static void main(String[] args) {
        MyDog dog = new MyDog("Deang");

        act1(dog);
        act2(dog);
        act3(dog);
        act4(dog);
    }
    private static void act1(MyDog dog){
        dog.bark();
    }
    private static void act2(MyDog dog){
        dog.fetch();
    }
    private static void act3(MyDog dog){
        dog.swim();
    }
    private static void act4(MyDog dog){
        System.out.printf("%s is ", dog.getName());
        dog.bark();
    }
}
