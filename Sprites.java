public class Sprites {

    public Sprites(){}
    
    public void printWelcomeSign(){
        System.out.println("");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                                                  _:_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                                                 '-.-'");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                                        ()      __.'.__");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                                     .-:--:-.  |_______|");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                              ()      \\____/    \\=====/");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                              /\\      {====}     )___(");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                   (\\=,      //\\\\      )__(     /_____\\");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("   __    |'-'-'|  //  .\\    (    )    /____\\     |   |");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  /  \\   |_____| (( \\_  \\    )__(      |  |      |   |");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  \\__/    |===|   ))  `\\_)  /____\\     |  |      |   |");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(" /____\\   |   |  (/     \\    |  |      |  |      |   |");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  |  |    |   |   | _.-'|    |  |      |  |      |   |");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  |__|    )___(    )___(    /____\\    /____\\    /_____\\");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(" (====)  (=====)  (=====)  (======)  (======)  (=======)");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(" }===={  }====={  }====={  }======{  }======{  }======={");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("(______)(_______)(_______)(________)(________)(_________)");
    }

    public void printWelcomeText(){
        System.out.print("\t\t\t\t");
        System.out.println(" __  __ _       _                             _  __      _       _     _     __  __  ");
        System.out.print("\t\t\t\t");
        System.out.println("|  \\/  (_)     (_)                           | |/ /     (_)     | |   | |   |  \\/  |");                    
        System.out.print("\t\t\t\t");
        System.out.println("| \\  / |_ _ __  _ _ __ ___  _   _ _ __ ___   | ' / _ __  _  __ _| |__ | |_  | \\  / | _____   _____  ___"); 
        System.out.print("\t\t\t\t");
        System.out.println("| |\\/| | | '_ \\| | '_ ` _ \\| | | | '_ ` _ \\  |  < | '_ \\| |/ _` | '_ \\| __| | |\\/| |/ _ \\ \\ / / _ \\/ __|");
        System.out.print("\t\t\t\t");
        System.out.println("| |  | | | | | | | | | | | | |_| | | | | | | | . \\| | | | | (_| | | | | |_  | |  | | (_) \\ V /  __/\\__ \\");
        System.out.print("\t\t\t\t");
        System.out.println("|_|  |_|_|_| |_|_|_| |_| |_|\\__,_|_| |_| |_| |_|\\_\\_| |_|_|\\__, |_| |_|\\__| |_|  |_|\\___/ \\_/ \\___||___/");
        System.out.print("\t\t\t\t");
        System.out.println("                                                            __/ |");                                       
        System.out.print("\t\t\t\t");
        System.out.println("                                                           |___/ ");  
    }

    public void printInitialCoordinates(int n, int m){
        System.out.println("");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("You selected:");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Initial Coordinates: [ " + n + ", " + m + " ]");
    }

    public void printFinalCoordinates(int n, int m){
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Final Coordinates: [ " + n + ", " + m + " ]");
    }

    public void printAnswer(int n, int m, int n2, int m2, int steps){
        System.out.println("");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("The minimum moves to go from [ " + n + ", " + m + " ] to -> [ " + n2 + ", " + m2 + " ] are " + steps + " moves.");
    }

}
