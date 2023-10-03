public class MyDog extends Dog implements CanSwim, CanFetch {
    public MyDog(String name){
        super(name);
    }
    @Override
    public void swim() {
        System.out.printf("%s is swiming.\n", super.getName());
    }
    @Override
    public void fetch() {
        System.out.printf("%s is fetching.\n", super.getName());
    }
}
