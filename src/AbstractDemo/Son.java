package AbstractDemo;

public class Son extends Parent {

//    void normal(int age){
//        super(age);
//    }
    public Son(int age) {
  //      System.out.println("lkdgnjlg"); //gives ann error fitsr statememnt must be the super.
        super(age);
    }

    @Override
    void carrer(String name) {
        System.out.println("My Interst is in " + name);
    }




//    @Override
    void normal() {
        super.normal();
    }

    @Override
    void partner(String name, int age) {

        System.out.println("I Love " + name + " she is " + age);
    }
}
