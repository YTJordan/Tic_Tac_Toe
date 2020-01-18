import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class Layout_Game extends JFrame implements ActionListener{
    //Gui Elemente------------------------------------------------------------------------------------------------------
    JPanel Infoleiste;          //Textanzeige
    JLabel AktuelelerPlayer;    //Logi
    JLabel TextInfo;            //Textanzeige "Aktueller spieler
    JLabel Player_Zeichen;      //Logik
    JLabel Player_Zeichen_Info; //Textanzeige: Symbol

    JPanel Game;
    JButton But0;
    JButton But1;
    JButton But2;
    JButton But3;
    JButton But4;
    JButton But5;
    JButton But6;
    JButton But7;
    JButton But8;

    //Variabel resultate der grafik
    public static String ResBut0;
    public static String ResBut1;
    public static String ResBut2;
    public static String ResBut3;
    public static String ResBut4;
    public static String ResBut5;
    public static String ResBut6;
    public static String ResBut7;
    public static String ResBut8;

    public static String Zeichen_Player;


    public Layout_Game(){

        // Inizialisiere Spieler


//Generiere alles ausser button ----------------------------------------------------------------------------------------

        //Fenster und Infotexte setzen
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500,600);
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        System.out.println("Window generated");

        //Label erzeugen
        JPanel Grid_Panel = new JPanel();



        //Infotext Akteller Spieler
        TextInfo = new JLabel("Aktueller Spieler: ");
        TextInfo.setBounds(10, 10, 300,20);
        add(TextInfo);

        //Aktueller Spieler Anzeigen
        String Spieler;                        //Aktueler spieler der Angezeigt werden soll
        if (Switch_player.Spielernumber == 1){
            Spieler = Switch_player.Spieler1;
        }else{
            Spieler = Switch_player.Spieler2;
        }

        AktuelelerPlayer = new JLabel(Spieler);
        AktuelelerPlayer.setBounds(120, 10, 300, 20);
        add(AktuelelerPlayer);



        // Info_ANnezige (X / O)
        Player_Zeichen_Info = new JLabel("Symbol:");
        Player_Zeichen_Info.setBounds(10,30,300,20);
        add(Player_Zeichen_Info);


        Player_Zeichen = new JLabel(Zeichen_Player);
        Player_Zeichen.setBounds(120, 30, 300, 20);
        add(Player_Zeichen);

        System.out.println("Info_Generated");


        /*
        ---Buttons------------------------------------------------------------------------------------------------------


        - Auslesung entsrechend Buttonbeschriftung

        Beschriftung:
        012
        345
        678

         */

        //clear Strings button-display
        ArrayList<String> Button_Anzeige = new ArrayList<>();
        Button_Anzeige.add("-"); //0
        Button_Anzeige.add("-");
        Button_Anzeige.add("-");
        Button_Anzeige.add("-");
        Button_Anzeige.add("-");
        Button_Anzeige.add("-"); //5
        Button_Anzeige.add("-");
        Button_Anzeige.add("-");
        Button_Anzeige.add("-"); //8

        System.out.println("Grid cleared");





        //Buttons
        But0 = new JButton(Button_Anzeige.get(0));
        But0.setBounds(50,100,100,100);
        add(But0);

        But1 = new JButton(Button_Anzeige.get(1));
        But1.setBounds(200,100,100,100);
        add(But1);

        But2 = new JButton(Button_Anzeige.get(2));
        But2.setBounds(350,100,100,100);
        add(But2);


        But3 = new JButton(Button_Anzeige.get(3));
        But3.setBounds(50,250,100,100);
        add(But3);


        But4 = new JButton(Button_Anzeige.get(4));
        But4.setBounds(200,250,100,100);
        add(But4);

        But5 = new JButton(Button_Anzeige.get(5));
        But5.setBounds(350,250,100,100);
        add(But5);

        But6 = new JButton(Button_Anzeige.get(6));
        But6.setBounds(50,400,100,100);
        add(But6);

        But7 = new JButton(Button_Anzeige.get(7));
        But7.setBounds(200,400,100,100);
        add(But7);

        But8 = new JButton(Button_Anzeige.get(8));
        But8.setBounds(350,400,100,100);
        add(But8);

       //Todo: Warum werden buttons nciht angezeigt

        System.out.println("\nGrid Generated");

        //Repaint Buttons
        But0.repaint();
        But1.repaint();
        But2.repaint();
        But3.repaint();
        But4.repaint();
        But5.repaint();
        But6.repaint();
        But7.repaint();
        But8.repaint();


        //Buttos werden dem Listner zuweisen
        But0.addActionListener(this::actionPerformed);
        But1.addActionListener(this);
        But2.addActionListener(this);
        But3.addActionListener(this);
        But4.addActionListener(this);
        But5.addActionListener(this);
        But6.addActionListener(this);
        But7.addActionListener(this);
        But8.addActionListener(this);

    }//End Fenster

//Actionlistner---------------------------------------------------------------------------------------------------------

    public static void Generate_Actionlistners (String[] args){
        Layout_Game ly = new Layout_Game();
        ly.setVisible(true);

    }


    public void actionPerformed(ActionEvent ae){

        if (ae.getSource()== this.But0){

            if (But0.getText()== "-")
            {But0.setText(Zeichen_Player);
                System.out.println("Set Value Button 0 ");

                ResBut0 = Zeichen_Player;
                Switch_player.Field_clicked();
                Logik.Logik();


            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But1){

            if (But1.getText()=="-"){
                But1.setText(Zeichen_Player);
                System.out.println("Set Value Button 1");

                ResBut1 = Zeichen_Player;

                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But2){

            if (But2.getText()=="-"){
                But2.setText(Zeichen_Player);
                System.out.println("Set Value Button 2");

                ResBut2 = Zeichen_Player;
                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But3){

            if (But3.getText()=="-"){
                But3.setText(Zeichen_Player);
                System.out.println("Set Value Button 3");

                ResBut3 = Zeichen_Player;
                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But4){

            if (But4.getText()=="-"){
                But4.setText(Zeichen_Player);
                System.out.println("Set Value Button 4");

                ResBut4 = Zeichen_Player;
                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But5){

            if (But5.getText()=="-"){
                But5.setText(Zeichen_Player);
                System.out.println("Set Value Button 5");

                ResBut5 = Zeichen_Player;
                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But6){

            if (But6.getText()=="-"){
                But6.setText(Zeichen_Player);
                System.out.println("Set Value Button 6");

                ResBut6 = Zeichen_Player;
                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But7){

            if (But7.getText()=="-"){
                But7.setText(Zeichen_Player);
                System.out.println("Set Value Button 7");

                ResBut7 = Zeichen_Player;
                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------

        if (ae.getSource()== this.But8){

            if (But8.getText()=="-"){
                But8.setText(Zeichen_Player);
                System.out.println("Set Value Button 8");


                ResBut8 = Zeichen_Player;

                Switch_player.Field_clicked();
                Logik.Logik();
            }
            else {JOptionPane.showMessageDialog(null, "Dieses Feld wurde bereits ausgewählt. \n\nWählen sie ein anderes Feld, welches noch nicht belegt ist");}

        }

        //------------------------------------------------------------




    }//End ActionPerformed



}//End klasse Layout_Game