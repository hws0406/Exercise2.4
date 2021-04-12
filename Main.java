public class Main {

	public static void main(String[] args) {
		
		Laptop d = new Laptop();
		d.setBrand("Inspiron 14");
		d.setModel("7400");
		d.setColor("Silver");
		d.setProcessor("11th Gen Intel Core i7");
		d.setSize(15.6);
		d.setWeight(1.35);
		d.setHeight(0.70);
		d.setWidth(12.66);
		d.setDepth(8.84);
		d.setPrice(4599);
		
		System.out.println("--DELL--");
		System.out.println("Brand: " + d.getBrand());
		System.out.println("Model: " + d.getModel());
		System.out.println("Color: " + d.getColor());
		System.out.println("Processor: " + d.getProcessor());
		System.out.println("Size: " + d.getSize() + "inches");
		System.out.println("Weight: " + d.getWeight() + "g");
		System.out.println("Height: " + d.getHeight() + "inches");
		System.out.println("Width: " + d.getWidth() + "inches");
		System.out.println("Depth: " + d.getDepth() + "inches");
		System.out.println("Price: RM" + d.getPrice());
		d.Promotion();
		
		System.out.println();
		
		Laptop v = new Laptop();
		v.setBrand("Zenbook 14");
		v.setModel("UX425");
		v.setColor("Grey");
		v.setProcessor("11th Gen Intel Core i7");
		v.setSize(14);
		v.setWeight(1.13);
		v.setHeight(0.54);
		v.setWidth(12.50);
		v.setDepth(8.18);
		v.setPrice(3999);	
		
		System.out.println("--ASUS--");
		System.out.println("Brand: " + v.getBrand());
		System.out.println("Model: " + v.getModel());
		System.out.println("Color: " + v.getColor());
		System.out.println("Processor: " + v.getProcessor());
		System.out.println("Size: " + v.getSize() + "inches");
		System.out.println("Weight: " + v.getWeight() + "g");
		System.out.println("Height: " + v.getHeight() + "inches");
		System.out.println("Width: " + v.getWidth() + "inches");
		System.out.println("Depth: " + v.getDepth() + "inches");
		System.out.println("Price: RM" + d.getPrice());
		d.Promotion();
	}
}
