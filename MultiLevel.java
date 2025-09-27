import java.lang.*;

class A{
    void java(){
        System.out.println("Java dynamic programming");
    }
}

class B extends A{
    void javaScript(){
        System.out.println("javaScript are the scripting language and create web sides");
    }
}

class C extends B{
    void Node(){
        System.out.println("Node js used manage backend and create backend to your web sides");
    }
}
public class MultiLevel {
    public static void main(String[] args) throws Exception{
        C obj = new C();
        obj.java();
        obj.javaScript();
        obj.Node();
    }
}
