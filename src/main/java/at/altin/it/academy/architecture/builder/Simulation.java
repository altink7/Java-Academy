package at.altin.it.academy.architecture.builder;

import at.altin.it.academy.architecture.builder.builder.ElementBuilder;
import at.altin.it.academy.architecture.builder.data.Element;

public class Simulation {

    public static void main(String[] args) {
        //usage of builder
        Element element = new ElementBuilder()
                .name("name")
                .type("type")
                .value("value")
                .build();


        System.out.println(element.toString());
    }
}
