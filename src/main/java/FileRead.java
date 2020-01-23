import java.io.*;
import java.util.ArrayList;


public class FileRead {

    public void readFile() throws IOException {
        CourseDB courses = new CourseDB();

        //Read the courses .csv file
        try (BufferedReader br = new BufferedReader(new FileReader("resources/CourseData_20180901_210145.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                //TODO: Check if the values string contains correct information and write an error message if not
                InputCheck ic = new InputCheck(line);
                ic.splitLine();
                if (ic.checkAll()) {
                    //TODO: Create new Course object and save it to list.
                    String[] split = line.split(";");
                    if (!split[0].equalsIgnoreCase("CourseCode")) {
                        Course c = new Course();
                        c.createCourse(split);
                        courses.addCourse(c);
                    }

                } else {
                    //TODO: Write error message based on InputCheck object.
                    //   writeErrorMessage(ic);
                }

            }
        }
    }
//    public void writeErrorMessage(InputCheck ic){
//        try (BufferedWriter br = new BufferedWriter(new FileWriter("resources/log.txt", true))) {
//            br.write(ic.getErrorMessage());
//        }
//        catch (IOException io) {
//
//        }
//    }
}
