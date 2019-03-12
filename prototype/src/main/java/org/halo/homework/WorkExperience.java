package org.halo.homework;

import java.io.Serializable;

/**
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class WorkExperience implements Serializable{
    private String company;
    private String workTime;

    public WorkExperience(String company, String workTime) {
        this.company = company;
        this.workTime = workTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
}
