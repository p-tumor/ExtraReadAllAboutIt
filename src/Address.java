public class Address {
    private String srtNumber,srtName,aptNum,city,state,zip;

    public Address(String srtNumber, String srtName, String aptNum, String city, String state, String zip) {
        this.srtNumber = srtNumber;
        this.srtName = srtName;
        this.aptNum = aptNum;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(Address a) {
        this.srtNumber = a.getSrtNumber();
        this.srtName = getSrtName();
        this.aptNum = a.getAptNum();
        this.city = a.getCity();
        this.state = a.getState();
        this.zip = a.getZip();
    }

    public Address(String s) {
        StringBuilder temp = new StringBuilder(s);
        this.srtNumber = temp.substring(0,temp.indexOf(" "));
        temp.delete(0,temp.indexOf(" ")+1);
        this.srtName = temp.substring(0,temp.indexOf("Apt")-1);
        temp.delete(0,temp.indexOf("Apt"));
        temp.delete(0,temp.indexOf(" ")+1);
        this.aptNum = temp.substring(0,temp.indexOf(","));
        temp.delete(0,temp.indexOf(",")+2);
        this.city = temp.substring(0,temp.indexOf(","));
        temp.delete(0,temp.indexOf(",")+2);
        this.state = temp.substring(0,temp.indexOf(" "));
        temp.delete(0,temp.indexOf(" ")+1);
        this.zip = temp.toString();
    }

    public String getSrtNumber() {
        return srtNumber;
    }

    public String getSrtName() {
        return srtName;
    }

    public String getAptNum() {
        return aptNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String toString(){
        return srtNumber + " " + srtName + " " + "Apt " + aptNum + ", " + city + ", " + state + " " + zip;
    }
}