import javax.print.DocFlavor.STRING;

class Animal {
    void aName(){
        System.out.println("CAT");
        System.out.println("Elephant");
        System.out.println("Loin");
        System.out.println("Tiger");
    }
}
class Cat extends Animal{
    void cat() {
        System.out.println("cat is a pet animal");
        System.out.println("cat are many color");
    }
}
class Elephant extends Animal{
    void elephant(){
        System.out.println("Elephant is a big animal in the earth");
    }
}

class Lion extends Animal {
    void lion(){
        System.out.println("Lion is the king of animals and forest");
    }
}

class Tiger extends Animal{
    void tiger(){
        System.out.println("Tiger is the most strong animal");
    }
}
public class Highherical {
    public static void main(String[] args){
        Cat c = new Cat();
        Elephant e = new Elephant();
        Lion l = new Lion();
        Tiger t = new Tiger();

        c.aName();
        c.cat();
        e.aName();
        e.elephant();
        l.aName();
        l.lion();
        t.aName();
        t.tiger();
    }
}
