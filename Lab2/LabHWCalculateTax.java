/*
 * Written By Pawit Thongkum
 * ID : 6530300970
 */

import java.util.Scanner;

public class LabHWCalculateTax {
    public static void main(String[] args) {
        
        // Declare a variable
        Scanner sc = new Scanner(System.in);
        int salary, yearCost, taxDeducion, otherIncome, totalIncome = 0, totalTax = 0, i = 0;
        int[] step = new int[6];
        char otherIncomeCheck;
        String bin;
        
        // Get General Input
        System.out.print("Enter Salary : ");
        salary = sc.nextInt();
        System.out.print("Enter Year cost : ");
        yearCost = sc.nextInt();
        System.out.print("Enter Tax deduction : ");
        taxDeducion = sc.nextInt();
        System.out.print("\nYou have other income? (N/Y) : ");
        sc.nextLine();
        bin = sc.nextLine();
        otherIncomeCheck = bin.charAt(0);
        
        // Check other Income And Calculate Total Income
        if (otherIncomeCheck == 'Y') {
            System.out.print("Input other income : ");
            otherIncome = sc.nextInt();
            totalIncome += ((salary * 12) - yearCost - taxDeducion + otherIncome);
            System.out.printf("\nIncome : (%dx12) - %d - %d + %d = %d", salary, yearCost, taxDeducion, otherIncome, totalIncome);
        } else {
            totalIncome += ((salary * 12) - yearCost - taxDeducion);
            System.out.printf("\nIncome : (%dx12) - %d - %d = %d", salary, yearCost, taxDeducion, totalIncome);
        }
        // Check Tax Percentage and Calculate Total Tax
        if (totalIncome >= 5000000) {
            System.out.println("\nTax is 35%");
            step[7-1] = (totalIncome-5000000)*35/100; // Step 7
            System.out.println("\nStep 7\nCal Tax "+totalIncome+" - 150000 = "+(totalIncome-150000)+" - 150000 = "+(totalIncome-300000)+" - 200000 = "+(totalIncome-500000)+
            " - 250000 = "+(totalIncome-750000)+" - 250000 = "+(totalIncome-1000000)+" - 1000000 = "+(totalIncome-2000000)+" - 3000000 = "+(totalIncome-5000000)+" * 35% = "+step[7-1]);
            step[6-1] = (3000000*30/100); // Step 6
            System.out.println("Step 6\nCal Tax 3000000 * 30% ="+step[6-1]);
            step[5-1] = (1000000*25/100); // Step 5
            System.out.println("Step 5\nCal Tax 1000000 * 25% ="+step[5-1]);
            step[4-1] = (250000*20/100); // Step 4
            System.out.println("Step 4\nCal Tax 250000 * 20% = "+step[4-1]);
            step[3-1] = (250000*15/100); // Step 3
            System.out.println("Step 3\nCal Tax 250000 * 15% = "+step[3-1]);
            step[2-1] = (200000*10/100); // Step 2
            System.out.println("Step 2\nCal Tax 200000 * 10% = "+step[2-1]);
            step[1-1] = (150000*5/100); // Step 1
            System.out.println("Step 1\nCal Tax 150000 * 5% = "+step[1-1]);
            while (i <= 6) {
                totalTax += step[i];
                i++;
            }
        } else {
            if (totalIncome >= 2000000) {
                System.out.println("\nTax is 30%");
                step[6-1] = (totalIncome-2000000)*30/100; // Step 6
                System.out.println("\nStep 6\nCal Tax "+totalIncome+" - 150000 = "+(totalIncome-150000)+" - 150000 = "+(totalIncome-300000)+" - 200000 = "+(totalIncome-500000)+
                " - 250000 = "+(totalIncome-750000)+" - 250000 = "+(totalIncome-1000000)+" - 1000000 = "+(totalIncome-2000000)+" * 30% = "+step[6-1]);
                step[5-1] = (1000000)*25/100; // Step 5
                System.out.println("Step 5\nCal Tax 1000000 * 25% ="+step[5-1]);
                step[4-1] = (250000)*20/100; // Step 4
                System.out.println("Step 4\nCal Tax 250000 * 20% = "+step[4-1]);
                step[3-1] = (250000*15/100); // Step 3
                System.out.println("Step 3\nCal Tax 250000 * 15% = "+step[3-1]);
                step[2-1] = (200000*10/100); // Step 2
                System.out.println("Step 2\nCal Tax 200000 * 10% = "+step[2-1]);
                step[1-1] = (150000*5/100); // Step 1
                System.out.println("Step 1\nCal Tax 150000 * 5% = "+step[1-1]);
                while (i <= 5) {
                    totalTax += step[i];
                    i++;
                }
            } else {
                if (totalIncome >= 1000000) {
                    System.out.println("\nTax is 25%");
                    step[5-1] = (totalIncome-1000000)*25/100; // Step 5
                    System.out.println("\nStep 5\nCal Tax "+totalIncome+" - 150000 = "+(totalIncome-150000)+" - 150000 = "+(totalIncome-300000)+" - 200000 = "+(totalIncome-500000)+
                    " - 250000 = "+(totalIncome-750000)+" - 250000 = "+(totalIncome-1000000)+" * 25% = "+step[5-1]);
                    step[4-1] = (250000)*20/100; // Step 4
                    System.out.println("Step 4\nCal Tax 250000 * 20% = "+step[4-1]);
                    step[3-1] = (250000*15/100); // Step 3
                    System.out.println("Step 3\nCal Tax 250000 * 15% = "+step[3-1]);
                    step[2-1] = (200000*10/100); // Step 2
                    System.out.println("Step 2\nCal Tax 200000 * 10% = "+step[2-1]);
                    step[1-1] = (150000*5/100); // Step 1
                    System.out.println("Step 1\nCal Tax 150000 * 5% = "+step[1-1]);
                    while (i <= 4) {
                        totalTax += step[i];
                        i++;
                    }
                } else {
                    if (totalIncome >= 750000) {
                        System.out.println("\nTax is 20%");
                        step[4-1] = (totalIncome-750000)*20/100; // Step 4
                        System.out.println("\nStep 4\nCal Tax "+totalIncome+" - 150000 = "+(totalIncome-150000)+" - 150000 = "+(totalIncome-300000)+" - 200000 = "+(totalIncome-500000)+
                        " - 250000 = "+(totalIncome-750000)+" * 20% = "+step[4-1]);
                        step[3-1] = (250000*15/100); // Step 3
                        System.out.println("Step 3\nCal Tax 250000 * 15% = "+step[3-1]);
                        step[2-1] = (200000*10/100); // Step 2
                        System.out.println("Step 2\nCal Tax 200000 * 10% = "+step[2-1]);
                        step[1-1] = (150000*5/100); // Step 1
                        System.out.println("Step 1\nCal Tax 150000 * 5% = "+step[1-1]);
                        while (i <= 3) {
                            totalTax += step[i];
                            i++;
                        }
                    } else {
                        if (totalIncome >= 500000) {
                            System.out.println("\nTax is 15%");
                            step[3-1] = (totalIncome-500000)*15/100; // Step 3
                            System.out.println("\nStep 3\nCal Tax "+totalIncome+" - 150000 = "+(totalIncome-150000)+" - 150000 = "+(totalIncome-300000)+" - 200000 = "+(totalIncome-500000)+" * 15% = "+step[3-1]);
                            step[2-1] = (200000*10/100); // Step 2
                            System.out.println("Step 2\nCal Tax 200000 * 10% = "+step[2-1]);
                            step[1-1] = (150000*5/100); // Step 1
                            System.out.println("Step 1\nCal Tax 15000 * 5% = "+step[1-1]);
                            while (i <= 2) {
                                totalTax += step[i];
                                i++;
                            }
                        } else {
                            if (totalIncome >= 300000) {
                                System.out.println("\nTax is 10%");
                                step[2-1] = (totalIncome-300000)*10/100; // Step 2
                                System.out.println("\nStep 2\nCal Tax "+totalIncome+" - 150000 = "+(totalIncome-150000)+" - 150000 = "+(totalIncome-300000)+" * 10% = "+step[2-1]);
                                step[1-1] = (150000*5/100); // Step 1
                                System.out.println("Step 1\nCal Tax 15000 * 5% = "+step[1-1]);
                                while (i <= 1) {
                                    totalTax += step[i];
                                    i++;
                                }
                            } else {
                                if (totalIncome >= 150000) {
                                    System.out.println("\nTax is 5%");
                                    totalTax = (totalIncome-150000)*5/100;
                                    System.out.println("\nCal Tax "+totalIncome+" - 150000 = "+(totalIncome-150000)+" * 5% = "+totalTax);
                                } else {
                                    System.out.println("\nTax is 0%");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (totalTax == 0) {
            System.out.println("Your Tax = Free Tax\n");
        } else {
            System.out.println("Your Tax = "+totalTax+" BTH\n");
        }
        sc.close();
    }
}