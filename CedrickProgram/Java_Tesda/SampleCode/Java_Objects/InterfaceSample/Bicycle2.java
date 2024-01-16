package CedrickProgram.Java_Tesda.SampleCode.Java_Objects.InterfaceSample;

public interface Bicycle2 {
    //  wheel revolutions per minute
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
    // display all
    public static void main(String[] args) {
    ACMEBicycle ss = new ACMEBicycle();
    // ss.speedUp(1);
    ss.printStates();
}
}
class ACMEBicycle implements Bicycle2 {
    int cadence = 0;
    int speed = 0;
    int gear = 1;
   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.
    public void changeCadence(int newValue) {
         cadence = newValue;
    }
    public void changeGear(int newValue) {
         gear = newValue;
    }
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
