package ch7;

public class DeapLoopClass {
	static{
		if(true){
			System.out.println(Thread.currentThread()+"init DeadLoopClass");
			while(true){
				
			}
		}
	}
	public static void main(String[] args) {
		Runnable script=new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread()+"start");
				DeapLoopClass dlc=new DeapLoopClass();
				System.out.println(Thread.currentThread()+" run over ");
			}
		};
		
		Thread thread1=new Thread(script);
		Thread thread2=new Thread(script);
		thread1.start();
		thread2.start();

	}

}
