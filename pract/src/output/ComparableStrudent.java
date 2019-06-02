package output;

public class ComparableStrudent implements Comparable<ComparableStrudent>{

	public String name;
	public int id;
	
	public ComparableStrudent() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public ComparableStrudent(String name, int id) {
//		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(ComparableStrudent o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
}
