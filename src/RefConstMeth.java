public class RefConstMeth {
    public RefConstMeth(String str) {
        System.out.println("I entered"+ str);
    }

    public static void main(String[] args) {
        TestRef2 testRef = RefConstMeth::new;
        testRef.message("Hello");
    }
}
