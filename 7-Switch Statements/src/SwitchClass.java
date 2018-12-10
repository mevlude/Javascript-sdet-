//
//public class SwitchClass {
//
//	public static void main(String[] args) {
//		int switchValue=3;
//		
//		switch(switchValue) {
//		case 1:
//			System.out.println("value is 1");
//			break;
//		case 2:
//			System.out.println("value is 2");
//			break;
//		case 3: case 4: case 5:
//			System.out.println("value is 3 or 4 or 5");
//			//break;//if any break commented the out put will be that case and default together
//		default:
//			System.out.println("value is not correct");
//			break;
//		}
//	}
//
//}




public class SwitchClass {

	public static void main(String[] args) {
		char character='A';
		
		switch(character) {
		
		case 'A': case 'B': case 'C': case 'D': case 'E':
			System.out.println(character+" is found");
			break;//if any break commented the out put will be that case and default together
		default:
			System.out.println("Character couldn't be found");
			break;
		}
	}

}

