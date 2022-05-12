package com.aman;

import java.util.Scanner;

class FullTimeEmp extends Employee
{

    void calSal()
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the no.of working days");
        int days=s.nextInt();

        System.out.println("Enter wage per day");
        int wage=s.nextInt();

        System.out.println("Salary For FullTimeEmp:"+(days*wage));
    }
    public static void main(String args[])
    {
        PartTimeEmp p=new PartTimeEmp();
        p.calSal();

        FullTimeEmp f=new FullTimeEmp();
        f.calSal();
    }
}