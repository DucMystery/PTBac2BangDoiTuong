public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double r1;
    private double r2;

    public QuadraticEquation(double a,double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
       return   delta =b*b-4*a*c;
    }

    public double getRoot1(){
        if (delta>=0){
          return   r1 =(-b+Math.sqrt(delta))/2*a;
        }else {
          return r1 =0;
        }
    }

    public double getRoot2() {
        if (delta >= 0) {
          return   r2 =(-b-Math.sqrt(delta))/2*a;
        } else {
          return r2 =0;
        }
    }

}
