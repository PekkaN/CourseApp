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

    public Course(int courseCode, String name, LocalDate startDate, LocalDate endDate, String location, String materialType, String description, boolean mathCode, String mainCategory, List<String> subCategories) {
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
        this.courseCode = 0;
        this.name = null;
        this.startDate = null;
        this.endDate = null;
        this.location = null;
        this.materialType = null;
        this.description = null;
        this.mathCode = false;
        this.mainCategory = null;
        this.subCategories = new ArrayList<>();

    }

    public String printSubCategories(){
        StringBuilder sb = new StringBuilder();

        if(subCategories.size()==1) {
            return sb.append(subCategories.get(0)).toString();
        }
        else {
            for (String sc : this.subCategories) {
                sb.append(sc + ";");
            }
        }
        return sb.toString();
    }

    public void createCourse(String[] list) {
        setCourseCode(Integer.valueOf(list[0]));
        setName(list[1]);
        if (list[2] == null) {
        } else {
            String[] startD = list[2].split("\\.");
            LocalDate st = LocalDate.of(Integer.valueOf(startD[2]), Integer.valueOf(startD[1]), Integer.valueOf(startD[0]));
            setStartDate(st);
        }
        if (list[3] == null) {
        } else {
            String[] endD = list[3].split("\\.");
            LocalDate en = LocalDate.of(Integer.valueOf(endD[2]), Integer.valueOf(endD[1]), Integer.valueOf(endD[0]));
            setEndDate(en);
        }
        setLocation(list[4]);
        setMaterialType(list[5]);
        setDescription(list[6]);
        if (list[7].isEmpty()) {
        } else {
            setMathCode(Boolean.valueOf(list[7]));
        }
        setMainCategory(list[8]);

        List<String> sc = new ArrayList<>();
        int index = 9;
        while (index < list.length) {
            sc.add(list[index]);
            index++;
        }
        this.subCategories.addAll(sc);
        

    }

    @Override
    public String toString() {

        return courseCode + ";" + name + ";" + startDate + ";" + endDate + ";" + location + ";" + materialType + ";" + description + ";" + mathCode + ";" + mainCategory + ";" + String.join(";", subCategories);

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
