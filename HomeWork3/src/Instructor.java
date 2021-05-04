
public class Instructor extends User {

	String trainings;
	String students;
	String homeworks;
	String lessonTimes;
	
	public void Instructor() {
		System.out.println("Sistem çalýþýyor");
	}
	
	public void Instuctor(String trainings, String students,String homeworks,String lessonTimes) {
		
		this.trainings=trainings;
		this.students=students;
		this.homeworks=homeworks;
		this.lessonTimes=lessonTimes;
		
	}
}
