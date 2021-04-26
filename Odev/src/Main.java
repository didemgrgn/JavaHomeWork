import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
		Courses courses1 =new Courses(1,
		"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)",
        "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
        "Engin DEM�ROG","�cretsiz");
		
		Courses courses2 =new Courses(2,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# & ARGULAR)",
		        "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
		        "Engin DEM�ROG","�cretsiz");
		
		Courses courses3 =new Courses(3,
				"Programlamaya Giri� ��in Temel Kurs",
		        "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
		        "Engin DEM�ROG","�cretsiz");
				
				
		Courses[] cours= {courses1,courses2,courses3};	
		for(Courses courses:cours)
		{
			System.out.println("Kursun Ad�: "+courses.name +" , "+
					           "Kursun Detay�: " + courses.detail +" , "+
					           "Kursun ��retmeni: "+courses.teacher +" , "+
					           "Kursun �cret Bilgisi: "+courses.feeInformation);
			
		}
		
		CourseManagement courseManagement=new CourseManagement();
		courseManagement.joinProgram(courses1);
		courseManagement.joinProgram(courses2);
		courseManagement.joinProgram(courses3);
		
		Categories categories1=new Categories(1,"Donan�m");
		Categories categories2=new Categories(2,"Programalama");
		Categories categories3=new Categories(3,"T�m�");
		
		Categories[] categori= {categories1,categories2,categories3};
		int sayi=0;
		for (int i = 0; i < categori.length; i++) {
			sayi++;	
		}
		
		for(Categories categories:categori)
		{ 
			System.out.println("Kategori: " +categories.name);
		}
		System.out.println("Toplam Kategori: "+sayi +"\n");
		
		Instructors instructor1=new Instructors(1,"Engin Demirog");
		Instructors instructor2=new Instructors(2,"T�m�");
		
		Instructors[] instructor= {instructor1,instructor2};
		for(Instructors instructors:instructor)
		{
			System.out.println("Kurs Hocas�: " +instructors.teacherName);
		}
		
		Users user1=new Users(1,"Didem Girgin","1234","1234");
		Users user2=new Users(2,"Ali Ba�aran","12345","12345");
		
		Users[] user= {user1,user2};
		for(Users users:user)
		{
			System.out.println("Kullan�c� ad�: "+users.nameSurname +"\n"+"Kullan�c� �ifresi: "+users.password);
		}
	}

}
