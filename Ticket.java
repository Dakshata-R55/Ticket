package Ticket;

public abstract class Ticket {
    private String ticId;
    private int pri;
    private String ticTyp;
    private int seats;
    public Customer cus;
    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }


    public String getTicId() {
        return ticId;
    }

    public void setTicId(String ticId) {
        this.ticId = ticId;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }
    public void book(){
        this.pri=this.getSeats()*this.getPri();
        System.out.println("Booking successful");
        System.out.println("price :"+pri);
    }
    public void cancel(){
        System.out.println("Ticket cancelled");
    }

    public String getTicTyp() {
        return ticTyp;
    }

    public void setTicTyp(String ticTyp) {
        this.ticTyp = ticTyp;
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
