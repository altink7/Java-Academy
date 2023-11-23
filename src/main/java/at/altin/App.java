package at.altin;

import at.altin.tutorium.a.formattedOutput.TheLifeOfPi;
import at.altin.tutorium.b.Oktal;
import at.altin.tutorium.c.Diagonale;
import at.altin.tutorium.d.GradeAverage;

import javax.swing.*;
import java.awt.*;

public class App extends Canvas implements Runnable{
    public static void main( String[] args ) {
        new Thread(new App()).start();
    }

    @Override
    public void run() {
        chooseTutoriumBlock();
    }

    private void chooseTutoriumBlock() {
        JButton button_tut1 = new JButton("Tutorium Block 1");
        JButton button_tut2 = new JButton("Tutorium Block 2");
        JButton button_tut3 = new JButton("Tutorium Block 3");
        JButton button_tut4 = new JButton("Tutorium Block 4");

        JFrame frame = new JFrame("Tutorium Block");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(3, 1));
        frame.add(button_tut1);
        frame.add(button_tut2);
        frame.add(button_tut3);
        frame.add(button_tut4);
        frame.setVisible(true);

        button_tut1.addActionListener(e -> {
            frame.setVisible(false);
            new Thread(new TheLifeOfPi()).start();
        });

        button_tut2.addActionListener(e -> {
            frame.setVisible(false);
            new Thread(new Oktal()).start();
        });

        button_tut3.addActionListener(e -> {
            frame.setVisible(false);
            new Thread(new Diagonale()).start();
        });

        button_tut4.addActionListener(e -> {
            frame.setVisible(false);
            new Thread(new GradeAverage()).start();
        });

    }


}
