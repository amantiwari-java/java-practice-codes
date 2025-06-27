public class Main{
    public static void main(String[] args) {

        Wall a = new Wall(5,4);
        System.out.println("Wall with pojo --> " + a.getArea());


        WallR b = new WallR(5,4);
        System.out.println("Wall with record --> " + b.getArea());

        a.setHeight(-1.5);
        System.out.println("This can only done by pojo");
         System.out.println("width= " + a.getWidth());
          System.out.println("height= " + a.getHeight());
          System.out.println("area= " + a.getArea());
    }
}
