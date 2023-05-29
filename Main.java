public class Main {
    public static void main(String[] args) {
        ListHandler listHandler = new ListHandler(1);  // limit set to N users
        listHandler.collectUsers();
        listHandler.printUsers();
    }
}