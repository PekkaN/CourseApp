import java.io.*;
import java.util.ArrayList;


public class FileRead {

    public void readFile() throws IOException {
        CourseDB courses = new CourseDB();

        //Read the courses .csv file
        try (BufferedReader br = new BufferedReader(new FileReader("resources/CourseData_20180901_210145.csv"))) {
            String line;
            int linecounter = 1;
            while ((line = br.readLine()) != null) {

                //TODO: Check if the values string contains correct information and write an error message if not
                InputCheck ic = new InputCheck(line);
                if(ic.checkAll());{
                    //TODO: Create new Course object and save it to list.
                    Course c = new Course(line.split(";");
                    courses.addCourse(c);

                }
                else {
                //TODO: Write error message based on InputCheck object.
                    writeErrorMessage(ic);
                }
                linecounter++;
            }
            int i = 1;
            for(Course c : courses) {
                System.out.println(i);
                System.out.println(c);
                i++;
            }
        }
    }
    public void writeErrorMessage(InputCheck ic){
        try (BufferedWriter br = new BufferedWriter(new FileWriter("resources/log.txt", true))) {
            br.write(ic.getErrorMessage());
        }
        catch (IOException io) {

        }
    }
}
