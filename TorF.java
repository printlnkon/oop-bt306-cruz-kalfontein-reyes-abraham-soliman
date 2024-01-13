class cast {
    public void dialogue () {
        System.out.println("Override me please");
    }

}

class Aljur extends cast {
    public void dialogue () {
        System.out.println("Aljur : Ako si aljur gusto mo ba ng hotdog ko?");
    }
}

class MangJohnny extends cast {
    public void dialogue () {
        System.out.println("Mang Johnny : Im multiple profesion Im mang johny");
    }
}

class bata extends cast {
    public void dialogue () {
        System.out.println("Bata : yeah boy baby boy baby boy");
    }
}

class bathala extends cast {
    public void dialogue () {
        System.out.println("Bathala : Bat di ko naisip na meron hangan\n" + "Ako yung nauna, Pero siya ang wakas");
    }
}

public abstract class TorF extends Player {

    public TorF (String name) {
        super(name);
    }

    public abstract void intro ();

    public abstract void outro ();

    public abstract void outro1 ();

    public abstract void outro2 ();

    public abstract void end ();

    public abstract void end1 ();

    public abstract void end2 ();

    public abstract void end3 ();

    public abstract void end4 ();

    public abstract void end5 ();

    public abstract void finished ();

    public abstract void finished1 ();

    public abstract void finished2 ();

    public abstract void finished3 ();

    public abstract void finished4 ();

    public abstract void finished5 ();

    public static void win () {
        System.out.println(name + ", " + "You have won. Congratulations!");
    }

    public static void lose () {
        System.out.println(name + ", " + "You have lost. Better luck next time.");
    }
}
