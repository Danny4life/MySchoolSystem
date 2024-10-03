import enums.CourseOffer;
import enums.Gender;
import model.*;
import service.impl.ApplicantServiceImpl;
import service.impl.PrincipalServiceImpl;
import service.impl.StudentServiceImpl;
import service.impl.TeachableServiceImpl;

public class SchoolSystem {
    public static void main(String[] args) {

        // Step 1
        Teacher teacher1 = new Teacher("Segun Osiki", 150, Gender.MALE);
        Teacher teacher2 = new Teacher("Uzoma Ibezim", 120, Gender.MALE);

        // Step 2
        Student student1 = new Student("Muminat, Adefabi", 74, Gender.FEMALE);
        Student student2 = new Student("Nohim Olademiji", 15, Gender.MALE);

        // step 3
        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.DOTNET);

        // step 4
        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();

        // step 5
        Principal principal1 = new Principal("John Hopkins", 300, Gender.MALE);


        // step 6
        Applicants applicants1 = new Applicants("Simon Awaogu", 90, Gender.MALE);
        Applicants applicants2 = new Applicants("Tomi Aturaka", 16, Gender.MALE);

        ApplicantServiceImpl applicantData = new ApplicantServiceImpl();

        PrincipalServiceImpl principalData = new PrincipalServiceImpl();
        StudentServiceImpl expelStudent = new StudentServiceImpl();


        System.out.println("**********TEACHER DATA**********");
        teachableService1.teachCourse(teacher1, course1);
        System.out.println("************************************************");

        System.out.println("*********TEACHER DATA**********");
        teachableService2.teachCourse(teacher2, course2);
        System.out.println("************************************************");

        System.out.println("**********STUDENT DATA**********");
        teachableService1.takeCourse(student1, course1);
        teachableService1.takeCourse(student2, course2);
        System.out.println("************************************************");

        System.out.println("**********PRINCIPAL DATA**********");
        principalData.display(principal1);
        System.out.println("************************************************");


        System.out.println("**********STUDENT EXPELLED DATA**********");
        expelStudent.expelStudent(student2, principal1);
        System.out.println("************************************************");


        System.out.println("**********APPLICANT DATA**********");
        applicantData.displayApplicantData(applicants1);
        applicantData.displayApplicantData(applicants2);
        System.out.println("************************************************");

        System.out.println("**********SUCCESSFUL ADMISSION DATA**********");
        applicantData.admitStudent(applicants1);
        System.out.println("************************************************");


        System.out.println("**********DENIED ADMISSION DATA**********");
        applicantData.admitStudent(applicants2);














    }
}
