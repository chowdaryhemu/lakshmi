class CommonElements
{
public static void main(String[]args)
{
int a1[][]= {{1,2,3},{3,2,1}};
int a2[][]= new int[2][3];
for(int i=0;i<a1.length;i++)
{
for(int j=0;j<a1.length;j++)
{
if(a2[i]==a2[j])
{
System.out.println(a1[i][j]);
}
}
}
}
}
