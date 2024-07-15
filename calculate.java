public class calculate {
    public float calculator(long num1,long num2,String opr){
        switch (opr) {
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "x":
                return num1*num2;
            case "/":
                float l=num2;
                return num1/l;
            case "^":
                float res=(float)Math.pow(num1, num2);
                return res;
            default:
                return 0;
        }
    }
}
