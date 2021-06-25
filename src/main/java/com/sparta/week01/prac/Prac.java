import com.sparta.week01.prac.Course;


public class Prac {// 파라미터 X, 반환값 X
    public static void main(String[] args) {
        String title = "웹개발 봄";
        String tutor = "남병";
        int days = 20;
        Course course = new Course(title, tutor, days);
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());



    }
}
