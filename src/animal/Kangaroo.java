package animal;

import function.Jumber;

/**
 *
 * @author Ahmed El-Torky
 */
public class Kangaroo extends Animal implements Jumber {

    public Kangaroo(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("Kangaroo is eating");
    }

    @Override
    public void jump() {
        System.out.println("Kangaroo is jumbing");
    }
    
}
