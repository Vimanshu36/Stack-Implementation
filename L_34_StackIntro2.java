public class L_34_StackIntro2 {
    public static void main (String[] args) throws Exception {
        L_34_StackIntro1 s = new L_34_StackIntro1(3);

        //push
        s.push(3);
        s.push(2);
        s.push(1);
        s.display();
       
        System.out.println( s.peek());

        //pop
        s.pop();
        s.pop();
        s.pop();
        //Empty stack
        s.display();

        s.push(3);
        s.display();
    }
}
