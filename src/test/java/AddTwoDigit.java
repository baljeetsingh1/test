public class AddTwoDigit {
    int i =10;
    int j = 22;
    int c = i+j;
    void show(){
        System.out.println(this.c);
    }
    void again(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        AddTwoDigit addTwoDigit = new AddTwoDigit();
        addTwoDigit.show();
    }
}
