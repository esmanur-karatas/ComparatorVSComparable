import java.util.List;

public class Phone implements Comparable<Phone> {
	private String brand;
	private String model;
	private int ram;
	private int hafiza;
	private int cikisYili;
	
	public Phone(String brand, String model, int ram, int hafiza, int cikisYili) {
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.hafiza = hafiza;
		this.cikisYili = cikisYili;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHafiza() {
		return hafiza;
	}

	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}

	public int getCikisYili() {
		return cikisYili;
	}

	public void setCikisYili(int cikisYili) {
		this.cikisYili = cikisYili;
	}

	@Override 
	public String toString() {
		return "Marka:" + brand + "\tModel:" + model + "\tRAM:" + ram +"GB" + "\tHafıza:" + hafiza +"GB" + "\tÇıkış Yılı:" + cikisYili;
	}

	@Override
	public int compareTo(Phone o) {
		if(cikisYili > o.cikisYili) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public static void PhoneWrite(List<Phone> phones) {
		for(Phone phone: phones) {
			System.out.println(phone);
		}
	}
}
