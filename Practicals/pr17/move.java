class Animal
{
    void move()
    {
        System.out.println("Animals can move");
    }
}
class Dog extends Animal
{
    void move()
    {
        super.move();
        System.out.println("Dogs can walk & run");
    }
}
class move
{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();
    }
}