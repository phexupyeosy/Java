package chpt06;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("Tom");
		students[1]= new Student("Jerry");
		students[2] = new Student("Sophia");

		
		//StudentDao sdm = new StudentDaoArrayImpl(50);//使用数组实现 16:11
		StudentDao sdm = new StudenDaoListImpl();//使用列表实现  15:11
		
		//往后台写数据，无需考虑后台是什么(到底是数据库、文件、数组、List)
		//因为这里是面向StudentDao接口
		System.out.println("===========写入学生========");
		for(Student e:students){
			if (!sdm.writeStudent(e)){
				System.out.println("添加学生失败");
			}else{
				System.out.println("插入成功！！");
			}
		}
		System.out.println("===========显示所有学生========");
		sdm.diplayAllStudent();
		System.out.println("===========查询学生========");
		Student temp = sdm.readStudent("Tom") ;
		if(temp == null){
			System.out.println("查无此人");
		}else{
			System.out.println(temp);
		}
	}
}
