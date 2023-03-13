
public class Task implements Priority{

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}
	private String name;
	private int priority;
	private Status status;
	
	// This are the variables 
	
	public Task (String name, Status status) {
		this.name=name;
		this.status=status;
		
	} // end Task
	public int compareTo (Task other) {
		if (this.priority != other.priority) {
			return Integer.compare(this.priority, other.priority);
			
		}// end if 
		else {
			return this.name.compareTo(other.name);
		}// end else 
	} // end compareTo

	public String getName() {
		return name;
	}// end getName

	public void setName(String name) {
		this.name = name;
	}// end setName
	
	public Status getstatus() {
		return status;
	}// end getstatus
	public void setStauts (Status status) {
		this.status=status;
	}// end set stauts 

	public void setPriority(int priority) {
		if ( priority < MIN_PRIORITY || priority > MAX_PRIORITY ) {
		this.priority = priority;
	} // end if 
	}// end setPriority 
	public String toString() {
		return "Task ["+"priority = " + priority + " Name = " + name + "Status = "+ status + "]";
	} // end toString 


}// end Task
