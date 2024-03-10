class AlphabetOrNot1
{
public static void main(String [] args)
{
char c='2';
String result=(c>='a'&&c<='z'||c>='A'&&c<='Z')?("Given char is alphabet"):("Given char is not alphabet");
System.out.println(result);
}
}
