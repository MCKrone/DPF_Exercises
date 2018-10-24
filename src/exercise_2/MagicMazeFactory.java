package exercise_2;

public class MagicMazeFactory extends AbstractMazeFactory{

	@Override
	public AbstractRoom createRoom() {
		// TODO Auto-generated method stub
		return new MagicRoom();
	}

	@Override
	public AbstractDoorWall createDoorWall() {
		// TODO Auto-generated method stub
		return new MagicDoorWall();
	}

	@Override
	public AbstractWall createWall() {
		// TODO Auto-generated method stub
		return new NormalWall();
	}

	
}
