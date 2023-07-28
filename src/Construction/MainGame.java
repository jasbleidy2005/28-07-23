package Construction;

public class MainGame {
    public static void main(String[] args) {
        Character valquiria =new Character("valquiria",12000, 1500, 4);
        Character minipekke = new Character("minipekke",2000,555,4);
        Deck deck = new Deck(8, 3, "exotic", 13);
        Sand sand= new Sand();
        Sand sand1= new Sand("7894");
        Sand sand2=new Sand("67",356);
        Sand sand3= new Sand("689",34,45);

    }
}
