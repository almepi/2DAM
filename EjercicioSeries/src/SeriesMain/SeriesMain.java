/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeriesMain;

import Controller.Controller;
import Model.ListShow;
import Model.Shows;
import Model.acces;
import View.Ventana;

/**
 *
 * @author alepin
 */
public class SeriesMain {

    public static void main(String[] args) {

        Controller control = new Controller();

        Ventana v = new Ventana(control);
        v.setVisible(true);

        Shows sh = new Shows("Breaking Bad", "Vicent Guilligan", 5, "Drama", 5);

        ListShow ls = new ListShow();

        ls.setShow(sh);

        sh = new Shows("JGame of thrones", "David Benioff", 6, "1", 6);
        ls.setShow(sh);

        acces.saveLS(ls);

        System.out.println("saved series");

        System.out.println(ls.getShow(0).getTittle());
        System.out.println(ls.getShow(1).getTittle());

    }

}
