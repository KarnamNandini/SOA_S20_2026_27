package com.klu.cartapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {

    @Id
    private int cid;

    private int pid;
    private int qid;

    public Cart() {
    }

    public Cart(int cid, int pid, int qid) {
        this.cid = cid;
        this.pid = pid;
        this.qid = qid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "Cart [cid=" + cid + ", pid=" + pid + ", qid=" + qid + "]";
    }
}