import java.util.*;
class vector2
{
    public static void main(String[] args) 
    {
        Vector <String> v = new Vector<String>();
        v.add("Dinasour");
        v.add("Dragon");
        v.add("Trex");
        System.out.println("Elements of vector : "+v);
        System.out.println("Size of vector : "+v.size());
        System.out.println("Capacity of Vector : "+v.capacity());
        v.insertElementAt("Egg", 2);
        v.addElement("Astroid");
        v.addElement("Zebra");
        System.out.println("Elements after adding : "+v);
        System.out.println("Size after adding elements : "+v.size());
        System.out.println("Capacity after adding : "+v.capacity());
        System.out.println("First Element : "+v.firstElement()+"\nLast Element : "+v.lastElement());
    }
}
