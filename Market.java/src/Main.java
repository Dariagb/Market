
public class Main {
    public static void main(String[] args) {
        Person person= new Person();
        person. name= "Eva";

        Market market=new Market();

        market.takeQueuer(person);
        market.giveOrders();
        market.releaseQueuer();
        market.addMen();
        market.removeMen();
        market.update();
        }
    }
