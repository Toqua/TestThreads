package testThreadsP;

public class TestThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new DateThread(1);
        Thread t2 = new DateThread(2);
        System.out.println("Starting MyThreads");
        t1.start();
        t2.start();
        System.out.println("MyThreads has been started");
        System.out.println("you can't find which do what or when because the work in parallel ");
	}

}
