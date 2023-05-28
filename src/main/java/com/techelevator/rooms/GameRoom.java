package com.techelevator.rooms;

import com.techelevator.menu.MenuDisplay;
import com.techelevator.Player;
import com.techelevator.constants.GameConstants;

public class GameRoom {
    //Variables
    //Room intro
    private static final String INTRO = "You enter the Game Room. ";

    //opening options
    private static final String OPTION_1 = "Talk to ...";
    private static final String OPTION_2 = "Go to ...";

    //talk options
    private static final String TALK_1 = "";
    private static final String TALK_2 = "";
    private static final String TALK_3 = "";
    private static final String TALK_4 = "Previous Menu";

    //go options
    private static final String GO_1 = "Go to the Study";
    private static final String GO_2 = "Go to the Garden";
    private static final String GO_3 = "Return to the Foyer";
    private static final String GO_4 = "Previous Menu";

    //menu string arrays
    private static final String[] OPTIONS = {OPTION_1, OPTION_2};
    private static final String[] OPTIONS_TALK = {TALK_1, TALK_2, TALK_3, TALK_4};
    private static final String[] OPTIONS_GO = {GO_1, GO_2, GO_3, GO_4};

    private static Study study = new Study();
    private static Garden garden = new Garden();


    //behavior
    public void onEnterRoom(Player player){
        //game loop
        while (true) {
            //display room intro
            System.out.println(INTRO);

            //display first menu
            String selectedOption = MenuDisplay.prompt(OPTIONS);
            //check input
            if(selectedOption.equals(OPTION_1)){
                //shows talk menu
                selectedOption = MenuDisplay.prompt(OPTIONS_TALK);
                //check talk option
                if(selectedOption.equals(TALK_1)){

                } else if (selectedOption.equals(TALK_2)) {

                } else if (selectedOption.equals(TALK_3)) {

                } else {
                    //previous menu
                    selectedOption = MenuDisplay.prompt(OPTIONS);
                }
            }else if ( selectedOption.equals(OPTION_2)){
                //shows the go menu

                selectedOption = MenuDisplay.prompt(OPTIONS_GO);
                //check input

                if(selectedOption.equals(GO_1)){
                    //go to next room
                    study.onEnterRoom(player);
                } else if (selectedOption.equals(GO_2)) {
                    //go to previous room
                    garden.onEnterRoom(player);
                } else if (selectedOption.equals(GO_3)) {
                    //go to foyer
                    break;
                }else {
                    //previous menu
                    selectedOption = MenuDisplay.prompt(OPTIONS);
                }
            }
        }
    }
    //other methods you want to add here





}

