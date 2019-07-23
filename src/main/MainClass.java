package main;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;

import javax.crypto.Cipher;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		KeyStore ks = KeyStore.getInstance("Windows-MY");
	    ks.load(null, null); 
	    
	    Enumeration<String> aliases = ks.aliases();
        while(aliases.hasMoreElements()){
            System.out.println(aliases.nextElement());
        }  
        
        String alias="certalias";
        String dsc_password="";
        
        PrivateKey privKey = (PrivateKey) ks.getKey(alias, dsc_password.toCharArray());
	    System.out.println("PRIV KEY: "+privKey);
        
        Certificate cert = ks.getCertificate(alias);
        System.out.println("PUB KEY: "+Base64.getEncoder().encodeToString(cert.getPublicKey().getEncoded()));
        
        PublicKey pp=cert.getPublicKey();
        
        X509Certificate cert1 = (X509Certificate) cert;   
        
//        try {
//            cert1.checkValidity();
//        } catch (CertificateExpiredException ce) {
//        	System.out.println("EXPIRED");
//        } catch (CertificateNotYetValidException cny) {
//        	System.out.println("NOT YET VALID: ");
//        }
        
        Date certNotAfter = cert1.getNotAfter();
        
        System.out.println(certNotAfter);
        
        System.out.println(cert1.getType());
        
        System.out.println(cert1.getExtendedKeyUsage());
        
        String text_to_encrypt="sample text";
        
        String encrypted_text=encrypt(text_to_encrypt,pp);
        
        System.out.println(encrypted_text);
        
        
        

}
	
	public static String encrypt(String plainText, PublicKey publicKey) throws Exception {
	    Cipher encryptCipher = Cipher.getInstance("RSA");
	    encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

	    byte[] cipherText = encryptCipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));

	    return Base64.getEncoder().encodeToString(cipherText);
	}
	

	
}
