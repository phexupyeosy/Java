package chpt06;

public class StudentDaoArrayImpl implements StudentDao {

	private Student[] students;
	private int size=80;//默认数组大小
	public StudentDaoArrayImpl(int size) {
		this.size = size;
		students = new Student[size];
	}

	@Override
	public Student readStudent(String name) {
		Student temp = null;
		for(int i=0; i<students.length;i++){
			if(students[i]!= null){
				if (students[i].getName().equals(name)){
					temp = students[i];
					break;
				}
			}
		}
		return temp;
		
	}

	@Override
	public boolean writeStudent(Student student) {
		boolean success = false;
		for(int i=0; i<students.length;i++){
			if(students[i]==null){
				students[i] = student;
				success = true;
				break;
			}
		}
		return success;
	}
	
	@Override
	public void diplayAllStudent(){
		for(Student e:students){
			if (e != null)
				System.out.println(e);
		}
	}

}
