public class AccessControl {
    int length;
    static int count;
    AccessControl(int a){
        length = a;
        count++;
    }
    public int getVaue(int l){
        length = l;
        count++;
        return count;
    }
    static{
        count = 0;
    }
}
