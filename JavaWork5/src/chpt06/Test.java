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

		
		//StudentDao sdm = new StudentDaoArrayImpl(50);//ʹ������ʵ�� 16:11
		StudentDao sdm = new StudenDaoListImpl();//ʹ���б�ʵ��  15:11
		
		//����̨д���ݣ����迼�Ǻ�̨��ʲô(���������ݿ⡢�ļ������顢List)
		//��Ϊ����������StudentDao�ӿ�
		System.out.println("===========д��ѧ��========");
		for(Student e:students){
			if (!sdm.writeStudent(e)){
				System.out.println("���ѧ��ʧ��");
			}else{
				System.out.println("����ɹ�����");
			}
		}
		System.out.println("===========��ʾ����ѧ��========");
		sdm.diplayAllStudent();
		System.out.println("===========��ѯѧ��========");
		Student temp = sdm.readStudent("Tom") ;
		if(temp == null){
			System.out.println("���޴���");
		}else{
			System.out.println(temp);
		}
	}
}
