
public class StudentManager   {

	public void add(Student student) {
		System.out.println(student.getName()+" �simli ��renci Bilgileri Eklendi."+"\n"+
				          "Se�ilen Kurs: "+student.selectedCourses+"\n"+
				          "E�itmen: " + student.instructor+"\n");
	}
	
	public void addMultiple(Student[] students) {
		
		for(Student student:students) {
			add(student);
		}
		
	}
	
	public void Update(Student student) {
		System.out.println(student.getName() +" adl� ��renci g�ncellenmi�tir.");
	}
	
	public void Delete(Student student) {
		System.out.println(student.getName() +" adl� ��renci silinmi�tir.");
	}
	
	
}
