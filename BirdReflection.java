public class BirdReflection {

    private int birdAge;
    private String birdBreed;
    private String birdName;
    private double wingSpan;
    private String color;
    private boolean canFly;
    private double weight;


    public BirdReflection(int birdAge, String birdBreed, String birdName, double wingSpan, String color, boolean canFly, double weight) {
        this.birdAge = birdAge;
        this.birdBreed = birdBreed;
        this.birdName = birdName;
        this.wingSpan = wingSpan;
        this.color = color;
        this.canFly = canFly;
        this.weight = weight;
    }

    public int getBirdAge() {
        return birdAge;
    }

    public void setBirdAge(int birdAge) {
        this.birdAge = birdAge;
    }

    public String getBirdBreed() {
        return birdBreed;
    }

    public void setBirdBreed(String birdBreed) {
        this.birdBreed = birdBreed;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String birdName(){
       return "bird name is pigeon";
    }

    private BirdReflection() {
        System.out.println("this is prviate constructor");
    }
}