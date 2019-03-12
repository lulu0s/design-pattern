package org.halo.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class ResumeTest {
    public static void main(String[] args) {
        try {
            List<WorkExperience> list = new ArrayList<WorkExperience>();
            list.add(new WorkExperience("互联网A公司","10"));
            list.add(new WorkExperience("互联网B公司","5"));

            Resume resume  = new Resume("张三","139****8909","毕业院校",list);


            Resume copy = (Resume) resume.clone();
            System.out.println(copy.getExperienceList());
            System.out.println(resume.getExperienceList());
            System.out.println(copy.getExperienceList() == resume.getExperienceList());
            System.out.println(copy== resume);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
