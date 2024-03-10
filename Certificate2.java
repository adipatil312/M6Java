class Certificate2
{
public static void main(String [] args)
{
String s1="1.DATABASE";
String s2="2.THEORY OF COMPUTATION";
String s3="3.SYS. PROG & OPERATING SYS.";
String s4="4.INT. OF THINGS ";
String s5="5.COMPUTER NETWORK";
int m=100;
int Tm=500;
int m1=70;
int m2=65;
int m3=75;
int m4=80;
int m5=70;
int Om=m1+m2+m3+m4+m5;
float perc=(Om*100)/Tm;
String grade=(perc>=0&& perc<35)?("F"):(perc>=35&&perc<=65)?("B"):(perc>65 && perc<=85)?("A"):(perc>85 && perc<=100)?("A+"):(" ");
System.out.println("");
System.out.println("---------------------------------------------------------------------------------------------------------------------");
System.out.println("                            Savitribai Phule Pune Univercity");

System.out.println();

System.out.println("                                Maharashtra State Board");

System.out.println();

 
System.out.println("   Name:Patil Aditya Dhananjay"+"                                                                  "+"Date:21/02/2024");
System.out.println("   Roll No:T190754308"+"               "+"Sec:A"+"                                                        "+"Exam:Sem");
System.out.println("---------------------------------------------------------------------------------------------------------------------");
System.out.println("   Subject"+"                                       "+"Total Marks"+"                                          "+"Marks Obtained");
System.out.println( s1+"                                         "+m+"                                                         "+m1);
System.out.println();

System.out.println(    s2+"                             "+m+"                                                         "+m2);
System.out.println();
System.out.println(    s3+"                                         "+m+"                                                         "+m3);
System.out.println();
System.out.println(    s4+"                                         "+m+"                                                         "+m4);
System.out.println();
System.out.println(    s5+"                                         "+m+"                                                         "+m5);
System.out.println();
System.out.println();
System.out.println("   Total Subject:5                        Total Marks:"+Tm+"                              Total Mark Obtained:"+Om);
System.out.println("---------------------------------------------------------------------------------------------------------------------");
System.out.println("   Percentage:"+perc+"                                                                  Grade:"+grade);
System.out.println("");
System.out.println("   Remark:Excellent"+"                                                                   "+"Signature");



} 
}
