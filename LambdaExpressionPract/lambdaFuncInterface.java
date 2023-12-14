package LambdaExpressionPract;

@FunctionalInterface
interface carEngineCC
{
    public void EngineCC(int cc);
}

public class lambdaFuncInterface {
    public static void main(String[] args) {
        int cc = 350;
        carEngineCC c = (Ecc)->{System.out.println("Engine CC"+Ecc);};
        c.EngineCC(cc);
    }
}
