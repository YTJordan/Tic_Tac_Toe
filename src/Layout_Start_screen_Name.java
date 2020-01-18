import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Layout_Start_screen_Name extends JFrame implements ActionListener{

    //---Guielemente----------------------------------------------------------------------------------------------------

    JButton Ok_Button;

    JLabel Info_Start;

    JLabel Name_Start;
    JTextField Spieler_1_Textfield;
    JTextField Spieler_2_Textfield;


    //---Variales-------------------------------------------------------------------------------------------------------
    public static String Name1;
    public static String Name2;
    int Fehler_Namen;



    public Layout_Start_screen_Name(){

        //Fenster
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500, 200);
        this.setTitle("Start - Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        System.out.println("Window Start Generated");


        //Panel
        JPanel Startpanel = new JPanel();



        //Set Info_Start
        Info_Start = new JLabel("Bitte tägigen Sie Ihre Einstellugnen");
        Info_Start.setBounds(20, 0, 300, 20);
        add(Info_Start);



        //Namen Java
        Name_Start = new JLabel();
        Name_Start.setText("Namen");
        Name_Start.setBounds(20,40,60,20);
        add(Name_Start);



        //Textfeld 1
        Spieler_1_Textfield = new JTextField();
        Spieler_1_Textfield.setBounds(20,60,130,20);
        add(Spieler_1_Textfield);
        Spieler_1_Textfield.repaint();


        //Textfeld 2
        Spieler_2_Textfield = new JTextField();
        Spieler_2_Textfield.setBounds(20,90,130,20);
        add(Spieler_2_Textfield);
        Spieler_2_Textfield.repaint();


        //Ok Button
        Ok_Button = new JButton("OK");
        Ok_Button.setBounds(20,120,100,20);
        add(Ok_Button);
        Ok_Button.repaint();
        Ok_Button.addActionListener(this::actionPerformed);









    } //end Layout_Start_screen_Name




    //Actionen Okbutton
    @Override
    public void actionPerformed(ActionEvent ae) {



        if (ae.getSource() == this.Ok_Button){

            Fehler_Namen = 0;

            Name1 = Spieler_1_Textfield.getText();
            Name2 = Spieler_2_Textfield.getText();

            if(Name1.length()==0)
            {System.out.println("Spieler 1 unzulässig");
            Fehler_Namen=1;}
                else {System.out.println("Name 1 ist zulässig");}


            if (Name2.length()==0)
            {System.out.println("Spieler 2 unzulässig");
            Fehler_Namen=1;}
                else {System.out.println("Name 2 ist zulässig");}


            //Wenn ok
            if (Fehler_Namen==0) {
                System.out.println("\nEinstellungen Bestätigt");
                System.out.println("Der 1. Spieler heisst: " + Name1);
                System.out.println("Der 2. Spieler heisst: " + Name2 + "\n");

                setVisible(false);

                Switch_player.Namenszuweisung_LayoutMain();
                JFrame LayoutWerBeginnt = new Layout_Start_Werbeginnen();
            }//end if
            else {JOptionPane.showMessageDialog(null,"Einer oder beide der Namen sind ungültig");}

        }

    }//End Actionperormed





}//end Class Layout_Start_screen_Name
