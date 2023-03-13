
public class Process implements Priority{

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
		
	}// end getPriority. Overriding from Priority Interface. 
	
	String processID;
	int priority;
	// Setting up variables 
	
	public Process (String processID) {
		this.processID=processID;
	}// end Process constructor 
	

	public void setPriority(int priority) {
		if ( priority < MIN_PRIORITY || priority > MAX_PRIORITY ) {
			throw new IllegalArgumentException("Invalid priority");
		} // end if 
		this.priority = priority;
	}// end setPriority 
	public String getprocessId() {
		return processID;
	}// end getprocessId
	
	public int compareTo(Process other) {
		if(this.priority != other.priority) {
			return Integer.compare(this.priority, other.priority);
			
		}// end if 
		else {
			return this.processID.compareTo(other.processID);
		} // end else 
	} // end compareTo
	public String toString() {
		return "Process[ " + "ProcessID = " + processID	+ "Priority = " + priority + " ]";
}// end toString

}// end Process