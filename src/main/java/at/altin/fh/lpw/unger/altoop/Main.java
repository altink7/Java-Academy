package at.altin.fh.lpw.unger.altoop;

public class Main {

    public static void main(String[] args) {
        Form[] forms = new Form[10];

        forms[0] = new Rechteck(7, 7, 34, 78);
        forms[1] = new Rechteck(7,7,7,7);
        forms[2] = new Rechteck(1, 4,15,16);
        forms[3] = new Kreis(59,89);
        forms[4] = new Kreis(67, 67);
        forms[5] = new Kreis(7, FARBE.rot);
        forms[6] = new Form(45,67);
        forms[7] = new Rechteck();
        forms[8] = new Form();
        forms[9] = new Form(12,78);

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
