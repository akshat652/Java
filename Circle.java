public class Circle {
    static void area(double num) {
        double pi= 3.14, area;
		area =pi*num*num;
		System.out.println("Area of circle: "+area);
	}

    static void peri(double num){
        double pi=3.14, peri;
        peri= 2*pi*num;
        System.out.println("Perimeter of circle: "+peri);
    
    }

    public static void main(String[] args){
        
        double num= 4;
        area(num);
        peri(num);
        
    }
}