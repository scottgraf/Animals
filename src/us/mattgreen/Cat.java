package us.mattgreen;

/**
 *@author Scott Graf
*/

public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    public int getMousesKilled() {
        return mousesKilled;
    }

    public void addMouse() {
        mousesKilled++;
    }

    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *
     * @return the objects name and mouseskilled
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

