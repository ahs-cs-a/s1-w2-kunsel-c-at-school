public class Card{
    private int suit;
    private int rank;
    
    //Constructor
    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    //Set
    public void setRank(int rank){
        this.rank = rank;
    }
    public void setSuit(int suit){
        this.suit = suit;
    }
    
    //Return functions
    public int suit(){
        return suit;
    }
    public int rank(){
        return rank;
    }
}