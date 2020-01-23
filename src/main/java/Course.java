import java.time.LocalDate;
import java.util.List;

public class Course {
    private int courseCode;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private String materialType;
    private String description;
    private String mathCode;
    private String mainCategory;
    private List<String> subCategories;

    public Course(int courseCode, String name, LocalDate startDate, LocalDate endDate, String location, String materialType, String description, String mathCode, String mainCategory, List<String> subCategories){
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


}
