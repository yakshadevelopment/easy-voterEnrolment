package java8.easy.voterEnrolment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static boolean calculateAge(String birthDate) throws ParseException
	{
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date dob=simpleDateFormat.parse(birthDate);
		Calendar calendar=Calendar.getInstance();
		 calendar.setTime(dob);
		 int year=calendar.get(Calendar.YEAR);
		 int month=calendar.get(Calendar.MONTH)+1;
		 int day=calendar.get(Calendar.DATE);
		 LocalDate dateOfBirth=LocalDate.of(year, month, day);
		 LocalDate today=LocalDate.now();
		 Period difference=Period.between(dateOfBirth,today);
		 int age=difference.getYears();
		 if(age>=18)
			 return true;
		 else
			 return false;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Person's Date of birth (dd-mm-yyyy):");
		String birthDate=scanner.nextLine();
		try
		{
			if(calculateAge(birthDate))
				System.out.println("Valid age");
			else
				System.out.println("Invalid age");
		 }
		catch(ParseException pe)
		{
			System.out.println("Wrong Date Format.");
		}
	}
}