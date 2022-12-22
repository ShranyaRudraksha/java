import java.util.Scanner;
class exp1{
    public static void main(String[] args){
        Double GS,BS,DA,NS,HRA,PF,CCA=240.0;
        String EN;
        int ENo;
        Scanner obj = new Scanner(System.in);
        try
        {
            System.out.println("Enter the Employee name : ");
            EN = obj.nextLine();
            System.out.println("Enter the employee number : ");
            ENo = obj.nextInt();
            System.out.println("Enter the BS : ");
            BS = obj.nextDouble();
            DA=0.7*BS;
            HRA=0.3*BS;
            PF=0.1*BS;
            GS=DA+HRA+PF+CCA;
            System.out.println("The Gross Salary is : "+GS);
            NS=GS+100;
            System.out.println("The Net Salary is : "+NS);
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}
