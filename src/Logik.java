import com.sun.deploy.uitoolkit.impl.fx.ui.FXMessageDialog;

import javax.swing.*;

public class Logik {

    public static void Logik (){

        /*
        X00
        0X0
        00X
         */

        if (Layout_Game.ResBut0 != null && Layout_Game.ResBut4 != null && Layout_Game.ResBut8 != null) {

            if (Layout_Game.ResBut0 == Layout_Game.ResBut4 && Layout_Game.ResBut4 == Layout_Game.ResBut8) {
                System.out.println(Layout_Game.ResBut0 + " hat gewonnen");

                //Spieler 1 und Spieler 2 sind Invertiert weil Switch_Player bereits bei der eingabe umschaltet --> "Nächster spieler ist an der Reihe
                if (Layout_Game.Zeichen_Player == "X") {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler2 + " hat gewonnen");
                }
                else {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler1 + " hat gewonnen");
                }

            } else System.out.println("");

        } else System.out.println(".");

        /*
        0X0 /n
        0X0 /n
        0X0 /n
         */
        if (Layout_Game.ResBut1 != null && Layout_Game.ResBut4 != null && Layout_Game.ResBut7 != null) {

            if (Layout_Game.ResBut1 == Layout_Game.ResBut4 && Layout_Game.ResBut4 == Layout_Game.ResBut7) {
                System.out.println(Layout_Game.ResBut1 + " hat gewonnen");

                //Spieler 1 und Spieler 2 sind Invertiert weil Switch_Player bereits bei der eingabe umschaltet --> "Nächster spieler ist an der Reihe
                if (Layout_Game.Zeichen_Player == "X") {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler2 + " hat gewonnen");
                }
                else {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler1 + " hat gewonnen");
                }
            } else System.out.println("");

        } else System.out.println(".");


        /*
        00X
        0X0
        X00
         */
        if (Layout_Game.ResBut2 != null && Layout_Game.ResBut4!= null && Layout_Game.ResBut6 != null) {

            if (Layout_Game.ResBut2 == Layout_Game.ResBut4 && Layout_Game.ResBut4 == Layout_Game.ResBut6) {
                System.out.println(Layout_Game.ResBut2 + " hat gewonnen");

                //Spieler 1 und Spieler 2 sind Invertiert weil Switch_Player bereits bei der eingabe umschaltet --> "Nächster spieler ist an der Reihe
                if (Layout_Game.Zeichen_Player == "X") {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler2 + " hat gewonnen");
                }
                else {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler1 + " hat gewonnen");
                }
            } else System.out.println("");

        } else System.out.println(".");

        /*
        X00
        X00
        X00
         */
        if (Layout_Game.ResBut0 != null && Layout_Game.ResBut3 != null && Layout_Game.ResBut6 != null) {

            if (Layout_Game.ResBut0 == Layout_Game.ResBut3 && Layout_Game.ResBut3 == Layout_Game.ResBut6) {
                System.out.println(Layout_Game.ResBut3 + " hat gewonnen");

                //Spieler 1 und Spieler 2 sind Invertiert weil Switch_Player bereits bei der eingabe umschaltet --> "Nächster spieler ist an der Reihe
                if (Layout_Game.Zeichen_Player == "X") {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler2 + " hat gewonnen");
                }
                else {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler1 + " hat gewonnen");
                }
            } else System.out.println("");

        } else System.out.println(".");

        /*
        00X
        00X
        00X
         */
        if (Layout_Game.ResBut2 != null && Layout_Game.ResBut4 != null && Layout_Game.ResBut8 != null) {

            if (Layout_Game.ResBut2 == Layout_Game.ResBut4 && Layout_Game.ResBut4 == Layout_Game.ResBut8) {
                System.out.println(Layout_Game.ResBut5 + " hat gewonnen");

                //Spieler 1 und Spieler 2 sind Invertiert weil Switch_Player bereits bei der eingabe umschaltet --> "Nächster spieler ist an der Reihe
                if (Layout_Game.Zeichen_Player == "X") {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler2 + " hat gewonnen");
                }
                else {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler1 + " hat gewonnen");
                }
            } else System.out.println("");

        } else System.out.println(".");

        /*
        XXX
        000
        000
         */
        if (Layout_Game.ResBut0 != null && Layout_Game.ResBut1 != null && Layout_Game.ResBut2 != null) {

            if (Layout_Game.ResBut0 == Layout_Game.ResBut1 && Layout_Game.ResBut1 == Layout_Game.ResBut2) {
                System.out.println(Layout_Game.ResBut6 + " hat gewonnen");

                //Spieler 1 und Spieler 2 sind Invertiert weil Switch_Player bereits bei der eingabe umschaltet --> "Nächster spieler ist an der Reihe
                if (Layout_Game.Zeichen_Player == "X") {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler2 + " hat gewonnen");
                }
                else {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler1 + " hat gewonnen");
                }
            } else System.out.println("");

        } else System.out.println(".");

        /*
        000
        XXX
        000
         */
        if (Layout_Game.ResBut3 != null && Layout_Game.ResBut4 != null && Layout_Game.ResBut5 != null) {

            if (Layout_Game.ResBut3 == Layout_Game.ResBut4 && Layout_Game.ResBut4 == Layout_Game.ResBut5) {
                System.out.println(Layout_Game.ResBut7 + " hat gewonnen");

                //Spieler 1 und Spieler 2 sind Invertiert weil Switch_Player bereits bei der eingabe umschaltet --> "Nächster spieler ist an der Reihe
                if (Layout_Game.Zeichen_Player == "X") {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler2 + " hat gewonnen");
                }
                else {
                    JOptionPane.showMessageDialog(null, Switch_player.Spieler1 + " hat gewonnen");
                }
            } else System.out.println("");

        } else System.out.println(".");

        /*
        000
        000
        XXX
         */
        if (Layout_Game.ResBut6 != null && Layout_Game.ResBut7 != null && Layout_Game.ResBut8 != null) {

            if (Layout_Game.ResBut6 == Layout_Game.ResBut7 && Layout_Game.ResBut7 == Layout_Game.ResBut8) {
                System.out.println(Layout_Game.ResBut8 + " hat gewonnen");

            } else System.out.println("");

        } else System.out.println(".");


    }//End Logik


}//End Logik (Class)
