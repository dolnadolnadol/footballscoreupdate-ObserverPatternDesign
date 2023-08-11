class ScoreObserver implements Observer {
    @Override
    public void update(String data) {
        System.out.println("live result: " + data);
    }
}