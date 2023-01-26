package pack3;

public class A {
static int s =70;
public static void show() {
	System.out.println("HEllo");
}

public static void main(String[] args) {
	
	s=70;
	show();
	
}

static {
	System.out.println("FIRST");
}

}
