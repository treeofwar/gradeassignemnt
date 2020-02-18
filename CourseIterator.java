import java.util.*;
public class CourseIterator implements Iterator {
	
private Assignment[] assignment;
private int position =0;

public CourseIterator(Assignment[] assignment) {
	this.assignment = assignment;
}


public boolean hasNext() {
	if(position >= assignment.length || assignment[position]==null) {
		return false;
	}
	else {
		return true;
	}
}


public Assignment next() {
	Assignment assignments = assignment[position];
	position = position + 1;
	return assignments;
}
}
