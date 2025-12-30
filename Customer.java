package Ticket;

public class Customer extends Ticket{

    private String ticTyp;
    private RegTic rt;
    private PrmTic pt;

Customer(RegTic rt){
    this.rt=rt;
    this.setTicId(rt.getTicId());
    this.setPri(rt.getPri());
}
    Customer(PrmTic pt){
        this.pt=pt;
        this.setTicId(pt.getTicId());
        this.setPri(pt.getPri());
    }


    Customer(String ticTyp,int seats){
       this.setTicTyp("reg");
       this.setSeats(5);
   }







Customer(){}


    public String getTicTyp() {
        return ticTyp;
    }

    public void setTicTyp(String ticTyp) {
        this.ticTyp = ticTyp;
    }



    public RegTic getRt() {
        return rt;
    }

    public void setRt(RegTic rt) {
        this.rt = rt;
    }

    public PrmTic getPt() {
        return pt;
    }

    public void setPt(PrmTic pt) {
        this.pt = pt;
    }
}
