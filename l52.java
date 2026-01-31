import java.util.*;

interface motor
{
    int capacity = 5;
    void run();
    void consume();
}

class washingMachine implements motor {
    public void run() {
        System.out.println("The motor is running: ");
    }

    public void consume() {
        System.out.println("The motor consume: " + capacity);
    }
}

public class l52
{
    public static void main(String[] args)
    {
        motor m1 = new washingMachine();
        m1.run();
        m1.consume();
    }
}