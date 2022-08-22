class Car {
    void VechileType() {
        System.out.println("VechileTpe:Four Wheel");
    }
}
class Maruthy extends Car {
    void Brand() {
        System.out.println("Brand: Maruthy");
    }
    void Speed() {
        System.out.println("Speed: 80km/h");
    }
}
class Maruthy800 extends Maruthy {
    void Speed() {
        System.out.println("Speed: 100km/h");
    }
}
class MultiLevelInheritance {
    public static void main(String args[]) {
        Maruthy800 m = new Maruthy800();
        Maruthy m1 = new Maruthy();
        m.VechileType();
        m.Brand();
        m1.Speed();
        m.Speed();
    }
}
