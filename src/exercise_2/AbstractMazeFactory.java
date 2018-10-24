package exercise_2;

public abstract class AbstractMazeFactory {
	public abstract AbstractRoom createRoom();

	public abstract AbstractDoorWall createDoorWall();

	public abstract AbstractWall createWall();
}
