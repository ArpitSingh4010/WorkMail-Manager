package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String role;
    private String email;
    private String company;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    // Constructor to receive the first name, last name, and company
    public Email(String firstName, String lastName, String company){
        this.firstName= firstName;
        this.lastName= lastName;
        this.company= company;

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        
        // Call a method asking for the role - return the role
        this.role = setRole();

        // Call a method that returns a random password
        this.password= randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"."+department.toLowerCase()+"@"+company.toLowerCase()+".com";
    }

    // Set the department
    private String setDepartment(){
        System.out.print("New Worker: "+firstName+" Enter the department code:\n" +
                "1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "4 for Marketing\n" +
                "5 for HR\n" +
                "6 for IT\n" +
                "7 for Customer Service\n" +
                "8 for Finance\n" +
                "9 for Legal\n" +
                "10 for Operations\n" +
                "11 for R&D\n" +
                "0 for none\n" +
                "Enter department code: ");
        Scanner in= new Scanner(System.in);
        int depChoice=in.nextInt();
        if (depChoice == 1) { return "Sales"; }
        else if (depChoice == 2) { return "Development"; }
        else if (depChoice == 3) { return "Accounting"; }
        else if (depChoice == 4) { return "Marketing"; }
        else if (depChoice == 5) { return "HR"; }
        else if (depChoice == 6) { return "IT"; }
        else if (depChoice == 7) { return "CustomerService"; }
        else if (depChoice == 8) { return "Finance"; }
        else if (depChoice == 9) { return "Legal"; }
        else if (depChoice == 10) { return "Operations"; }
        else if (depChoice == 11) { return "RnD"; }
        else { return ""; }
    }

    // Set the role based on department
    private String setRole(){
        Scanner in= new Scanner(System.in);
        int roleChoice;
        
        switch(department) {
            case "Sales":
                System.out.print("Enter Sales role code:\n1 for Sales Representative\n2 for Account Executive\n3 for Sales Manager\n4 for Business Development Manager\n5 for Regional Sales Manager\n6 for Sales Director\n7 for VP of Sales\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "SalesRep";
                else if (roleChoice == 2) return "AccountExecutive";
                else if (roleChoice == 3) return "SalesManager";
                else if (roleChoice == 4) return "BDM";
                else if (roleChoice == 5) return "RegionalSalesManager";
                else if (roleChoice == 6) return "SalesDirector";
                else if (roleChoice == 7) return "VPSales";
                else return "";
                
            case "Development":
                System.out.print("Enter Development role code:\n1 for Junior Developer\n2 for Developer\n3 for Senior Developer\n4 for Lead Developer\n5 for Software Architect\n6 for Engineering Manager\n7 for VP of Engineering\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "JuniorDev";
                else if (roleChoice == 2) return "Developer";
                else if (roleChoice == 3) return "SeniorDev";
                else if (roleChoice == 4) return "LeadDev";
                else if (roleChoice == 5) return "Architect";
                else if (roleChoice == 6) return "EngineeringManager";
                else if (roleChoice == 7) return "VPEngineering";
                else return "";
                
            case "Accounting":
                System.out.print("Enter Accounting role code:\n1 for Accountant\n2 for Senior Accountant\n3 for Accounting Manager\n4 for Financial Analyst\n5 for Controller\n6 for CFO\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "Accountant";
                else if (roleChoice == 2) return "SeniorAccountant";
                else if (roleChoice == 3) return "AccountingManager";
                else if (roleChoice == 4) return "FinancialAnalyst";
                else if (roleChoice == 5) return "Controller";
                else if (roleChoice == 6) return "CFO";
                else return "";
                
            case "Marketing":
                System.out.print("Enter Marketing role code:\n1 for Marketing Coordinator\n2 for Marketing Specialist\n3 for Marketing Manager\n4 for Brand Manager\n5 for Digital Marketing Manager\n6 for CMO\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "MarketingCoordinator";
                else if (roleChoice == 2) return "MarketingSpecialist";
                else if (roleChoice == 3) return "MarketingManager";
                else if (roleChoice == 4) return "BrandManager";
                else if (roleChoice == 5) return "DigitalMarketingManager";
                else if (roleChoice == 6) return "CMO";
                else return "";
                
            case "HR":
                System.out.print("Enter HR role code:\n1 for HR Assistant\n2 for HR Specialist\n3 for Recruiter\n4 for HR Manager\n5 for HR Business Partner\n6 for CHRO\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "HRAssistant";
                else if (roleChoice == 2) return "HRSpecialist";
                else if (roleChoice == 3) return "Recruiter";
                else if (roleChoice == 4) return "HRManager";
                else if (roleChoice == 5) return "HRBP";
                else if (roleChoice == 6) return "CHRO";
                else return "";
                
            case "IT":
                System.out.print("Enter IT role code:\n1 for IT Support\n2 for System Administrator\n3 for Network Engineer\n4 for IT Manager\n5 for Security Analyst\n6 for CTO\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "ITSupport";
                else if (roleChoice == 2) return "SysAdmin";
                else if (roleChoice == 3) return "NetworkEngineer";
                else if (roleChoice == 4) return "ITManager";
                else if (roleChoice == 5) return "SecurityAnalyst";
                else if (roleChoice == 6) return "CTO";
                else return "";
                
            case "CustomerService":
                System.out.print("Enter Customer Service role code:\n1 for Customer Service Rep\n2 for Senior CS Rep\n3 for Team Lead\n4 for CS Manager\n5 for Customer Success Manager\n6 for Director of Customer Service\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "CSRep";
                else if (roleChoice == 2) return "SeniorCSRep";
                else if (roleChoice == 3) return "CSTeamLead";
                else if (roleChoice == 4) return "CSManager";
                else if (roleChoice == 5) return "CustomerSuccessManager";
                else if (roleChoice == 6) return "DirectorCS";
                else return "";
                
            case "Finance":
                System.out.print("Enter Finance role code:\n1 for Financial Analyst\n2 for Senior Financial Analyst\n3 for Finance Manager\n4 for Treasury Manager\n5 for VP of Finance\n6 for CFO\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "FinancialAnalyst";
                else if (roleChoice == 2) return "SeniorFinancialAnalyst";
                else if (roleChoice == 3) return "FinanceManager";
                else if (roleChoice == 4) return "TreasuryManager";
                else if (roleChoice == 5) return "VPFinance";
                else if (roleChoice == 6) return "CFO";
                else return "";
                
            case "Legal":
                System.out.print("Enter Legal role code:\n1 for Paralegal\n2 for Legal Assistant\n3 for Attorney\n4 for Senior Counsel\n5 for General Counsel\n6 for Chief Legal Officer\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "Paralegal";
                else if (roleChoice == 2) return "LegalAssistant";
                else if (roleChoice == 3) return "Attorney";
                else if (roleChoice == 4) return "SeniorCounsel";
                else if (roleChoice == 5) return "GeneralCounsel";
                else if (roleChoice == 6) return "CLO";
                else return "";
                
            case "Operations":
                System.out.print("Enter Operations role code:\n1 for Operations Coordinator\n2 for Operations Analyst\n3 for Operations Manager\n4 for Senior Operations Manager\n5 for VP of Operations\n6 for COO\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "OpsCoordinator";
                else if (roleChoice == 2) return "OpsAnalyst";
                else if (roleChoice == 3) return "OpsManager";
                else if (roleChoice == 4) return "SeniorOpsManager";
                else if (roleChoice == 5) return "VPOps";
                else if (roleChoice == 6) return "COO";
                else return "";
                
            case "RnD":
                System.out.print("Enter R&D role code:\n1 for Research Assistant\n2 for Researcher\n3 for Senior Researcher\n4 for R&D Manager\n5 for Principal Scientist\n6 for VP of R&D\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "ResearchAssistant";
                else if (roleChoice == 2) return "Researcher";
                else if (roleChoice == 3) return "SeniorResearcher";
                else if (roleChoice == 4) return "RnDManager";
                else if (roleChoice == 5) return "PrincipalScientist";
                else if (roleChoice == 6) return "VPRnD";
                else return "";
                
            default:
                System.out.print("Enter role code:\n1 for Employee\n2 for Manager\n3 for Director\n0 for none\nEnter role code: ");
                roleChoice = in.nextInt();
                if (roleChoice == 1) return "Employee";
                else if (roleChoice == 2) return "Manager";
                else if (roleChoice == 3) return "Director";
                else return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
           int rand=(int) (Math.random()*passwordSet.length()); // random index
           password[i]=passwordSet.charAt(rand); // char at random index
        }
        return new String(password); // convert char array to string
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password=password;
    }   

    public int getMailboxCapacity(){ return mailboxCapacity; }
    public String getAlternateEmail(){ return alternateEmail; }
    public String getPassword(){ return password; }

    public String showInfo(){
        return "Name : "+firstName+" "+lastName+"\n"+"Role : "+role+"\n"+"Department : "+department+"\n"+"Company Email : "+email+"\n"+"Alternate Email : "+alternateEmail+"\n"+"Maximum Capacity : "+mailboxCapacity+"mb";
    }

}
