public class PostageCalculator {
    public static float calculator(Package p){
        float total = 3.75F;
        if(p.getWeightInPounds() > 40){
            double temp = p.getWeightInPounds() - 40;
            total += (40 / .1) * .1;
            total += (temp / .1) * .05;
        }else total += (p.getWeightInPounds() / .1) * .05;
        short code = Short.parseShort(p.getOrigin().getZip().substring(0,3));
        short code2 = Short.parseShort(p.getDestination().getZip().substring(0,3));
        if(code > code2) total += (float)(code - code2)/100;
        else total += (float)(code2 - code)/100;
        if(p.getWidth() + p.getHeight() + p.getLength() > 36) total += (p.getWidth() + p.getHeight() + p.getLength()) * .10;
        return total;
    }
    public static float calculator(int zip, int zip2, int weight, int length, int width, int height){
        zip = zip/100;
        zip2 = zip2/100;
        float total = 3.75F;
        if(weight > 40){
            double temp = weight - 40;
            total += (40 / .1) * .1;
            total += (temp / .1) * .05;
        }else total += (weight / .1) * .05;
        if(zip > zip2) total += (float)(zip - zip2)/100;
        else total += (float)(zip2 - zip)/100;
        if(width + height + length > 36) total += (width + height + length) * .10;
        return total;
    }
    public static float calculator(Address a, Address b, int weight, int length, int width, int height){
        int zip = Integer.parseInt(a.getZip());
        int zip2 = Integer.parseInt(b.getZip());
        zip = zip/100;
        zip2 = zip2/100;
        float total = 3.75F;
        if(weight > 40){
            double temp = weight - 40;
            total += (40 / .1) * .1;
            total += (temp / .1) * .05;
        }else total += (weight / .1) * .05;
        if(zip > zip2) total += (float)(zip - zip2)/100;
        else total += (float)(zip2 - zip)/100;
        if(width + height + length > 36) total += (width + height + length) * .10;
        return total;
    }
}