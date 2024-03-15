import controller.AddressBookController;
import dao.AddressBookDao;
import dao.AddressBookDaoImpl;
import dao.AddressBookPersistenceException;
import service.AddressBookDataValidationException;
import service.AddressBookDuplicateIdException;
import service.AddressBookServiceLayerImpl;
import ui.AddressBookView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) throws AddressBookDuplicateIdException, AddressBookDataValidationException, AddressBookPersistenceException {
        UserIO myIo = new UserIOConsoleImpl();
        AddressBookView myView = new AddressBookView(myIo);
        AddressBookDao myDao = new AddressBookDaoImpl();
        AddressBookServiceLayerImpl service = new AddressBookServiceLayerImpl(myDao, myView);
        AddressBookController controller = new AddressBookController(service, myView);

        controller.run();
    }
}