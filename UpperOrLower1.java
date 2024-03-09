//for any given char

class UpperOrLower1
{
public static void main(String [] args)
{
char c='a';
String result=(c>=65&&c<=90||c>=97&&c<=122)?((c>=65&&c<=90)?("Char is in uppercase"):("Char is in lowercase")):("The given char is not alphabet"); 
System.out.println(result);
}
}
