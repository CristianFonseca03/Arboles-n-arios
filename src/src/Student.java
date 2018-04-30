package src;

import java.util.Comparator;

public class Student {
	String id, name, description;
	double enrollment;
	int semester;

	public Student(String id, String name, String description, double enrollment, int semester) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.enrollment = enrollment;
		this.semester = semester;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(double enrollment) {
		this.enrollment = enrollment;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public static Comparator<Student> compId = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {

			return o1.getId().compareTo(o2.getId());
		}
	};

	public static Comparator<Student> compEnrollment = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {

			return (int) (o1.getEnrollment() - o2.getEnrollment());
		}
	};

}
