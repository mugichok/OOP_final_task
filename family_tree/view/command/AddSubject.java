package family_tree.view.command;

import family_tree.view.ConsoleUI;

public class AddSubject extends Command{

    public AddSubject (ConsoleUI consoleUI){
        super("Добавить субъект в древо.", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().addNewSubjectToTree();
    }
}