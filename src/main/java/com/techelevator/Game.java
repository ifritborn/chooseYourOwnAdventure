package com.techelevator;

import com.techelevator.menu.MenuDisplay;
import com.techelevator.menu.RoomsMenu;
import com.techelevator.rooms.*;


public class Game {
    //variables
    //intro to the game
    private static final String INTRO = "You are detective Gery Ember and you have been invited to attend a dinner party at the mansion estate of Mr. Zircon";

    //room variables
    private static final String DINING_ROOM = "DINING_ROOM";
    private static final String KITCHEN = "KITCHEN";
    private static final String GARAGE = "GARAGE";
    private static final String GARDEN = "GARDEN";
    private static final String GAME_ROOM = "GAME_ROOM";
    private static final String STUDY = "STUDY";
    private static final String LIBRARY = "LIBRARY";
    private static final String MOVIE_THEATRE = "MOVIE_THEATRE";
    private static final String BATHROOM = "BATHROOM";
    private static final String LEAVE = "LEAVE";

    //string array to hold room options
    private static final String[] ROOMS = {"DINING_ROOM", "KITCHEN", "GARAGE", "GARDEN", "GAME_ROOM", "STUDY", "LIBRARY", "MOVIE_THEATRE", "BATHROOM", "LEAVE"};



//    Private String roomsMenu = RoomsMenu.setRooms();

    //create instance of each room
    private DiningRoom diningRoom = new DiningRoom();
    private Kitchen kitchen = new Kitchen();
    private Garage garage = new Garage();
    private Garden garden = new Garden();
    private GameRoom gameRoom = new GameRoom();
    private Study study = new Study();
    private Library library = new Library();
    private MovieTheatre movieTheatre = new MovieTheatre();
    private Bathroom bathroom = new Bathroom();

    //main method to run the game
    public static void main(String[] args) {


        Game game = new Game();
        game.beginGame();

    }

    //method to start the game loop
    public void beginGame() {

        //new instance of player
        Player player = new Player();
        //new instance of the story
        //Story story = new Story();

        //game loop
        label:
        while(true) {

            //print out intro to the game
            System.out.println(INTRO);

            //set menu options
            String selectedOption = MenuDisplay.prompt(ROOMS);

            //check menu options and go to room
            switch (selectedOption) {
                case DINING_ROOM:
                    diningRoom.onEnterRoom(player);
                    break;
                case KITCHEN:
                    kitchen.onEnterRoom(player);
                    break;
                case BATHROOM:
                    bathroom.onEnterRoom(player);
                    break;
                case GARAGE:
                    garage.onEnterRoom(player);
                    break;
                case GARDEN:
                    garden.onEnterRoom(player);
                    break;
                case GAME_ROOM:
                    gameRoom.onEnterRoom(player);
                    break;
                case STUDY:
                    study.onEnterRoom(player);
                    break;
                case LIBRARY:
                    library.onEnterRoom(player);
                    break;
                case MOVIE_THEATRE:
                    movieTheatre.onEnterRoom(player);
                    break;
                default:
                    break label;
            }

        }

    }
}
