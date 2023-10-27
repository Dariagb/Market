// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
