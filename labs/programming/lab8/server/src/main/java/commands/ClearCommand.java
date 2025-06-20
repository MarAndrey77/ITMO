package commands;

import managers.CollectionManager;
import structs.User;

/**
 * Command to clear the collection.
 */
public class ClearCommand extends BasicCommand {
    public ClearCommand(CollectionManager collectionManager) {
        super("clear", "clear : очистить коллекцию", collectionManager);
    }

    /**
     * Basically executes {@link CollectionManager} method in its {@link CollectionManager}.
     *
     * @param args - an array of strings (words that were separated by spaces). Usually it is ignored in commands that do not need any args, and those who need, get only as much as they need (others are being ignored)
     */
    @Override
    public String execute(Object args, User user) {
        return "no you cant";
        //collectionManager.clearCollection();
        //return ("Collection was cleared successfully!");
    }

}
