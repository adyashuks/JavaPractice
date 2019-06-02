package collection;

public class TreeSetComparable implements Comparable<TreeSetComparable> {

	public int intVal;
	public TreeSetComparable(int val) {
		// TODO Auto-generated constructor stub
		this.intVal = val;
	}
	
	@Override
	public int compareTo(TreeSetComparable o) {
		// TODO Auto-generated method stub
		return intVal-o.intVal;
	}

}
