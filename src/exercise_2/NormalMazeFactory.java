package exercise_2;

public class NormalMazeFactory extends AbstractMazeFactory{

	@Override
	public AbstractRoom createRoom() {
		// TODO Auto-generated method stub
		return new NormalRoom();
	}

	@Override
	public AbstractDoorWall createDoorWall() {
		// TODO Auto-generated method stub
		return new NormalDoorWall();
	}

	@Override
	public AbstractWall createWall() {
		// TODO Auto-generated method stub
		return new NormalWall();
	}

	
}
