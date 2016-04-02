package Pattern.observer;

/**
 * Created by ADMIN on 03.04.16.
 */
public interface Observer {
    void update(int temperature, int humidity, int pressure);
}