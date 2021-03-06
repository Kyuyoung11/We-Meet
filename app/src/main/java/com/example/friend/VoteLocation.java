package com.example.friend;

import android.util.Log;

import java.util.concurrent.ExecutionException;

public class VoteLocation {
    private String schedule_name;
    private String schedule_id;
    private String total_mem;
    private String location;
    private String yes;
    private String no;

    public VoteLocation(){

    }

    public VoteLocation(String schedule_id, String schedule_name){
        this.schedule_id = schedule_id;
        this.schedule_name = schedule_name;
    }

    public VoteLocation(String schedule_id, String schedule_name, String location){
        this.schedule_id = schedule_id;
        this.schedule_name = schedule_name;
        this.location = location;
    }

    public String getSchedule_id() {
        return schedule_id;
    }

    public String getSchedule_name() {
        return schedule_name;
    }

    public String getTotal_mem() {
        return total_mem;
    }


    public String getLocation() {
        return location;
    }

    public String getYes() {
        return yes;
    }

    public String getNo() {
        return no;
    }

    public void setSchedule_id(String schedule_id) {
        this.schedule_id = schedule_id;
    }

    public void setSchedule_name(String schedule_name) {
        this.schedule_name = schedule_name;
    }

    public void setTotal_mem(String total_mem) {
        this.total_mem = total_mem;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setYes(String yes) {
        this.yes = yes;
    }

    public void setNo(String no) {
        this.no = no;
    }
}