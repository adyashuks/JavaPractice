package patterns.Decorator.singleton;

public class SingletonCls {

	private static SingletonCls instance;
	
	private SingletonCls() {}
	
//	static {
//		try {
//			instance = new SingletonCls();
//		}
//		catch(Exception e) {}
//	}
//	
//	public static SingletonCls getInstance() {
//		return instance;
//	}
	
	//Lazy Initialization
	public static SingletonCls getinstance() {
		if(instance == null) {
			instance = new SingletonCls();
		}
		return instance;
	}
	
}
