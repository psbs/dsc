package main;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Base64;
import java.util.Enumeration;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		KeyStore ks = KeyStore.getInstance("Windows-MY");
	    ks.load(null, null); 
	    
	    Enumeration<String> aliases = ks.aliases();
        while(aliases.hasMoreElements()){
            System.out.println(aliases.nextElement());
        }  
        
        String alias="aliasname";
        String dsc_password="";
        
        PrivateKey privKey = (PrivateKey) ks.getKey(alias, dsc_password.toCharArray());
	    System.out.println("PRIV KEY: "+privKey);
        
        Certificate cert = ks.getCertificate(alias);
        System.out.println("PUB KEY: "+Base64.getEncoder().encodeToString(cert.getPublicKey().getEncoded()));
        

}
	

	
}
