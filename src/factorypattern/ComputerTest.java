package factorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer= ComputerFactory.getComputer("PC");
        computer.getComputer();

        Computer computer1= ComputerFactory.getComputer("Server");
        computer1.getComputer();
    }
}
