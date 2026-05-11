class bank{
    void Intrest(){
        int intrest_rate = 10;
        System.out.println("the intrest rate is " + intrest_rate);

    }
}
 class SBI extends bank{
    void Intrest(){
        int intrest = 8;
        System.out.println("the intrest rate is + intrest_rate");

    }
 }

 public class p15day3{
 public static void main(String[] args){
 bank b = new bank();
 b.Intrest();
 SBI s = new SBI();
 s.Intrest();
 }
}


