package observerpattern;

/**
 * Created by hiteshs on 2/20/18.
 */
public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
