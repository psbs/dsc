## DSC Experiments

### Tasks:

-- Reading/validating X.509 Public key certificate Standard information including Version 3 Extensions

  1. VALIDATE THE CLASS OF X.509 TYPE DIGITAL SIGNATURE(CLASS I, CLASS II, CLASS III) --READ CERTIFICATE Policy information: 2.16.356.100.2.3 means CLASS III

  2. SETUP THE trusted CA ROOT certificate as TRUST ANCHOR. 

  3. Validate that all certificates in CHAIN are not expired with topmost certificate being TRUST ANCHOR certificate.

  4. VALIDATE THE PURPOSE OF X.509 CERTIFICATE --X509Certificate.KeyUsage--(Distinguish between DIGITAL_SIGNATURE and KEY_ENCIPHERMENT certificates)

  5. CRL validation (extract the CRL distribution point from the certificate (if available) and to check whether the certificate is not revoked) 

  6. ENCRYPT AND DECRYPT LARGE TEXT WITH AES SYMMETRIC ENCRYPTION  

  7. ENCRYPT AND DECRYPT PDF and EXCEL FILES WITH AES SYMMETRIC ENCRYPTION  

  8. PROGRAM FOR ENCRYPTING TEXT/FILE USING AES.THEN ENCRYPT AES KEY USING RSA PUBLIC KEY FROM WINDOWS KEYSTORE.  
  
  9. PROGRAM FOR DECRYPTING AES KEY USING RSA PRIVATE KEY. THEN DECRYPT TEXT/FILE USING AES KEY.  

### Tutorials/Resources to refer:

- GUIDELINES

  - http://cca.gov.in/cca/sites/default/files/files/Guidelines/CCA-IOG.pdf --- Refer page 96 

  - http://nicca.nic.in/pdf/niccacps.pdf

- HINTS

  - use BouncyCastle java api where required

- GIT BASICS(optional)

  - https://www.udacity.com/course/how-to-use-git-and-github--ud775

- UNDERSTANDING PKI(PUBLIC KEY INFRASTRUCTURE)
 
  - https://ssd.eff.org/en/module/deep-dive-end-end-encryption-how-do-public-key-encryption-systems-work

  - https://technet.microsoft.com/en-us/library/aa998077(v=exchg.65).aspx 

  - https://technet.microsoft.com/en-us/library/bb123848(v=exchg.65).aspx 

  - https://msdn.microsoft.com/en-us/library/windows/desktop/aa388452(v=vs.85).aspx 

  - https://india.emc.com/emc-plus/rsa-labs/standards-initiatives/what-is-the-factoring-problem.htm

- Concepts of X.509 PKI certificates

  - https://msdn.microsoft.com/en-us/library/windows/desktop/bb540819(v=vs.85).aspx

  - https://msdn.microsoft.com/en-us/library/windows/desktop/bb540818(v=vs.85).aspx

- CREATING CERTIFICATE

  - https://www.mayrhofer.eu.org/create-x509-certs-in-java 

  - http://www.cca.gov.in/cca/ 

  - https://docs.oracle.com/cd/E19509-01/820-3503/ggeyj/index.html 

  - https://docs.oracle.com/cd/E19509-01/820-3503/ggezu/ 

  - http://keystore-explorer.org/ 

- VALIDATING CERTIFICATE using JAVA

  - https://stackoverflow.com/questions/6629473/validate-x-509-certificate-against-ca-in-java 

  - http://www.nakov.com/blog/2009/12/01/x509-certificate-validation-in-java-build-and-verify-chain-and-verify-clr-with-bouncy-castle/

  - https://stackoverflow.com/questions/33493109/java-security-x509-certificate-verification-with-public-key

  - https://stackoverflow.com/questions/2457795/x-509-certificate-validation-with-java-and-bouncycastle

  - https://github.com/nandosola/trantor-certificate-verifier

  - https://stackoverflow.com/questions/40613147/how-to-get-the-policy-identifier-and-the-subject-type-of-basic-constraints-in-a

- RSA ASYMMETRIC ENCRYPTION/DECRYPTION using JAVA

  - http://niels.nu/blog/2016/java-rsa.html 

  - https://javadigest.wordpress.com/2012/08/26/rsa-encryption-example/

- AES SYMMETRIC ENCRYPTION/DECRYPTION using JAVA
  - https://www.quickprogrammingtips.com/java/how-to-encrypt-and-decrypt-data-in-java-using-aes-algorithm.html 

  - https://www.mkyong.com/java/java-symmetric-key-cryptography-example/ 

  - https://gist.github.com/bricef/2436364

- STUDY WANNACRY RSA/AES METHODOLOGY
  - https://medium.com/threat-intel/wannacry-ransomware-decryption-821c7e3f0a2b

- HOW SSL WORKS
  - http://sudhakar.online/programming/2015/08/09/https.html




