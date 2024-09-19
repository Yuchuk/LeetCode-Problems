package Lab.prob2FPP;

public class Vehicle {
    private int milesUsedToday;
    private String gameCode = "";
    public Vehicle(String gameCode){
        this.gameCode = gameCode;
    }
    public int getMilesUsedToday() {
        return milesUsedToday;
    }
    public void setMilesUsedToday(int milesUsedToday){
        this.milesUsedToday = milesUsedToday;
    }
    public String getGameCode(){
        return gameCode;
    }

}
