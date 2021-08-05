/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarksManagementSystem;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Program {

    StudentMark arrayList[] = {};

    public void menu() {
        System.out.println("1. Insert new Student :");
        System.out.println("2. View list of Student :");
        System.out.println("3. Average Mark :");
        System.out.println("4. Exit.");
    }

    public void insert() {
        StudentMark s = new StudentMark();
        StudentMark newarrayList[] = new StudentMark[arrayList.length + 1];
        for (int i = 0; i < arrayList.length; i++) {
            newarrayList[i] = arrayList[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("FullName :");
        s.fullname = sc.nextLine();
        System.out.println("Class :");
        s.Class = sc.nextLine();
        System.out.println("Semester :");
        s.Semester = sc.nextInt();
        s.id ++;
        System.out.println("5 subjectmarks :");
        s.subjectMarkList[0] = sc.nextInt();
        s.subjectMarkList[1] = sc.nextInt();
        s.subjectMarkList[2] = sc.nextInt();
        s.subjectMarkList[3] = sc.nextInt();
        s.subjectMarkList[4] = sc.nextInt();
        
        newarrayList[arrayList.length] = s;
        arrayList = newarrayList;

    }

    public void run() {
        while (true) {
            menu();

            System.out.println("nhap thao tac :");
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            if (numb == 1) {
                insert();
            } else if (numb == 2) {
                for (StudentMark s : arrayList) {
                    s.display();
                }

            } else if (numb == 3) {
                for (StudentMark s : arrayList) {
                    s.aveCal();
                    s.display();
                }
            } else if (numb == 4){
                    break;
            }else{
                System.out.println("Nhap Thao Tac");
            }
        }
    }
}
