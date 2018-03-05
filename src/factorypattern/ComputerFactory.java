package factorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class ComputerFactory {

    public static Computer getComputer(String type){
        if(type.equalsIgnoreCase("PC"))
            return new PersonalComputer();
        else if(type.equalsIgnoreCase("Server"))
            return new Server();
        return null;
    }
}
