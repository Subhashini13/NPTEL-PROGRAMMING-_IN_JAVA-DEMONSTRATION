//Dynamic binding   .......... RUNTIME POLYMORPHISM

//Method overiding
class Cat{
	void speak(){
		System.out.println("MEOW");
	}
}
class PetCat extends Cat{
	void speak(){
		System.out.println("mEOw");
	}
}
class MagicCat extends Cat{
	static boolean Noone;
	void speak(){
		if(Noone)
			super.speak();
		else
			System.out.println("HI  ........");
	}
}

class Demonstration_64{
	public static void main(String args[]){
		PetCat c1 = new PetCat();
		MagicCat c2 = new MagicCat();
		c2.Noone= true;
		c2.speak();
		c1.speak();
		c2.Noone = false;
		c2.speak();
	}
}
		
		
	