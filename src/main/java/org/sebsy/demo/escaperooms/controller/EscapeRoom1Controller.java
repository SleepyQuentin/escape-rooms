package org.sebsy.demo.escaperooms.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class EscapeRoom1Controller {


    public void entreeSalle1() {
        System.out.println("Bravo, vous avez trouvé la première salle !");
    }

}
