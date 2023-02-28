package com.kzy._29data_access_object;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }
        //更新学生
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);
        //获取学生
        Student daoStudent = studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + daoStudent.getRollNo() + ", Name : " + daoStudent.getName() + " ]");
    }
}