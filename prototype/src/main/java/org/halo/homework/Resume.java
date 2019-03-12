package org.halo.homework;

import java.io.*;
import java.util.List;

/**
 *  简历复印
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class Resume implements Cloneable,Serializable {
    private String name;
    private String phone;
    private String school;

    private List<WorkExperience> experienceList;


    public Resume(String name, String phone, String school, List<WorkExperience> experienceList) {
        this.name = name;
        this.phone = phone;
        this.school = school;
        this.experienceList = experienceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public List<WorkExperience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<WorkExperience> experienceList) {
        this.experienceList = experienceList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }
    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Resume copy = (Resume)ois.readObject();
            return copy;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
