package EstructurasPatrones.Prototype;

public class ConcretePrototype1 {
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;

    public ConcretePrototype1(){}

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    @Override
    public Object clone(){
        ConcretePrototype1 clone = new ConcretePrototype1();
        clone.setAttribute1(this.getAttribute1());
        clone.setAttribute2(this.getAttribute2());
        clone.setAttribute3(this.getAttribute3());
        clone.setAttribute4(this.getAttribute4());
        clone.setAttribute5(this.getAttribute5());
        clone.setAttribute6(this.getAttribute6());
        clone.setAttribute7(this.getAttribute7());
        return clone;
    }
}
