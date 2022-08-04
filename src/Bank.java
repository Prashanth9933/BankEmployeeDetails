import java.sql.Time;

public class Bank
{
 static  String bankName="AXIS BANK";
         String empName;
    static int bankOpenTiming=8;
    static int bankCloseTiming=6;
      int  empId;
     String empProf;
     public static void main(String[] args)
     {
         System.out.println("Bank Opening time is "+bankOpenTiming+" AM");
         System.out.println("Bank CLosing time is "+bankCloseTiming+" PM");
         System.out.println("-------------------------------------------");
         System.out.println("Employee Details");
         System.out.println("-------------------------------------------");

      Bank emp1=new Bank();
      emp1.empName="Prashanth";
      emp1.empId=123;
      emp1.empProf="clerk";

         System.out.println("Employee bank name is:"+bankName);
         System.out.println("Employee name is:"+emp1.empName);
         System.out.println(emp1.empName+" id is:"+emp1.empId);
         System.out.println(emp1.empName+" Profession is:"+emp1.empProf);
         System.out.println("-------------------------------------------");


         Bank emp2=new Bank();
         emp2.empName="Aravindh";
         emp2.empId=234;
         emp2.empProf="Assistant Manager";

         System.out.println("Employee bank name is:"+bankName);
         System.out.println("Employee name is:"+emp2.empName);
         System.out.println(emp2.empName+" id is:"+emp2.empId);
         System.out.println(emp2.empName+" Profession is:"+emp2.empProf);
         System.out.println("-------------------------------------------");


   }
}

