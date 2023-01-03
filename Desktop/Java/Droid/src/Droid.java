import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Droid {
    //Instance fields
    int batteryLevel;
    String name;

    public static void main(String[] args) {
        //Create an object of Droid
        Droid cody = new Droid("Cody");
        System.out.println(cody);
        cody.performTask("coding");
        cody.performTask("levitating");


    }
    //constructor
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }

    public String toString() {
        return "Hey there, I am " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing a task: " + task);
    }





}
