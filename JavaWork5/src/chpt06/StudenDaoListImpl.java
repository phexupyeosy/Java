package chpt06;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class StudenDaoListImpl implements StudentDao {

	private List<Student> students = new ArrayList<Student>();
	
	@Override
	public Student readStudent(String name) {
		Student temp = null;
		for(Student e:students){
			if(e.getName().equals(name)){
				temp = e;
			}
		}
		return temp;
	}

	@Override
	public boolean writeStudent(Student student) {
		students.add(student);
		return true;
		
	}
	
	@Override
	public void diplayAllStudent(){
		for(Student e:students){
			if (e != null)
				System.out.println(e);
		}
	}

}
