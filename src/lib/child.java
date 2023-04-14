package lib;
import java.util.List;
import java.util.LinkedList;



public class child extends Employee {

    private List<String> childNames;
	private List<String> childIdNumbers;

    public child(){
        childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
    }

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}
