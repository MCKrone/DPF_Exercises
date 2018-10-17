package exercise_1;

public class T1_Architect {

	public static void main(String[] args) {
		T1_BuildingPart haus1 = new BuildingComposite("Haus 1", "Haus");
		
		T1_BuildingPart level1 = new BuildingComposite("Level E", "Level");
		haus1.add(level1);
		
		T1_BuildingPart floor1 = new BuildingComposite("Floor 1", "Floor");
		level1.add(floor1);
		
		floor1.add(new BuildingLeaf("Room 1", "Room"));
		
		haus1.drawPart();
	}
}
