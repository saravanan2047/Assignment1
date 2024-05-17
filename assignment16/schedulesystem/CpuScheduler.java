package assignment16.schedulesystem;

import java.util.PriorityQueue;

public class CpuScheduler {

	private PriorityQueue<CpuJob> jobQueue;
	private int waitingTime;
	private int turnaroundTime;

	public CpuScheduler() {
		this.jobQueue = new PriorityQueue<>();
		this.waitingTime = 0;
		this.turnaroundTime = 0;
	}

	public void addJob(CpuJob job) {
		jobQueue.add(job);
	}

	public void runScheduler() {
		while (!jobQueue.isEmpty()) {
			CpuJob job = jobQueue.poll();
			System.out.println("\nProcessing CPU ID " + job.getId() + " with priority " + job.getPriority()
					+ " and processing time " + job.getProcessingTime());
			waitingTime += turnaroundTime;
			turnaroundTime += job.getProcessingTime();
			System.out.println("Waiting Time: " + waitingTime + ", Turnaround Time: " + turnaroundTime);
		}
	}
}
