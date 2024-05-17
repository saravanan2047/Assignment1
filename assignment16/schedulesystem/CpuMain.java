package assignment16.schedulesystem;

public class CpuMain {

	public static void main(String[] args) {

		CpuScheduler scheduler = new CpuScheduler();

		scheduler.addJob(new CpuJob(1, 11, 1));
		scheduler.addJob(new CpuJob(2, 9, 8));
		scheduler.addJob(new CpuJob(3, 6, 6));
		scheduler.addJob(new CpuJob(4, 3, 9));
		scheduler.addJob(new CpuJob(5, 5, 2));

		scheduler.runScheduler();
	}
}
