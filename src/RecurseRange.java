public class RecurseRange {
    public static void main(String[] args) {
        RecurseRange recurseRangee = new RecurseRange();
        var val = recurseRangee.recursivRange(6);
        System.out.println("recurise vale is "+val);

    }

    public int recursivRange(int num){
        if ( num ==0){
            return 0;
        }
        return num+ recursivRange(num -1);
    }
}
