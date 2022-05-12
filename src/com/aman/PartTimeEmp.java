package com.aman;

import java.util.Scanner;

class PartTimeEmp extends Employee
{
    void calSal()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of working hrs");
        int hrs=s.nextInt();
        System.out.println("Enter the wage per hr");
        int wage=s.nextInt();
        System.out.println("Salary For PartTime Employee::"+(hrs*wage));
    }
}

