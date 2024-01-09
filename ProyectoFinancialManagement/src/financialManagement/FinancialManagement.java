package financialManagement;

import java.util.Scanner;

public class FinancialManagement {
    
/*5. Develop a finance management application with the following features:
*       The user records their total income.
*       There are categories: Medical expenses, household expenses, leisure, savings, and education.
*       The user can list their expenses within the categories and get the total for each category.
*       The user can obtain the total of their expenses.
*       If the user spends the same amount of money they earn, the system should display 
*       a message advising the user to reduce expenses in the category where they have spent
*        the most money.
*       If the user spends less than they earn, the system displays a congratulatory 
*       message on the screen.
*       If the user spends more than they earn, the system will display advice to improve 
*       the user's financial health.

 * 
 * */
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Scanner expenses = new Scanner (System.in);
       double medicalExpenses = 0.0;
       double householdExpenses = 0.0;
       double leisure = 0.0;
       double savings = 0.0;
       double education = 0.0;
       System.out.println("Welcome to your financial management");
       System.out.println("Write your total income for the month");
       double totalIncome = expenses.nextDouble();
       double total=0.0;
       medicalExpenses = medicalExpenses(expenses);
       householdExpenses = householdExpenses(expenses);
       leisure = leisure(expenses);
       savings = savings(expenses);
       education = education(expenses);
       total=medicalExpenses + householdExpenses + leisure + savings + education;
       System.out.println("This is total for each Categorie: \n"
               + "Medical Expenses: " + medicalExpenses + "\n"
               + "Household Expenses: " + householdExpenses + "\n"
               + "Leisure: " + leisure + "\n"
               + "Savings: " + savings + "\n"
               + "Education: " + education + "\n"
               + "Total: " + total);
       if(total == totalIncome) {
           System.out.println("Warning! you are expending almost the same amount of your income");
       }else if(total < totalIncome) {
           System.out.println("Congratulations you are a very good saver ");
       }else if(total > totalIncome) {
           System.out.println("Warning! Improve your financial health");
       }
        
    }
    
    public static double medicalExpenses(Scanner expenses) {
        
        double totalMedicalExpenses = 0.0;
        System.out.println("Write the price of the following items for Medical expenses");
        System.out.println("Payments to doctors, dentists, surgeons, chiropractors, and other nontraditional medical professionlals");
        double paymentsDoctors = expenses.nextDouble();
        System.out.println("Payments for in-patient hospital care or residential nursing home care.");
        double paymentsParientHospital = expenses.nextDouble();
        System.out.println("Payments for weight-loss programs, smoking cessation programs, acupuncture treatments for addiction, or prescription medication.");
        double paymentMedicalPrograms= expenses.nextDouble();
        System.out.println("Payments for prescription eyeglasses, contact lenses, hearing aids, wheelchairs, guide dogs, or other items purchased to aid physical disabilities.");
        double paymentMedicalPrescription = expenses.nextDouble();        
        
        return totalMedicalExpenses = paymentsDoctors +paymentsParientHospital + paymentMedicalPrograms +paymentMedicalPrograms + paymentMedicalPrescription;
        
    }
    
    public static double householdExpenses(Scanner expenses) {
        
        double totalHouseHold = 0.0;
        System.out.println("Write the price of the following items for Household expenses");
        System.out.println("Rent or mortgage payments");
        double rent= expenses.nextDouble();
        System.out.println("Insurance");
        double insurance= expenses.nextDouble(); 
        System.out.println("Condo fees");
        double condoFees= expenses.nextDouble(); 
        System.out.println("Electricity");
        double electricity= expenses.nextDouble();
        System.out.println("Internet");
        double internet= expenses.nextDouble();
        System.out.println("Gas");
        double gas= expenses.nextDouble();
        System.out.println("Debt payments: Car payments,  credit card payments.");
        double debPayments= expenses.nextDouble();
        System.out.println("Subscriptions: Netflix, Spotify, gym memberships, magazine subscriptions.");
        double subscriptions= expenses.nextDouble();
        
        return totalHouseHold= rent + insurance + condoFees + electricity+ internet + gas + debPayments + subscriptions;
        
    }
    
    public static double leisure(Scanner expenses) {
        
        double totalLeisure = 0.0;
        System.out.println("Write the price of the following items for leisure expenses");
        System.out.println("Live events: Tickets to concerts, sporting events, plays, theater shows, etc.");
        double liveEvents = expenses.nextDouble();
        System.out.println("Movies and games: Cinema tickets, video game purchases, arcade visits, etc.");
        double moviesGames = expenses.nextDouble();
        System.out.println("Restaurants and bars: Eating out, brunch, coffee shops, cocktails, etc.");
        double restaurantsBars = expenses.nextDouble();
        System.out.println("Vacations and getaways: Flights, hotels, car rentals, travel tours, cruises, etc.");
        double  vacations = expenses.nextDouble();
        System.out.println("Outdoor activities: Hiking, camping, skiing, kayaking, paddleboarding, etc.");
        double  outdoors = expenses.nextDouble();
        System.out.println("Workshops and classes: Cooking classes, wine tastings, photography workshops, etc.");
        double  workshopsClasses = expenses.nextDouble();
        System.out.println("Gaming and technology: Video games, consoles, mobile apps, online subscriptions, etc.");
        double  gaming = expenses.nextDouble();
        System.out.println("Books and magazines: Purchases of novels, comics, subscriptions, etc.");
        double  books = expenses.nextDouble();
        System.out.println("Pets and hobbies: Pet supplies, photography equipment, music instruments, crafting materials, etc.");
        double  petsHobbies = expenses.nextDouble();
        
        return totalLeisure = liveEvents + moviesGames + restaurantsBars + vacations + outdoors + workshopsClasses + gaming + books + petsHobbies;
        
    }
    
    public static double savings(Scanner expenses) {
         
        double totalSavings = 0.0;
        System.out.println("Write the price of the following items for saving expenses");
        System.out.println("Emergency fund: Aim for 3-6 months of living expenses to cover unexpected costs like car repairs, medical bills, or job loss.");
        double emergencyFund = expenses.nextDouble();
        System.out.println("Vacation or trip: Save for a dream vacation or weekend getaway.");
        double vacation = expenses.nextDouble();
        System.out.println("Large purchase: New furniture, appliances, electronics, etc.");
        double largePurchase = expenses.nextDouble();
        System.out.println("Retirement: Start saving early for a comfortable retirement income.");
        double retirement = expenses.nextDouble();
        
        return totalSavings = emergencyFund + vacation + largePurchase + retirement; 
        
    }
    
    public static double education(Scanner expenses) {
        
        double totalSavings = 0.0;
        System.out.println("Write the price of the following items for education expenses");
        System.out.println("College and university");
        double college = expenses.nextDouble();
        System.out.println("Textbooks, course materials, and other required supplies can add up quickly, especially for specialized or upper-level courses.");
        double textBooks = expenses.nextDouble();
        System.out.println("Transportation");
        double transportation = expenses.nextDouble();
        
        return totalSavings= college +  textBooks + transportation;
        
    }
}
