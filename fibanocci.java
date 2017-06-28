import java.io.*;

import java.util.*;

class fibanocci{
public static void main(String[] args){
int n1=-1,n2=1,n3,n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for (int i=1;i<n;i++)
{
n3=n1+n2;
System.out.println(n3);

n1=n2;
n2=n3;
}
}
}
