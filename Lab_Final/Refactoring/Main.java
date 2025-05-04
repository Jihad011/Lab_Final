class Main{
    public static void main (String[]args){
        Employee manager=new Manager(2,20000,5000,2500);
        System.out.println(manager.payAmount());
        Employee salesman=new Salesman(1,10000,2500,1500);
        System.out.println(salesman.payAmount());
        Employee engineer=new Enigineer(0,15000,3000,2000);
        System.out.println(engineer.payAmount());
    }
}