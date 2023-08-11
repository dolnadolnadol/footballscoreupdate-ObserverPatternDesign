import java.util.ArrayList;
import java.util.List;

class ScoreSource implements Source {
    private List<Observer> observers = new ArrayList<>();
    private String data;

    public String getData(){
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notify(getData());
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notify(String data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }
}