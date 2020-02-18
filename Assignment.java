
public class Assignment {
private String title;
private String description;
private String topic;
private int points;

public Assignment(String title,String description, String topic, int points) {
	this.title = title;
	this.description = description;
	this.topic = topic;
	this.points = points;
}

public String toString() {
	return title + " " + description + " " + topic;
}
}
