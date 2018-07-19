package animal;

/**
 *
 * @author Ahmed El-Torky
 */
public abstract class Animal {

    private int age;

    public abstract void eat();

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            if (((Animal) obj).getAge() == this.getAge()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Age of animal = " + this.getAge() + " year";
    }

}
