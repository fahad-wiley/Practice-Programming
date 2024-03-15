import controller.AddressBookController;
import dao.AddressBookDao;
import dao.AddressBookDaoImpl;
import ui.AddressBookView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        AddressBookView myView = new AddressBookView(myIo);
        AddressBookDao myDao = new AddressBookDaoImpl();
        AddressBookController controller = new AddressBookController(myView);

        controller.run();
    }
}