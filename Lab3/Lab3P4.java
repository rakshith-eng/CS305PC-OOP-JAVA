class Lab3P4{
	public static void main(String...args){
		Lab3P4 OL = new Lab3P4();
		OL.show();
		OL.show(10);
		OL.show("String");
		OL.show(12,"nani");
	}
	public void show(){
		System.out.println("method without parameters");
	}
	public void show(int x){
		System.out.println("method without parameters");
	}
	public void show(String s){
		System.out.println("method without parameters");
	}
	public void show(int x,String s){
		System.out.println("method without parameters");
	}
}
