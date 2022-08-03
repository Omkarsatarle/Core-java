class StringEx
{
        public static void main(String[]arg)
{
        String a="Hello";  //LITERAL
        String b="Om";
        String c=new String("GOOD"); //OBJECT
        String d=new String("GOOD");
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a==c);
        System.out.println(b.equals(a));
        System.out.println(d.equals(c));
        System.out.println(c.equals(a));



}
}