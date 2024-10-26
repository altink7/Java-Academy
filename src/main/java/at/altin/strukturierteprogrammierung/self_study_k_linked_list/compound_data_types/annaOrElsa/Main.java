package at.altin.strukturierteprogrammierung.self_study_k_linked_list.compound_data_types.annaOrElsa;

import java.util.Scanner;

public class Main {
    static final int ELSA = -2;
    static final int ANNA = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Erstellen des Arrays: für fortgeschrittene aber kürzer
        Question[] questions = {
                createQuestion("Winter", 2, 1 ), //0
                createQuestion("Mutig", 5,4 ),  //1
                createQuestion("Allein", 3,4 ),  //2
                createQuestion("Abenteuer", 4, ELSA), //3
                createQuestion("Rentiere", ANNA, ELSA),   //4
                createQuestion("Gehemnis",4 , ANNA),  //5
        };

        // Erstellen des Arrays: einfacher verständlich aber länger
        /*
        Question[] questions = new Question[6];
        questions[0] = new Question();
        questions[0].text = "Winter";
        questions[0].on_yes = 2;
        questions[0].on_no = 1;

        questions[1] = new Question();
        questions[1].text = "Mutig";
        questions[1].on_yes = 5;
        questions[1].on_no = 4;
        ...
        */

        int idx = 0;
        while(idx >= 0){
            System.out.printf("%s?: ", questions[idx].text);
            String c = sc.next();
            if (c.equals("+"))
                idx = questions[idx].on_yes;
            else if (c.equals("-"))
                idx = questions[idx].on_no;
        }

        //System.out.printf("%s", (idx==ELSA) ? "ELSA" : "ANNA");

        if(idx == ANNA)
            System.out.printf("ANNA");
        else if(idx == ELSA)
            System.out.printf("ELSA");

        sc.close();
    }

    private static Question createQuestion(String text, int yes, int no) {
        Question q = new Question();
        q.text = text;
        q.on_yes = yes;
        q.on_no = no;
        return q;
    }
}
