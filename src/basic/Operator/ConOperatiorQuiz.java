package basic.Operator;

public class ConOperatiorQuiz {
    public static void main(String[] args) {
            /*
         - 42 ~ 396사이의 난수를 발생시킨 후
         발생한 난수가 홀수인지 짝수인지의 여부를
         3항 연산식으로 출력해 보세요.
         ex)
         발생한 난수: XX
         3항 연산의 결과: 홀수입니다. or 짝수입니다.
        */

        int rn = (int)(Math.random()*355+ 42);
        String result = ((!(rn % 2 == 0)) ? "홀수 입니다" : "짝수 입니다");
        System.out.println("발생한 난수: " + rn);
        System.out.println("삼항 연산의 결과는: " + result);
    }
}
