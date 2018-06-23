public class Client extends Person {
	Client(){
		System.out.println("class name  Client");
	}
	IdCard idCard=new IdCard();
	Service service=new Service();
	Service[] services=new Service[1];
}