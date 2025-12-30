package Ticket;

public class PrmTic extends Ticket {



    PrmTic(Customer cus){
        this.cus=cus;
        this.setSeats(cus.getSeats());
    }

    PrmTic(int price,String ticId){
        this.setTicId("j45");
        this.setPri(400);

    }
    PrmTic(){}

   @Override
   public void cancel(){
       System.out.println("you can't cancel the ticket");
   }
}
