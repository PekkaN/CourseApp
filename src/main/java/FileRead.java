import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileRead {

    public void readFile() throws IOException {
      //  List<Course> courses = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("resources/CourseData_20180901_210145.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                System.out.println(values);

            }
        }
    }
}
