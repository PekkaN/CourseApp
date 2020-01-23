import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

public class InputCheck {
private String rivi;
private String courseCode;
private String name;
private String startDate;
private String endDate;
private String location;
private String materialType;
private String description;
private String matCode;
private String mainCategory;
private String subCategory;
private String subCategory2;
private boolean pass;

    /*
    CourseCode: kurssin yksilöllinen tunniste
• Name: Kurssin nimi
• StartDate: alkupäivä
• EndDate: loppupäivä, sama kuin alkupvm jos vain yhden päivän kestävä kurssi
• Location: sijainti, Online tarkoittaa mahdollisuutta etäosallistua vaikka Skypen kautta
• MaterialType: paperi/sähköinen
• Description: Kuvausteksti
• MatCode: materiaalikoodi
• MainCategory: Kurssin pääluokittelu
• SubCategory1 ja SubCategory2: kurssin muut luokittelut

     */

    public InputCheck(String rivi) {
        this.rivi = rivi;
    }


    //String rivi = "1;2;3;4;5;6;7;8;9;10;11";

    public void splitLine() throws NullPointerException {
    try{
        String[] parts = rivi.split(";");
        if(parts.length>9) {
            this.courseCode = parts[0]; // 1
            this.name = parts[1]; // 2
            this.startDate = parts[2]; // 3
            this.endDate = parts[3]; // 4
            this.location = parts[4]; // 5
            this.materialType = parts[5]; // 6
            this.description = parts[6]; // 7
            this.matCode = parts[7]; // 8
            this.mainCategory = parts[8]; // 9
            this.subCategory = parts[9]; // 10
            this.subCategory2 = parts[10]; // 11
        }
        else {
            this.pass=false;
        }
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }

    }

    public boolean checkAll() {
        pass = true;
        if (!courseCodeCheck(courseCode)) {
            this.pass = false;
        }
        if (!nameCheck(name)) {
            this.pass = false;
        }
        if (!datesCheck(startDate,endDate)) {
            this.pass = false;
        }
        if (!locationCheck(location)) {
            this.pass = false;
        }
        if (!materialTypeCheck(materialType)) {
            this.pass = false;
        }
        if (!descriptionCheck()) {
            this.pass = false;
        }
        if (!matCodeCheck(matCode)) {
            this.pass = false;
        }
        if (!mainCategoryCheck()) {
            this.pass = false;
        }
        if (!subCategoryCheck()) {
            this.pass = false;
        }
        return this.pass;
    }

    private boolean subCategoryCheck() {
        if(this.subCategory == null) {
            return false;
        }
        return true;
    }

    private boolean mainCategoryCheck() {
        if(mainCategory == null) {
            return false;
        }
        return true;
    }

    private boolean matCodeCheck(String matCode) {
        return true;
    }

    private boolean descriptionCheck() {
        if(description == null) {
            return true;
        }
        else if(description.length()<=500) {
            return true;
        }
        return false;
    }

    private boolean materialTypeCheck(String materialType) {
        return true;
    }

    private boolean locationCheck(String location) {
        return true;
    }

    private boolean datesCheck(String startDate, String endDate) {
      //  if (!startDate.isBlank() || !endDate.isBlank()) {
        //    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
         //   LocalDate start = LocalDate.parse(startDate, formatter);
          //  LocalDate end = LocalDate.parse(endDate, formatter);
         //   LocalDate now = LocalDate.now();
          //  boolean test = ((start.compareTo(end) >= 0) && (start.compareTo(now) >= 0));

        //    return true;
    //    }
        return true;
    }



    private boolean nameCheck(String name) {
        return true;
    }

    private boolean courseCodeCheck(String courseCode) {
        return true;
    }


}
