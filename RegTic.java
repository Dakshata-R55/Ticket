package Ticket;

public class RegTic extends Ticket {



RegTic(Customer cus){
    this.cus=cus;
    this.setSeats(cus.getSeats());

}

RegTic(int price,String ticId){
    this.setTicId("f45");
    this.setPri(200);

}
RegTic(){}


}
