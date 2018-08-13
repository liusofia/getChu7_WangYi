class Singleton{
	public class Singleton(){
		private static Singleton singleton = new Singleton();
		private Singleton(){}
		public static Singleton getInstance() {
			return singleton;
		}
	}
}

class Singleton{
	public class Singleton(){
		private static Singleton singleton;
		private Singleton(){}
		public static Singleton getInstance(){
			if(singleton == null){
				singleton = new Singleton();
			}
			return singleton;
		}
	}
}
