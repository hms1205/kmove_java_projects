package reference.test;

public class Subject {
	String subjectName;
	int subjectScore;
	
	public Subject(String name) {
		subjectName = name;
	}
	
	public void setSubjectName(String name) {
		subjectName = name;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectScore(int score) {
		subjectScore = score;
	}
	
	public int getSubjectScore() {
		return subjectScore;
	}
}
