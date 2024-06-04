class Abstract2 extends Abstract1{
    void meth1(){
         System.out.println("Abstract method overriden");
    }
    public static void main(String[] args){
    Abstract1 aobj=new Abstract2();
        aobj.meth1();
        aobj.meth2();
    }

}