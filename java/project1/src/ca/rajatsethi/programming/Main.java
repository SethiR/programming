package ca.rajatsethi.programming;

public class Main {
    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];

        for (MathEquation equation : equations) {
            equation = new MathEquation(2.0, 2.1, 'a');
            equation.execute();
            System.out.println(equation.getResult());
        }

        System.out.println("Using overlaods");
        MathEquation overload = new MathEquation('a');
        overload.execute(10.1, 20.5);
        System.out.println(overload.getResult());

        MathEquation overload1 = new MathEquation('a');
        overload1.execute(10, 20);
        System.out.println(overload1.getResult());
    }


//    public static MathEquation create(double leftVal, double rightVal, char opCode){
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//        return equation;
//    }

}