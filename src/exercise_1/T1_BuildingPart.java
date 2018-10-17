package exercise_1;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class T1_BuildingPart {
	
	public String getFunction() {
		throw new UnsupportedOperationException();
	}	
	public String getName() {
		throw new UnsupportedOperationException();
	}	
	public void add(T1_BuildingPart newBPart) {
		throw new UnsupportedOperationException();
	}
	public void remove(T1_BuildingPart removeBPart) {
		throw new UnsupportedOperationException();
	}
	public void drawPart() {
		throw new UnsupportedOperationException();
	}
	public void getBPart(int index) {
		throw new UnsupportedOperationException();
	}

}

class BuildingLeaf extends T1_BuildingPart{

	String name;
	String funktion;
	
	public BuildingLeaf(String name, String funktion) {
		this.name = name;
		this.funktion = funktion;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getFunction() {
		return funktion;
	}
	
	@Override
	public void drawPart() {
		// TODO Auto-generated method stub
		System.out.println(getFunction() + " | " + getName());
	}
	
}

class BuildingComposite extends T1_BuildingPart{
	
	ArrayList<T1_BuildingPart> buildingParts = new ArrayList<>();
	String name;
	String funktion;
	
	public BuildingComposite(String name, String funktion) {
		this.name = name;
		this.funktion = funktion;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getFunction() {
		return funktion;
	}

	@Override
	public void drawPart() {
		System.out.println(getFunction() + " | " + getName());
		
		// TODO Auto-generated method stub
		Iterator<T1_BuildingPart> iterator = buildingParts.iterator();
		while(iterator.hasNext()) {
			T1_BuildingPart next = iterator.next();
			next.drawPart();
		}
	}

	@Override
	public void add(T1_BuildingPart newBPart) {
		// TODO Auto-generated method stub
		buildingParts.add(newBPart);
	}

	@Override
	public void remove(T1_BuildingPart removeBPart) {
		// TODO Auto-generated method stub
		buildingParts.remove(removeBPart);
	}

	@Override
	public void getBPart(int index) {
		// TODO Auto-generated method stub
		buildingParts.get(index);
	}
	
}