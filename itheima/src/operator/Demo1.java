package operator;

public class Demo1 {
    public static void main(String[] args) {
        // 自增和自减运算符 ++ --
        int a = 10;
        a++;
        System.out.println(a);

        int b = 10;
        b--;
        System.out.println(b);

        // 运算符放到变量前面，先运算后执行表达式，放在变量后面，先执行表达式后运算
        System.out.println("------------------------------");
        // 先+1 后 -1 再使用
        int i = 10;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);

        // 先使用在 +1 -1
        int m = 10;
        int n = m++;
        System.out.println(m);
        System.out.println(n);
    }
}
