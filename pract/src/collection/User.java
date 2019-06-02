package collection;

public class User {

	public int id;
	public String name;
	public String add;
	public User(int i, String name, String address) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.name = name;
		this.add = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((add == null) ? 0 : add.hashCode());
	    result = prime * result + (int) (id ^ (id >>> 32));
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    return result;
	}

	public boolean equals(Object o) {
		return this.equals(o);
	}
	public String toString() {
		return "Employee { " + " ID " + id + " name = " + name + "  address  " + add    + "}";
	}
}
