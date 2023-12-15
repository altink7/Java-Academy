package at.altin.it.academy.architecture.factory.client;

import at.altin.it.academy.architecture.factory.creator.DocumentCreator;
import at.altin.it.academy.architecture.factory.creator.SpreadsheetDocumentCreator;
import at.altin.it.academy.architecture.factory.creator.TextDoxumentCreator;
import at.altin.it.academy.architecture.factory.object.Document;

/**
 * Factory client (Document Factory)
 */
public class DocumentFactorySimulation {
    public static void main(String[] args) {
        // Let the user choose the type of document to create
        // (in a real scenario, this might be based on user input or configuration)
        DocumentCreator documentCreator = getUserDocumentCreatorPreference();

        // Use the factory method to create a document
        Document document = documentCreator.createDocument();

        // Perform operations on the document
        document.open();
        document.save();
    }

    private static DocumentCreator getUserDocumentCreatorPreference() {
        // In a real scenario, this method might prompt the user, read configuration, etc.
        // For simplicity, we'll hardcode the choice here.
        boolean userPrefersTextDocument = true;

        if (userPrefersTextDocument) {
            return new TextDoxumentCreator();
        } else {
            return new SpreadsheetDocumentCreator();
        }
    }
}
