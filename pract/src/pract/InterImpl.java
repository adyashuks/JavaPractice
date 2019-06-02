package pract;

public class InterImpl  implements Inter1, Inter2{

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
////		Inter1.super.show();
//		
//		Inter2.super.show();
//	}
public static void main(String [] args) {
	InterImpl i = new InterImpl();
	i.show();
}

@Override
public void show() {
	// TODO Auto-generated method stub
	Inter1.super.show();
//	Inter2.super.show();
}

//@Override
//public void a() {
//	// TODO Auto-generated method stub
//	
//}
}
