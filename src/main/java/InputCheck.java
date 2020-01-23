import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class InputCheck {


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
    String rivi = "1;2;3;4;5;6;7;8;9;10;11";


    String[] parts = rivi.split(";");
    String courseCode = parts[0]; // 1
    String Name = parts[1]; // 2
    String StartDate = parts[2]; // 3
    String EndDate = parts[3]; // 4
    String Location = parts[4]; // 5
    String MaterialType = parts[5]; // 6
    String Description = parts[6]; // 7
    String MatCode = parts[7]; // 8
    String MaterialType = parts[8]; // 9
    String MainCategory = parts[9]; // 10
    String SubCategory = parts[10]; // 11



}
