public class Market implements QueueBehaviour, MarketBehaviour {
    @Override
    public void takeQueuer(Person person) {
        System.out.println("Человек приходит в очередь!");
    }

    @Override
    public void giveOrders() {
        System.out.println("Человек принимает заказ!");
    }

    @Override
    public void releaseQueuer() {

        System.out.println("Человек уходит из очереди!");
    }

    @Override
    public void addMen() {
        System.out.println("//");

    }

    @Override
    public void removeMen() {
        System.out.println("//");

    }

    @Override
    public void update() {

    }
}
