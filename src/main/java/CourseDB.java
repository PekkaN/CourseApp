import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CourseDB {
    List<Course> courseList;

    public CourseDB() {
        this.courseList = new ArrayList<>();
    }
    public void addCourse(Course c) {
        courseList.add(c);
    }
    public List<Course> getCourseList() {
        return courseList;
    }
}
