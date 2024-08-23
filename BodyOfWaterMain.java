public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake", 52.0, 12.0, false);
        BodyOfWater b1 = new BodyOfWater("Pool", 6.0);

        System.out.println(b.name());
        System.out.println(b.largestDiamter());
        System.out.println(b.avgDepth());
        System.out.println(b.isSaltWater());

        System.out.println(b1.name());
        System.out.println(b1.avgDepth());

        b1.setName("Puddle");
        System.out.println(b1.name());
    }
}
