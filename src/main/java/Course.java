import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private int courseCode;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private String materialType;
    private String description;
    private boolean mathCode;
    private String mainCategory;
    private List<String> subCategories;

    public Course(int courseCode, String name, LocalDate startDate, LocalDate endDate, String location, String materialType, String description, boolean mathCode, String mainCategory, List<String> subCategories){
        this.courseCode = courseCode;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.materialType = materialType;
        this.description = description;
        this.mathCode = mathCode;
        this.mainCategory = mainCategory;
        this.subCategories = subCategories;
    }
    public Course() {
        this.courseCode =Integer.parseInt(null);
        this.name = null;
        this.startDate = null;
        this.endDate = null;
        this.location = null;
        this.materialType = null;
        this.description = null;
        this.mathCode = Boolean.parseBoolean(null);
        this.mainCategory = null;
        this.subCategories = null;

    }

    public void printSubCategories(){
        for (String sc : this.subCategories) {
            System.out.print(sc +";");
        }
    }
    public void creatCourse(String[] list){
        Course course = new Course();
        course.setCourseCode(Integer.valueOf(list[0]));
        course.setName(list[1]);
        String []startD = list[2].split(".");
        LocalDate st = LocalDate.of(Integer.valueOf(startD[2]),Integer.valueOf(startD[1]),Integer.valueOf(startD[0]));
        course.setStartDate(st);
        String []endD = list[3].split(".");
        LocalDate en = LocalDate.of(Integer.valueOf(startD[2]),Integer.valueOf(startD[1]),Integer.valueOf(startD[0]));
        course.setEndDate(en);
        course.setLocation(list[4]);
        course.setMaterialType(list[5]);
        course.setDescription(list[6]);
        course.setMathCode(Boolean.valueOf(list[7]));
        course.setMainCategory(list[8]);
        List<String> sc = new ArrayList<>();
        int index = 9;
        while(index<list.length){
            sc.add(list[index]);
            index++;
        }
        course.setSubCategories(sc);



    }

    @Override
    public String toString() {
        return courseCode +";" +name +";" +startDate +";" +endDate +";";
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getMathCode() {
        return mathCode;
    }

    public void setMathCode(boolean mathCode) {
        this.mathCode = mathCode;
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public List<String> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<String> subCategories) {
        this.subCategories = subCategories;
    }
}
