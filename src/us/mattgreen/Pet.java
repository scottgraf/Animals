package us.mattgreen;

/**
 * @author Scott Graf
 */
public abstract class Pet {
    protected String name;
    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}