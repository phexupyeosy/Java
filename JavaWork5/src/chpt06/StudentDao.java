package chpt06;

public interface StudentDao {
	public boolean writeStudent(Student student);
	public Student readStudent(String name);
	public void diplayAllStudent();
}
