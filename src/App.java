// BuildingManagementAppAns.java
// SKILL BASED TEST - Question 2
// SCSE1224 2025/2026-2
// Name: ???
// Matric No.: ???

import java.util.ArrayList;

class Person {}
class Room {}
class ComputerLab {}
class LectureHall {}
class Equipment {}
class Building {}

// Main class to run the program
public class BuildingManagementApp {
  public static void main(String[] args) {
    System.out.println("---- FACULTY BUILDING MANAGEMENT APP --------");
    // Checkpoint #1
    //System.out.println("\nCheckpoint #1");
    // CREATE 2 PERSON
    //Person person1 = new Person("Ahmad Zolkafli", "017-7018088");
    //Person person2 = new Person("Samad Abu", "013-9705090");
    //System.out.println("using toString()");
    //System.out.println(person1.toString());
    //System.out.println(person2.toString());

    // Checkpoint #2
    //System.out.println("\nCheckpoint #2");
    // CREATE 3 EQUIPMENTS
    //Equipment computer1 = new Equipment("Computer for teacher in MPK1",
    //                                    "Electronics");
    //Equipment projector = new Equipment("Projector in Dewan Kejora",
    //                                    "Visual");
    //Equipment paSystem = new Equipment("Dewan Kejora PA Audio System",
    //                                   "Audio Equipment");
    //System.out.println("using toString()");
    //System.out.println(projector.toString());
    //System.out.println(computer1.toString());
    //System.out.println(paSystem.toString());
    //System.out.println("using displayEquipmentDetails()");
    //computer1.displayEquipmentDetails();
    //projector.displayEquipmentDetails();
    //paSystem.displayEquipmentDetails();

    // Checkpoint #3
    //System.out.println("\nCheckpoint #3");
    // CREATE A BUILDING (N28a - Faculty Computing)
    //Building fcBuilding = new Building("N28a Faculty Computing");
    //System.out.println(fcBuilding.toString());
    // Display Building Details
    //fcBuilding.displayBuildingDetails();//Print N28a with empty room

    // ADD 2 ROOMS: MPK1 & Dewan Kejora to fc building-(composition)
    //fcBuilding.addComputerLab("MPK01", 50, 25);
    //fcBuilding.addLectureHall("Dewan Kejora", 250, "U-shape");
    //fcBuilding.displayBuildingDetails();

    // Checkpoint #4
    //System.out.println("\nCheckpoint #4");
    // ASSIGN PERSON-IN-CHARGE TO ROOM (association)
    // Ahmad Zolkafli is in-charge of MPK1
    //person1.assignRoom(fcBuilding.rooms.get(0));
    // Samad Abu is in-charge of Dewan Kejora
    //person2.assignRoom(fcBuilding.rooms.get(1));
    //person1.viewAssignedRoom();
    //person2.viewAssignedRoom();

    // Checkpoint #5
    //System.out.println("\nCheckpoint #5");
    // ADD EQUIPMENT TO ROOM (aggregation)
    // Add equipment to MPK1
    //fcBuilding.rooms.get(0).addEquipment(computer1);
    // Add 2 equipments to Dewan Kejora
    //fcBuilding.rooms.get(1).addEquipment(projector);
    //fcBuilding.rooms.get(1).addEquipment(paSystem);
  }
}
