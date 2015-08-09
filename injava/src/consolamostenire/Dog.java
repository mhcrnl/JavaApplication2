package consolamostenire;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class Dog extends Mamal {
    @Override
    public void latra() {
        //super.latra();
        System.out.println("Dog latra ca un caine");
    }

    public static void main (String args[]){


        Animal a = new Animal();
        Animal am = new Mamal();
        Mamal m = new Mamal();
        Dog d = new Dog();
        Reptile r = new Reptile();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mamal);
        System.out.println(d instanceof Animal);

        a.latra();
        a.mananca();
        am.latra();

        m.latra();
        m.mananca();

        d.latra();
        d.mananca();

        r.latra();
        r.mananca();
    }


}