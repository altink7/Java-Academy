package at.altin.fh.lpw.unger.oop;

public class Main {

    public static void main(String[] args) {
        Form[] forms = new Form[10];

        forms[0] = new Rechteck(7, 7, FARBE.blau);
        forms[1] = new Rechteck();
        forms[2] = new Rechteck(1, 4);
        forms[3] = new Kreis();
        forms[4] = new Kreis(7);
        forms[5] = new Kreis(7, FARBE.rot);
        forms[6] = new Form();
        forms[7] = new Rechteck();
        forms[8] = new Kreis(1, FARBE.blau);
        forms[9] = new Rechteck();

        // Alternative Koordinaten zuweisen : ( OPTIONAL)
        forms[0].position.setX(18);
        forms[0].position.setY(25);

        // Werte zuweisen
        for (int i = 0; i < forms.length; i++) {
            Form form = forms[i];

            form.position.setX(i);
            form.position.setY(forms.length-i);
        }



        // enhanced for ( used normally for arrays ( lists))
        for (Form form : forms) {
            System.out.println(form.toString());
        }

        // alterntive: for
        //for (int i = 0; i < forms.length; i++) {
        //    Form form = forms[i];
        //    System.out.println(form.toString());
        //}




    }
}
