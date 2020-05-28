public class Bytecode_jvm {

    // using static compiler
    static int count=0;
    public void increment()
    {
        count++;
    }
    public static void main(String args[])
    {
        Bytecode_jvm obj1=new Bytecode_jvm();
        Bytecode_jvm obj2=new Bytecode_jvm();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
    }

}
