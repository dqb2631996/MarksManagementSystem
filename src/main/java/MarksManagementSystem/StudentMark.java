/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarksManagementSystem;

/**
 *
 * @author mac
 */
public class StudentMark implements IStudentMark {

    String fullname;
    int id;
    String Class;
    int Semester;
    float AverageMark;
    
    int subjectMarkList [] = new int[5];

    @Override
    public void display() {
        System.out.println(id);
        System.out.println(fullname);
        System.out.println(Class);
        System.out.println(Semester);
        System.out.println(AverageMark);
    }
    public void aveCal() {
    AverageMark =(float) ( subjectMarkList[0]+subjectMarkList[1]+subjectMarkList[2]+subjectMarkList[3]+subjectMarkList[4] ) / 5;
    
}
    


}
