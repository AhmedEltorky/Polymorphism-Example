package polymorphismexample;

import animal.Animal;
import animal.Dog;
import animal.Kangaroo;

/**
 *
 * @author Ahmed El-Torky
 */
public class PolymorphismExample {

    public static void main(String[] args) {

        Dog d = new Dog(12);
        Kangaroo k = new Kangaroo(12);
        poly(d);
        poly(k);
        System.out.println(d.equals(k));
        System.out.println(k.equals(d));
        System.out.println(d.toString());
        System.out.println(k.toString());

    }

    public static void poly(Animal animal) {
        animal.eat();
    }

}
