
public class Courses {
  int id;
  String name;
  String detail;
  String teacher;
  String feeInformation;
  
  public Courses()
  {
	  System.out.println("Kurs detay� bulunmuyor.");
  }
  
  public Courses (int id,String name,String detail,String teacher,String feeInformation)
  {
	  this.id=id;
	  this.name=name;
	  this.detail=detail;
	  this.teacher=teacher;
	  this.feeInformation=feeInformation;
  }
  
}
