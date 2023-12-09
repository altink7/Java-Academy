package at.altin.it.academy.architecture.factory.creator;

import at.altin.it.academy.architecture.factory.object.Document;
import at.altin.it.academy.architecture.factory.object.SpreadsheetDocument;

/**
 * Factory creator (Concrete Spreadsheet Document Creator)
 */
public class SpreadsheetDocumentCreator implements DocumentCreator {
    @Override
    public Document createDocument() {
        return new SpreadsheetDocument();
    }
}
