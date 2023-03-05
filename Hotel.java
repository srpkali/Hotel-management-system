
import java.util.*;
public class Hotel{
public static void main (String[] args)
{
     int qty,amt,bill=0,i;
     Scanner in=new Scanner(System.in);
     System.out.println("welcome to hotel A2B");
     do
{
     System.out.println("1.dosa");
     System.out.println("2.idly");
     System.out.println("3.pongal");
     System.out.println("4.mini tiffen");
     System.out.println("5.vada");
     System.out.println("choose the number for ordering food");
     int ch=in.nextInt();
     switch(ch)
{
   case 1:
     System.out.println("dosa quantity?");
     qty=in.nextInt();
     amt=qty*30;
     bill=bill+amt;
     break;

 case 2:
     System.out.println("idly quantity?");
     qty=in.nextInt();
     amt=qty*15;
     bill=bill+amt;
     break;

case 3:
     System.out.println("pongal quantity?");
     qty=in.nextInt();
     amt=qty*30;
     bill=bill+amt;
     break;

case 4:
     System.out.println("mini tiffen quantity?");
     qty=in.nextInt();
     amt=qty*50;
     bill=bill+amt;
     break;

case 5:
     System.out.println("vada quantity?");
     qty=in.nextInt();
     amt=qty*10;
     bill=bill+amt;
     break;

     default:
     System.out.println("sorry,invalid food ....so choice valid food");
     break;

}
     System.out.println("you want continue press 1 ...or... press 0");
     i=in.nextInt();
}
     while(i==1);
     System.out.println("your total bill is:"+ bill);

}
}