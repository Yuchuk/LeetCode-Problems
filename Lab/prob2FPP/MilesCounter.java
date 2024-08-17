package Lab.prob2FPP;
import java.util.ArrayList;
import java.util.List;

public class MilesCounter {

    public static List convertArray(Object[] vehicleArray){
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();

        for(int i = 0; i < vehicleArray.length; i++){
            Vehicle vehicle = (Vehicle)vehicleArray[i];
            if(vehicle.getGameCode().equals("Bicycle")){
                Bicycle bicycle = new Bicycle();
                bicycle.setMilesUsedToday(vehicle.getMilesUsedToday());
                vehicleList.add(bicycle);
            }
            else if(vehicle.getGameCode().equals("Automobile")){
                Automobile automobile = new Automobile();
                automobile.setMilesUsedToday(vehicle.getMilesUsedToday());
                vehicleList.add(automobile);
            }
            else {
                Boat boat = new Boat();
                boat.setMilesUsedToday(vehicle.getMilesUsedToday());
                vehicleList.add(boat);
            }
        }
        return vehicleList;
    }

    public static int computeMiles(List<Vehicle> vehicleList){
        int sumMile = 0;
        for (int j = 0; j < vehicleList.size(); j++){
            Vehicle vehicle = vehicleList.get(j);
            sumMile += vehicle.getMilesUsedToday();
        }
        return sumMile;
    }

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle("Bicycle");
        vehicle.setMilesUsedToday(10);

        Vehicle vehicle1 = new Vehicle("Automobile");
        vehicle1.setMilesUsedToday(20);

        Vehicle vehicle2 = new Vehicle("Boat");
        vehicle2.setMilesUsedToday(30);

        Vehicle[] vehicleArray = {vehicle,vehicle1,vehicle2};
        List vehicleList = convertArray(vehicleArray);
        int sumMile = computeMiles(vehicleList);
        System.out.println("Here is sum mile: "+ sumMile);


    }

}




