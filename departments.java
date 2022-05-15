public class departments {



    public void Fiction(){
        System.out.println(" ");
        String fict[]={"Fantasy","Historical Fiction","Contemporary Fiction","Mystery","SciFi"};

        System.out.println("Available subgenres of Fiction are :");
        for(int i=0; i<fict.length; i++){
            System.out.println(fict[i]);
        }
    }


    public void Nonfiction(){
        System.out.println(" ");

        String nonfict[]={"History","Biography/Autobiography/Memoir","Philosophy","Religion","Science"};

        System.out.println("Available subgenres of Nonfiction are :");
        for(int i=0; i<nonfict.length; i++){
            System.out.println(nonfict[i]);
        }
    }


    public void Drama(){
        System.out.println(" ");

        String drama[]={"Theatre","Political","Tragedy","Comedy",};

        System.out.println("Available subgenres of Drama are :");
        for(int i=0; i<drama.length; i++){
            System.out.println(drama[i]);
        }
    }


    public void Poetry(){
        System.out.println(" ");

        String poet[]={"Elegy","Haiku","Ode","Sonnet"};

        System.out.println("Available subgenres of Poetry are :");
        for(int i=0; i<poet.length; i++){
            System.out.println(poet[i]);
        }
    }


    public void Folktale(){
        System.out.println(" ");

        String folk[]={"Myth","Legend","Fable","Faery Tales"};

        System.out.println("Available subgenres of Folktales are :");
        for(int i=0; i<folk.length; i++){
            System.out.println(folk[i]);
        }
    }


}










