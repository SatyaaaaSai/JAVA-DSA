package AbstractDemo;

public abstract class Parent {
     int age;
    abstract void carrer(String name);
    abstract void partner(String name,int age);

    public Parent(int age) { //You Can Create The Abstract Constructors. Call In Subclasses With Super keyword.
        this.age=age;
    }

    static void hello(){ //you can create static functions in abstract classes.
        //IMP POINT:::: you cant create the abstract static method...

        System.out.println("hello! I Am in the parent classes");
    }

    void normal(){
        System.out.println("i am a Normal Method!!");
    }
}

