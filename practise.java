public class practise {
    static void area(double radi){
        double pi= 3.14, area;
        area=pi*radi*radi;
        System.out.println("Area="+area);
    }

    static void peri(double radi){
        double pi= 3.14, peri;
        peri=2*pi*radi;
        System.out.println("Peri="+peri);

    }
    public static void main(String[] args){
        double radi= 4;
        area(radi);
        peri(radi);

    }


    
}
