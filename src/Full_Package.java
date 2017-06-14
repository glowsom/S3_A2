public class Full_Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Full_Package x = new Full_Package();

		Online_Class acadgild = x.new Online_Class();
		System.out.println(acadgild);
	}
	
public class Class_Room{
	
	private String subject;
	private String professor;
	private int classSize;

	Class_Room(String subject, String professor, int classSize){
		this.subject = subject;
		this.professor = professor;
		this.classSize = classSize;
	}
	Class_Room(){
		this.subject  = "Generic";
		this.professor  = "Dean";
		this.classSize  = 0;
	}
	public String getProfessor (){
		return this.professor;
	}	
	public String toString(){
		return "This " + this.subject + " class of " + this.classSize + " students is taught by Professor " + this.professor + ".";
	}
}

public class Online_Class extends Class_Room {
	Online_Class(){
		super.subject  = "Online";
		super.professor  = "Web Admin";
		super.classSize  = 0;
	}
}
}