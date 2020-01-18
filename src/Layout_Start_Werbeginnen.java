import javax.sound.midi.MidiDevice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Layout_Start_Werbeginnen extends JFrame implements ActionListener{

    JLabel frage_Welcherspieler;
    JButton Spieler_1;
    JButton Spieler_2;
    JButton zufall;



    public Layout_Start_Werbeginnen (){

        System.out.println("Startabfrage Started");



        JFrame fr = new JFrame("Start - Tic Tac Toe");
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500,200);
        this.setTitle("Start - Tic Tac Toe");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //Textfeld
        frage_Welcherspieler = new JLabel("Wählen Sie aus, wer beginnen wird");
        frage_Welcherspieler.setBounds(5,5,500,20);
        add(frage_Welcherspieler);

        //Button Spieler 1
        Spieler_1 = new JButton();
        Spieler_1.setBounds(5,40,200,20);
        Spieler_1.setText(Layout_Start_screen_Name.Name1);
        add(Spieler_1);
        Spieler_1.addActionListener(this::actionPerformed);

        //Button Spieler 2
        Spieler_2 = new JButton();
        Spieler_2.setBounds(5,60,200,20);
        Spieler_2.setText(Layout_Start_screen_Name.Name2);
        add(Spieler_2);
        Spieler_2.addActionListener(this::actionPerformed);

        //Button Zufall
        zufall = new JButton("Zufall");
        zufall.setBounds(5,80,200,20);
        zufall.setBackground(Color.yellow);
        add(zufall);
        zufall.addActionListener(this::actionPerformed);


    }//End Startafreage

    //Generate Actionlistner


    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource()== this.Spieler_1){
            System.out.println("Spieler 1 Beginnt");
            Switch_player.Spielernumber=1;
            //Debugg: ersts feld kein zeichen
            Switch_player.Field_clicked();
            Switch_player.Field_clicked();
            JFrame Layout_Game = new Layout_Game();
            setVisible(false);
        }

        if (ae.getSource()==this.Spieler_2){
            System.out.println("Spieler 2 beginnt");
            Switch_player.Spielernumber=2;
            //Debugg: ersts feld kein zeichen
            Switch_player.Field_clicked();
            Switch_player.Field_clicked();
            JFrame Layout_Game = new Layout_Game();
            setVisible(false);
        }

        if (ae.getSource()==this.zufall){
            System.out.println("Zufallsentscheidung");
            if (Math.random() > 0.5){
                Switch_player.Spielernumber=1;
            }
            else {Switch_player.Spielernumber=2;}
            //Debugg: ersts feld kein zeichen
            Switch_player.Field_clicked();
            Switch_player.Field_clicked();
            JFrame Layout_Game = new Layout_Game();
            setVisible(false);
        }

    }



} //end Layout_Start_Werbeginnen
