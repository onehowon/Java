package objective;

class resetMember {
    static{
        System.out.println("static { }");
    }
    {
        System.out.println("{ }");
    }
    public resetMember(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("resetMember = new;");
        resetMember bt = new resetMember();

        System.out.println("resetMember = new resetMember()");
        resetMember bt2 = new resetMember();
    }
}
