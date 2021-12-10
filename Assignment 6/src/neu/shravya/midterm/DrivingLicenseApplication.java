package neu.shravya.midterm;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void  ReadAgeFromConsole() {
        try
        {
            ReadDateOfBirth();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void ReadDateOfBirth() throws Exception {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Enter date format (yyyy-mm-dd):");
        String str = input.nextLine();
        Date date;
        if(null != str && str.trim().length() > 0) {
            date = format.parse(str);

            System.out.println(date);
            LocalDate start = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate stop = LocalDate.now(ZoneId.systemDefault());
            long age = java.time.temporal.ChronoUnit.YEARS.between( start , stop );
            if(age < 16)
            {
                throw new Exception("The age of the applicant is " + age + " which is too early to apply for a driving license");
            }

            System.out.println("Years of age of the person born on:" + date + " is " + age + " can have drivers license");
        }
        else {
            throw new Exception("Enter date format (yyyy-mm-dd):");
        }
    }
}
