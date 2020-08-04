package com.tts.transitapp.model;

public class Bus {

    public String ADHERENCE;
    public String BLOCKID;
    public String BLOCK_ABBR;
    public String DIRECTION;
    public String LATITUDE;
    public String LONGITUDE;
    public String MSGTIME;
    public String ROUTE;
    public String STOPID;
    public String TIMEPOINT;
    public String TRIPID;
    public String VEHICLE;
    public double distance;

    public Bus() {
    }

    public Bus(String aDHERENCE, String bLOCKID, String bLOCK_ABBR, String dIRECTION, String lATITUDE, String lONGITUDE,
            String mSGTIME, String rOUTE, String sTOPID, String tIMEPOINT, String tRIPID, String vEHICLE,
            double distance) {
        this.ADHERENCE = aDHERENCE;
        this.BLOCKID = bLOCKID;
        this.BLOCK_ABBR = bLOCK_ABBR;
        this.DIRECTION = dIRECTION;
        this.LATITUDE = lATITUDE;
        this.LONGITUDE = lONGITUDE;
        this.MSGTIME = mSGTIME;
        this.ROUTE = rOUTE;
        this.STOPID = sTOPID;
        this.TIMEPOINT = tIMEPOINT;
        this.TRIPID = tRIPID;
        this.VEHICLE = vEHICLE;
        this.distance = distance;
    }

    public String getADHERENCE() {
        return ADHERENCE;
    }

    public void setADHERENCE(String aDHERENCE) {
        this.ADHERENCE = aDHERENCE;
    }

    public String getBLOCKID() {
        return BLOCKID;
    }

    public void setBLOCKID(String bLOCKID) {
        this.BLOCKID = bLOCKID;
    }

    public String getBLOCK_ABBR() {
        return BLOCK_ABBR;
    }

    public void setBLOCK_ABBR(String bLOCK_ABBR) {
        this.BLOCK_ABBR = bLOCK_ABBR;
    }

    public String getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(String dIRECTION) {
        this.DIRECTION = dIRECTION;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String lATITUDE) {
        this.LATITUDE = lATITUDE;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String lONGITUDE) {
        this.LONGITUDE = lONGITUDE;
    }

    public String getMSGTIME() {
        return MSGTIME;
    }

    public void setMSGTIME(String mSGTIME) {
        this.MSGTIME = mSGTIME;
    }

    public String getROUTE() {
        return ROUTE;
    }

    public void setROUTE(String rOUTE) {
        this.ROUTE = rOUTE;
    }

    public String getSTOPID() {
        return STOPID;
    }

    public void setSTOPID(String sTOPID) {
        this.STOPID = sTOPID;
    }

    public String getTIMEPOINT() {
        return TIMEPOINT;
    }

    public void setTIMEPOINT(String tIMEPOINT) {
        this.TIMEPOINT = tIMEPOINT;
    }

    public String getTRIPID() {
        return TRIPID;
    }

    public void setTRIPID(String tRIPID) {
        this.TRIPID = tRIPID;
    }

    public String getVEHICLE() {
        return VEHICLE;
    }

    public void setVEHICLE(String vEHICLE) {
        this.VEHICLE = vEHICLE;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    
    
    
}
