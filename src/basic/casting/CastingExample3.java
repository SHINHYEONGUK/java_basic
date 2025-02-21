package basic.casting;

public class CastingExample3 {
    public static void main(String[] args) {


        char c = 'B';
        int i = 2;

        // 서로 다른 타입간의 연산은 작은 쪽이 큰 쪽을 따라간다.


        int intResult = c + i;
        char charResult = (char) (c + i);

        /// /////////////////////////


        // int와 int의 연산은 결과가 int
        // double의 연산을 위해 직접 형 변환

        int k = 10;
        double d = (double) k / 4; //double d = k / 4.0;과 연산 결과 같음
        System.out.println("d = " + d);
        // 결과값 : 2.5


    }
}
