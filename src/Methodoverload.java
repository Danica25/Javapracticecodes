
class checkcode{
    public void add(int i,int j){
        System.out.println(i+j);
        }
    public void add(int i,int j,int k){
        System.out.println(i+j);
    }

        }
public class Methodoverload {
    public static void main(String[] args){
        checkcode obj = new checkcode();
        obj.add(6,7);
        obj.add(6,7,8);
    }
}
