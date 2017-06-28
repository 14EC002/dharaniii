import java.io.*;

import java.util.*;

class armstrong{
public static void main(String[] args){
int n,a,c=0,temp=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if (temp==c)
{
System.out.println("armstrong");

}
else
{
System.out.println("not armstrong");
}
}
}
