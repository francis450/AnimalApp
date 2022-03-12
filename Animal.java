abstract class Animal{

	private String names;

	public void setName(String name){
		names = name;
	}

	public String getName(){
		return names;
	}

	public void breath(){
		System.out.println("A "+names+" is  Breathing!");
	}

	public void eat(){
		System.out.println("A "+names+" is eating!");
	} 

	public void excrete(){
		System.out.println("A "+ names+" is excreting!");
	}
}