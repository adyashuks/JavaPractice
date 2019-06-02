package output;

class Test {
	  public static void main(String[] args) {
	  As a = new As("s");
	  a.print();
	  }
	  }
	 
	  class As {
	  String s;
	
	 As(String newS) {
	 s = newS;
	 }
	
	 public void print() {
	 System.out.print(s);
	 }
	 }