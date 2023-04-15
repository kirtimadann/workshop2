package com.bl.workshp;

public class Hospital {


    String hospitalname;
    String hospitaladdress;
    int hospitalrank;
    int hospitalid;

    public Hospital(String hospitalname, String hospitaladdress, int hospitalrank, int hospitalid) {
        this.hospitalname = hospitalname;
        this.hospitaladdress = hospitaladdress;
        this.hospitalrank = hospitalrank;
        this.hospitalid = hospitalid;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getHospitaladdress() {
        return hospitaladdress;
    }

    public void setHospitaladdress(String hospitaladdress) {
        this.hospitaladdress = hospitaladdress;
    }

    public int getHospitalrank() {
        return hospitalrank;
    }

    public void setHospitalrank(int hospitalrank) {
        this.hospitalrank = hospitalrank;
    }

    public int getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }
}
