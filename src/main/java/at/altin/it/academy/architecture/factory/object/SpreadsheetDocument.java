package at.altin.it.academy.architecture.factory.object;

/**
 * Factory object (Concrete Spreadsheet Document)
 */
public class SpreadsheetDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document");
    }

    @Override
    public void save() {
        System.out.println("Saving Spreadsheet Document");
    }
}