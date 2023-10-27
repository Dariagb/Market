public interface QueueBehaviour {
    void takeQueuer(Person person);
    void giveOrders();
    void releaseQueuer();
}
