package polymorphism;

public class Polymorphism_JC extends Polymorphism_Student{   //child class
    Polymorphism_Zyrel(String name){
        super(name);
    }
    @Override
    void coding(){
        System.out.println(name + " kay gasakit ang tiyan");
    }    
    @Override
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
}