package animal;

/**
 *
 * @author Ahmed El-Torky
 */
public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void attack() {
        System.out.println("Dog is attacking");
    }
}
