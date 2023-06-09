public class Monomial {
    private int grad;
    private double coef;

    public Monomial() {
        grad = 0;
        coef = 0;
    }
    public Monomial(double coef, int grad) {
        this.coef = coef;
        this.grad = grad;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }
}
