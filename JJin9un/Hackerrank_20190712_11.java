import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code

/**
 * https://www.hackerrank.com/challenges/java-sort/problem
 */
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int x;
                x = Double.valueOf(s1.getCgpa()).compareTo(s2.getCgpa());
                if (x != 0) return -x;
                x = s1.getFname().compareTo(s2.getFname());
                if (x != 0) return x;
                return Integer.valueOf(s1.getId()).compareTo(s2.getId());
            }
        });

      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



