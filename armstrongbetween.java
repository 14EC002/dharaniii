import java.io.*;

import java.util.*;

class armstrongbetween{
public static void main(String[] args){
int n1,n2,n=0,a,c=0,temp=0;
Scanner in=new Scanner(System.in);
n1=in.nextInt();
Scanner s=new Scanner(System.in);
n2=s.nextInt();
for (int i=n1;i<n2;i++)
{
temp=i;
n=i;
while(i!=0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if (temp==c)
{
System.out.println(i);

}
}
}}
