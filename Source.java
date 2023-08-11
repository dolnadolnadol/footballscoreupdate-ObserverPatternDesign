public interface Source {
    public void register(Observer observer);
    public void notify(String data);
}