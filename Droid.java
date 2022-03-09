public class Droid{
  String name;
  int batteryLevel;

public Droid(String droidName){
  name = droidName;
  batteryLevel = 100;
}

public String toString(){
  return "Hello, I'm the droid: " + name;
}

public void performTask(String task){
  System.out.println(name + "is performing task: " + task);
  batteryLevel -= 10;
}

public void energyReport(int energy){
  energy = batteryLevel;

  System.out.println("Battery Level is at: " + energy);
}

public void energyTransfer(int transfer){
  transfer = 100 - batteryLevel;
  System.out.println("The device has used " + transfer + "% in energy.");
}

public static void main(String[] args){
  Droid project = new Droid("Codey");
  System.out.println(project);
  project.performTask("Dancing");
  project.energyReport(0);
  project.energyTransfer(0);
  }
}