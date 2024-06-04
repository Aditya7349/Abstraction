 abstract class Abstract1{
    abstract void meth1();
    void meth2(){
        System.out.println("Class A meth1()");
        this.display();
    }
    static void meth3(){
        System.out.println("Class A meth3()");
    }
    void display(){
        System.out.println("hello class A");
    }
    Abstract1(){
        System.out.println("class A constructor");
    }
    public static void main(String args[]){
        System.out.println("java is awesome");
        Abstract1.meth3();
    }

    
}