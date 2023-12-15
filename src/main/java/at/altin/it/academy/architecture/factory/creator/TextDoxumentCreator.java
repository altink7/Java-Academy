package at.altin.it.academy.architecture.factory.creator;

import at.altin.it.academy.architecture.factory.object.Document;
import at.altin.it.academy.architecture.factory.object.TextDocument;

/**
 * Factory creator (Concrete Text Document Creator)
 */
public class TextDoxumentCreator implements DocumentCreator {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}