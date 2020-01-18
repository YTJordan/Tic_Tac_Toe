public class Switch_player {

    /*All Pubic VAriables inside here*/

    public static String Spieler1;
    public static String Spieler2;
    public static int Spielernumber;



    public static void Namenszuweisung_LayoutMain(){
        Spieler1 = Layout_Start_screen_Name.Name1;
        Spieler2 = Layout_Start_screen_Name.Name2;
    }



    public static void Field_clicked(){
        if (Spielernumber == 1)
        {
            Spielernumber =2;
        }
        else {Spielernumber = 1;}


        if (Spielernumber == 1){
            Layout_Game.Zeichen_Player= "X";
        }

        if(Spielernumber == 2){
            Layout_Game.Zeichen_Player = "O";
        }


    }


}
