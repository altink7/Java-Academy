package at.altin.fh.eww.e.oop;

public class Date {
    /**
     * final is an unmodifiable Attribute, we set once at constructor <br>
     * no setters, getters can still be used
     */
    private final int jahr;
    private final int monat;
    private final int tag;

    public Date(int jahr, int monat, int tag) {
        this.jahr = jahr;
        this.monat = monat;
        this.tag = tag;
    }

    public int getJahr() {
        return jahr;
    }

    public int getMonat() {
        return monat;
    }

    public int getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return String.format("02%d, 02%d, 04%d", tag, monat, jahr);
    }
}
