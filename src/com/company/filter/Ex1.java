package com.company.filter;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {


    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"bala",5600,78));
        students.add(new Student(2,"krishnan",8900,564));


      List<Student> students1=  students.stream().filter(f->f.getName().length()>3).filter(f->f.getMarks()>5000).collect(Collectors.toList());
        System.out.println(students1);
    }
}
