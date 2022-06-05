package JR;

public class Truck {

    int length;
    int width;
    int height;
    int weight;
    Truck(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }
}


class BridgeOfficer {

    int maxWeight;

    public BridgeOfficer(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    public boolean checkTruck(Truck truck) {
        if (truck.weight > maxWeight) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Truck t = new Truck(3,2,4);
        BridgeOfficer bo = new BridgeOfficer(24);
        t.weight = t.getVolume();
        System.out.println(bo.checkTruck(t));
        System.out.println(t.weight);
    }
}