public class BodyOfWater{
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    //Constructors
    public BodyOfWater(String n, double lD, double aD, boolean iSW){
        name = n;
        largestDiameter = lD;
        avgDepth = aD;
        isSaltWater = iSW;
    }
    public BodyOfWater(String n, double aD){
        name = n;
        avgDepth = aD;
    }

    //Set method
    public void setName(String n){
        name = n;
    }
    public void setLargestDiamter(double lD){
        largestDiameter = lD;
    }

    //Return functions
    public String name(){
        return name;
    }
    public double largestDiamter(){
        return largestDiameter;
    }
    public double avgDepth(){
        return avgDepth;
    }
    public boolean isSaltWater(){
        return isSaltWater;
    }
    
}

