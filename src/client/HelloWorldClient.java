package client;

public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            client.HelloWorldServiceLocator locator = new client.HelloWorldServiceLocator();
            HelloWorld_PortType service = locator.getHelloWorld();
            // If authorization is required
            //((HelloWorldSoapBindingStub)service).setUsername("user3");
            //((HelloWorldSoapBindingStub)service).setPassword("pass3");
            // invoke business method
            String str = service.sayHelloWorldFrom("China");
            System.out.println(str);
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
