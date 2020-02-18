

public class Course   {
private Assignment[] assignments;
private int count;
private String name;
private String title;
private int MAX_NUM =5;//sets the max the array can be no magic numbers this time
public Course(String name, String description) {
	assignments = new Assignment[MAX_NUM];
	
}

public void addAssignment(String title, String description, String topic, int points) {

	Assignment assignment = new Assignment(title, description, name, count); 
	if(count >= MAX_NUM) {
		System.out.println("you have all your assignemnts done");
		
	}
	else {
		assignments[count] = assignment;
	count = count + 1;
}
}
public double getAssignmentWeights() {
	for(int i =0; i<assignments.length;i++) {
	count = i/100;
	}
	 return count;
}


public CourseIterator createIterator() {
	
	
	return new CourseIterator(assignments);
}

public String toString() {
	return title + "" + name;
}

public Assignment[] growArray(Assignment[] First) {
	Assignment[] temp = new Assignment[First.length*2];
	System.arraycopy(First,0,temp,0,First.length);
	First = temp;
	return First;
}
}
