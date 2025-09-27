import java.lang.*;

class Ex{
    void display(){
        System.out.println("Hello Amit");
    }
}

class Exx extends Ex{
    void show(){
        System.out.print("java dynamic programming language");
    }
}
public class SingleInheritance {
    public static void main(String[] args) throws Exception{
        Exx E = new Exx();
        E.display();
        E.show();
    }
}
