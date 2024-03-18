package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.casefactory.Case;
import com.cydeo.streotype_annotation.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Case theCase = container.getBean(Case.class);

        System.out.println(theCase.getDimensions().getDepth());




    }
}
