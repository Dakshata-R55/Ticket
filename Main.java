package Ticket;

public class Main {
    public static void main(String args[]){
Customer cus =new Customer("reg",4);

Customer cus1=new Customer();
cus1.setTicTyp("prm");
cus1.setSeats(7);

if(cus.getTicTyp().equals("reg")){
    System.out.println(cus.getTicTyp());
    RegTic rt=new RegTic(200,"7hhu");
   
cus.setRt(rt);
rt.setCus(cus);
     rt.book();

}
if(cus1.getTicTyp().equals("prm")){
    System.out.println(cus1.getTicTyp());
    PrmTic pt=new PrmTic();
    pt.setTicId("ce78");
    pt.setPri(400);
   
    cus1.setPt(pt);
    pt.setCus(cus1);
     pt.book();

}System.out.println(cus.getRt());
        System.out.println(cus.getPri());
        System.out.println(cus1.getRt());
        System.out.println(cus1.getPri());
    }
}

