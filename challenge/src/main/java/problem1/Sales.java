package problem1;
import com.sun.tools.javac.Main;

import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {   int SALESPEOPLE;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        SALESPEOPLE=sc.nextInt();
        //final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            int j = i+1;
            System.out.print("Enter sales for salesperson " + j + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);


        //Computing the average sale:
        double AverageSale = sum/sales.length;
        System.out.println("\nAverage sales: " + AverageSale);
        //finding the max sale;
        double maxSale = Sales.maxSales(sales);
        System.out.println("\nMaximum sales: " + maxSale);

        //finding the min sale;
        double minSale = Sales.minSales(sales);
        System.out.println("Minimum sales: " + minSale);

        //total number of salesperson abouve amount;
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scan2.nextInt();
        int totalnumber = Sales.SalespeopleAbouveAmount(sales, amount);
        System.out.println(" total number of salespeople whose sales exceeded "+amount + " is "+  totalnumber);

    }
    //function for finding the maximum sale:
    public static double maxSales(int[] sales){
        double max = sales[0];
        for (int i = 0; i < sales.length; i++){
            if (sales[i] > max){
                max = sales[i];
            }
        }
        return max;
    }
    //function for finding the minimum Sale;
    public static double minSales(int[] sales){
        double min = sales[0];
        for (int i = 0; i < sales.length; i++){
            if (sales[i] < min){
                min = sales[i];

            }
        }
        return min;
    }
    //asking the user to enter their amount sales, and finding salespeaople who exceeded the entered value;
    public static int SalespeopleAbouveAmount(int[] sales, double amount){
        int totalnumberofsalesabouveamount = 0;
        for (int i=0; i<sales.length; i++){
            if (sales[i] > amount){
                totalnumberofsalesabouveamount += 1;
            }
        }
        return totalnumberofsalesabouveamount;
    }

}