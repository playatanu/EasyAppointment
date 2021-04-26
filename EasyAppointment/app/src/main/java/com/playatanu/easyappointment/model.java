package com.playatanu.easyappointment;


public class model
{
    String name,course;
    model()
    {

    }
    public model(String name, String course, String email, String purl) {
        this.name = name;
        this.course = course;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }


}
