import java.io.*;
import java.util.*;
class Prime
{
public static void main(String args[])
{
int i=0;
int num=0;
String pm=" ";
for(i=0;i<=100;i++)
{
int counter=0;
for(num=i;num>-1;num--)
{
if(i%num==0)
{
counter=counter+1;
}
}
if(counter==2)
{
pm=pm+i+" ";
System.out.print(pm);
}
else
System.out.print("no pm");
}
}
}


