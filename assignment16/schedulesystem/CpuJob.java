package assignment16.schedulesystem;

public class CpuJob implements Comparable<CpuJob> {
	private int id;
	private int processTime;
	private int priority;

	public CpuJob(int id, int processTime, int priority) {
		this.id = id;
		this.processTime = processTime;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public int getProcessingTime() {
		return processTime;
	}

	public int getPriority() {
		return priority;
	}

	public int compareTo(CpuJob o) {
		return Integer.compare(o.priority, this.priority);
	}
}
