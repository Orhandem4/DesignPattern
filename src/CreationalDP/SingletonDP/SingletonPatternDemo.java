package CreationalDP.SingletonDP;

public class SingletonPatternDemo {

    public static void main(String[] args) {

//        SingletonObject object = new SingletonObject();
        SingletonObject obj1 = SingletonObject.getInstance();
        System.out.println(obj1.message); // Merhaba
        obj1.changeMessage(); // obj1 ----> message = Merhaba Batch 130-131-138

        //2.obje yi uretiyorum
        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.println(obj2.message); // Merhaba Batch 130-131-138


    }
}
