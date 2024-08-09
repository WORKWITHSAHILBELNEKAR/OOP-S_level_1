public class Circle {
    public static void main(String[] args) {
        Circle radius = new Circle();
        radius.Area(5);
        radius.Circumference(5);
    }
    float num;
    public void Area (float num){
        double AreaCircle = Math.PI * num * num;
        System.out.println("the area of circle is " + AreaCircle);
    }
    public void Circumference (float num){
        double CircumferenceCircle = 2 * Math.PI * num;
        System.out.println("the circumference of circle is " + CircumferenceCircle);
    }
}
